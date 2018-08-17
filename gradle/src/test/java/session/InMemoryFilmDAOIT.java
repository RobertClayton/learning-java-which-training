package session;

import entity.Film;
import entity.Genre;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

//@Ignore
public class InMemoryFilmDAOIT {

    @Test
    public void test() {
        FilmDAO sut = new InMemoryFilmDAO();
        int intialSize = sut.selectAll().size();
        sut.insert(new Film());
        assertEquals(intialSize + 1,sut.selectAll().size());
    }
}