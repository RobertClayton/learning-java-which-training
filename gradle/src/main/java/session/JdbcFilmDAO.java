package session;

import entity.Film;

import java.util.Collection;

// jdbc java database connector
public class JdbcFilmDAO implements FilmDAO {
    @Override
    public Long insert(Film film) {
        return null;
    }

    @Override
    public boolean update(Film film) {
        return false;
    }

    @Override
    public boolean delete(long l) {
        return false;
    }

    @Override
    public Film selectById(long l) {
        return null;
    }

    @Override
    public Collection<Film> selectAll() {
        return null;
    }

    @Override
    public Collection<Film> selectByTitle(String at) {
        return null;
    }
}
