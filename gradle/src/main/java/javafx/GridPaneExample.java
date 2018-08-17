package javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // hierarchical graph of nodes
        Button button = new Button("Press");
        TextField textfield = new TextField();
        Label label = new Label();
        Circle circle = new Circle(50);

        //layout classes derive from Pane
        GridPane pane = new GridPane();
        pane.add(textfield, 0, 0);
        pane.add(button, 1, 0);
        pane.add(label, 0, 1);
        pane.add(circle, 0, 2);

        //add the parent node to the scene
        Scene scene = new Scene(pane, 400, 300);
        stage.setTitle("Main Application");

        //add the scene to the Stage; this is the top-level container
        stage.setScene(scene);
        stage.show();

        //events
        button.setOnAction(event -> circle.setVisible(circle.isVisible() ? false : true));

        //bindings
        label.textProperty().bind(textfield.textProperty());

        circle.fillProperty().bind(
                Bindings.createObjectBinding(
                        ()-> textfield.getText().matches("[0-9a-fA-F]{6}")?
                                Color.valueOf(textfield.getText()): Color.WHITE,
                        textfield.textProperty()));

    }
}