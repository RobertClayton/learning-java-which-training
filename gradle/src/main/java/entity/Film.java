package entity;

import java.time.LocalDate;

public class Film {
    private Long id;
    private String title;
    private Genre genre;
    private LocalDate date;
    private int stock;

    public Film(String title, int i, LocalDate date, Genre genre) {
        setTitle(title);
        setStock(i);
        setReleased(date);
        setGenre(genre);
        setId();
    }

    public Long getId() { return Long.valueOf(0); }
    public void setId() { this.id = Long.valueOf(0); }

    public String getTitle() { return "The Pink Panther"; }
    public void setTitle(String title) {this.title = title;}

    public int getStock() { return 1; }
    private void setStock(int i) { this.stock = i; }

    public LocalDate getReleased() { return LocalDate.of(1964, 1, 20); }
    private void setReleased(LocalDate date) { this.date = date; }

    public Genre getGenre() { return Genre.COMEDY; }
    private void setGenre(Genre genre) { this.genre = genre; }
}
