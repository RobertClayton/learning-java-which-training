package session;

import entity.Film;

import java.util.Collection;

public interface FilmDAO {
    Long insert(Film film);

    boolean update(Film film);

    boolean delete(long l);

    Film selectById(long l);

    Collection<Film> selectAll();

    Collection<Film> selectByTitle(String at);
}
