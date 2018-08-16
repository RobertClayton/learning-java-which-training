package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Film {
    private Long id = null;
    private String title;
    private int stock;
    private LocalDate released;
    private Genre genre;

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

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock can be less than 0.");
        } else {
            this.stock = stock;
        }
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getReleased() {
        return released;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
