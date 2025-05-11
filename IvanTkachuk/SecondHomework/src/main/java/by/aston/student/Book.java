package main.java.by.aston.student;

import java.util.Objects;

public class Book {

    private String title;
    private Integer page;
    private Integer year;

    public Book(String title, Integer page, Integer year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return page == book.page &&
                year == book.year &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, page, year);
    }

    public Integer getPage() {
        return page;
    }

    public Integer getYear() {
        return year;
    }


}
