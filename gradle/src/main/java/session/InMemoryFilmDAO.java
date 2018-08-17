package session;

import entity.Film;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class InMemoryFilmDAO implements FilmDAO {
    private Map<Long, Film> films;
    private AtomicLong currentId = new AtomicLong();
    private Serializer serializer;
    public InMemoryFilmDAO(Map<Long, Film> films) {
        this.films = films;
    }

    @Override
    public Long insert(Film film) {
        long id = currentId.incrementAndGet();
        film.setId(id);
        films.put(id, film);
        return film.getId();
    }

    @Override
    public boolean update(Film film) {
        films.get(film.getId()).setTitle(film.getTitle());
        return true;
    }

    @Override
    public boolean delete(long l) {
        return films.remove(l) != null;
    }

    @Override
    public Film selectById(long l) {
//        return films.get(l);

        return films
                .values()
                .stream()
                .filter(s->s.getId()==l)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Film> selectAll() {
        if (serializer != null)
            films = serializer.deserialize();
        return films.values();
    }

    @Override
    public Collection<Film> selectByTitle(String title) {
        return films
                .values()
                .stream()
                .filter(s -> s.getTitle().contains(title))
                .collect(Collectors.toList());

    }
}
