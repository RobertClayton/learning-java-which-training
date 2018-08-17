package javafx;

//import fxml.table.model.Film;
import entity.Film;
import entity.Genre;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import session.JpaFilmDAO;
//import fxml.table.model.RestClient;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;

//Main applications extend Application.
//This class sets control layout programmatically. Alternative is a separate FXML file
public class SimpleTable extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    // Main runtime calls start(), passing in the primary Stage .
    // This is the top level Main container.
    @Override
    public void start(Stage primaryStage) {
        // Layout controls programmatically using a BorderPane
        BorderPane pane = new BorderPane();

        // add a TableView to the centre of the BorderPane
        // http://docs.oracle.com/javase/8/javafx/user-interface-tutorial/table-view.htm#CJAGAAEE
        TableView<Film> table = new TableView<>();
        pane.setCenter(table);

        // add a TableColumn
        TableColumn<Film, String> titleCol = new TableColumn<>("Title");
        table.getColumns().add(titleCol);
        titleCol.setPrefWidth(598);

        // The Scene class is the container for all content. It resides in a
        // Stage
        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Film List");
        primaryStage.show();

        /* PropertyValueFactory<S,T> is a convenience implementation of the Callback interface
         * where S is the TableView type and T is the TableColumn type. The constructor argument
         * is the property name, extracted reflectively from a given TableView row item. */
        titleCol.setCellValueFactory(new PropertyValueFactory<Film, String>("title"));


        /*Retrieve a a collection of films, create a new observable array list from this collection,
         * the pass the ObservableList into the TableView's setData method.
         * Changes to the ObservableList will automatically be displayed in the TableView.
         */

        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
        Film film1 = new Film("There's something about Mary", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
        Film film2 = new Film("There's something about Mark", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
        Film film3 = new Film("There's something about Martha", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
        Film film4 = new Film("There's something about Meral", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
        Film film5 = new Film("There's something about Martin", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
        jpaFilmDAO.insert(film1);
        jpaFilmDAO.insert(film2);
        jpaFilmDAO.insert(film3);
        jpaFilmDAO.insert(film4);
        jpaFilmDAO.insert(film5);

        Collection<Film> films = jpaFilmDAO.selectAll();

        ObservableList<Film> data = FXCollections.observableArrayList(films);
        table.setItems(data);


    }

}