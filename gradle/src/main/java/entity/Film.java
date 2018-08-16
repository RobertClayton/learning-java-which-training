package entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Film{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING) private Genre genre;
    @Version private int version;

//    private Long id = null;
    private String title;
    private int stock;
    private LocalDate released;
//    private Genre genre;
//    private int version;

    public Film(String title, int stock, LocalDate released, Genre genre) {
        this.title = title;
        setStock(stock);
        this.released = released;
        this.genre = genre;
    }

    public Film() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return stock == film.stock &&
                Objects.equals(id, film.id) &&
                Objects.equals(title, film.title) &&
                Objects.equals(released, film.released) &&
                genre == film.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, stock, released, genre);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock can be less than 0.");
        } else {
            this.stock = stock;
        }
    }

    public LocalDate getReleased() {
        return released;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
