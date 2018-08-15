package session;

import entity.Film;

import java.util.Collection;
import java.util.Map;

public class InMemoryFilmDAO {

    private Film film;

    public InMemoryFilmDAO(Map<Long, Film> films) {
    }

    public void update(Film film) {
        this.film = film;
    }

    public void insert(Long film1) {
    }

//    @Override
//    public Collection<Film> selectByTitle(String partOfTitle) {
//        return films
//                .values()
//                .stream()
//                .filter(film -> film.getTitle().contains(partOfTitle))
//                .collect(Collectors.toList());
//    }
}
