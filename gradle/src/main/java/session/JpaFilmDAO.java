package session;

import entity.Film;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collection;

public class JpaFilmDAO implements FilmDAO {

    @Override
    public Long insert(Film film) {
        Long id = 0L;
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(film); // persist a transient instance
        id = film.getId();
        // updates the database from the persistence context
        em.getTransaction().commit();
        em.close();
        return id;
    }

    @Override
    public boolean update(Film film) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(film); //a detached entity is changed to persistent
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean delete(long filmId) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Film film = em.find(Film.class, filmId);
        if (film == null) return false;
        em.getTransaction().begin();
        em.remove(film);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Film selectById(long id) {
        // get returns null if id not in database
        EntityManager em = EntityManagerUtil.getEntityManager();
        Film film  = em.find(Film.class, id);
        em.close();
        return film;
    }

    @Override
    public Collection<Film> selectAll() {
        EntityManager em = EntityManagerUtil.getEntityManager();
        String jpql = "select f from Film f order by f.title";
        TypedQuery<Film> query = em.createQuery(jpql, Film.class);
        Collection<Film> films = query.getResultList();
        em.close();
        return films;
    }

    @Override
    public Collection<Film> selectByTitle(String search) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        String jpql = "select f from Film f where lower(f.title) like :searchText order by f.title";
        TypedQuery<Film> query = em.createQuery(jpql, Film.class);
        query.setParameter("searchText", "%" + search.toLowerCase() + "%");
        Collection<Film> films = query.getResultList();
        em.close();
        return films;
    }
}
