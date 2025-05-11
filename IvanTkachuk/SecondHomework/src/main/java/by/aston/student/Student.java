package main.java.by.aston.student;

import java.util.List;

public class Student {
    String name;
    List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Student(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}
