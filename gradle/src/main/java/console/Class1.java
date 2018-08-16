package console;

/*
Start point
 */

import entity.Film;
import entity.Genre;
import session.JpaFilmDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Class1 {
    /*
    first method called
    @param args command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Gradle application");


//        Film f = new Film();
//        Class filmClass = f.getClass();
//
//        for (Field field: filmClass.getFields()) {
//            System.out.println(field.getName());
//        }


//        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
//        Film film = jpaFilmDAO.selectById();
//        System.out.println(film.getTitle());


//        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
//        Collection<Film> films = jpaFilmDAO.selectByTitle("x");
//        films.forEach(f -> System.out.println(f.getTitle()));


//        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
//        Film film = new Film("There's something about Mary", 2, LocalDate.of(1997, Month.JANUARY, 1), Genre.COMEDY);
//        jpaFilmDAO.insert(film);
//        Collection<Film> films = jpaFilmDAO.selectByTitle("Mary");
//        films.forEach(f -> System.out.println(f.getTitle()));


//        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
//        Film film = jpaFilmDAO.selectById(5);
//        film.setStock(7);
//        jpaFilmDAO.update(film);


//        JpaFilmDAO jpaFilmDAO = new JpaFilmDAO();
//        boolean removed = jpaFilmDAO.delete(10);
//        System.out.println(removed);


//        List<String> lines = Files.readAllLines(path);
//        lines.forEach(System.out::println);
//        lines.forEach(s -> System.out.println(s));


//        try {
//            Path path = Paths.get("file.txt");
//            Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//            Files.write(path, zoneIds, StandardOpenOption.CREATE);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Path path = Paths.get("file.txt");
//        try(BufferedWriter writer = Files.newBufferedWriter(
//                path, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) {
//            writer.write("hello");
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }


//        Path path = Paths.get("file.txt");
//        try(BufferedReader reader = Files.newBufferedReader(path)) {
//            String line = null;
//            while(line = reader.readline() != null){
//                System.out.println(line);
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }




    }
}
