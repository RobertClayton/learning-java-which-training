package session;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.code.tempusfugit.concurrency.ConcurrentRule;
import com.google.code.tempusfugit.concurrency.RepeatingRule;
import com.google.code.tempusfugit.concurrency.annotations.Concurrent;

import com.google.code.tempusfugit.concurrency.annotations.Repeating;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.code.tempusfugit.concurrency.ConcurrentTestRunner;

import entity.Film;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

//http://tempusfugitlibrary.org/documentation/junit/load/
//@Ignore
public class ParallelTest {
    //    private static Map<Long, Film> films = new HashMap<>();
    private static Map<Long, Film> films = new ConcurrentHashMap<>();

    private static InMemoryFilmDAO sut = new InMemoryFilmDAO(films);

    @Rule
    public ConcurrentRule concurrently = new ConcurrentRule();
    @Rule
    public RepeatingRule repeatedly = new RepeatingRule();

    @Test
    @Repeating(repetition = 1000) //execute method 1000 times
    @Concurrent(count = 5) //in 5 threads
    public void insertFilmsConcurrently() {
        sut.insert(new Film());
    }

    @AfterClass
    public static void numberOfFilmsInserted() {
        assertEquals(5000, sut.selectAll().size());
    }
}