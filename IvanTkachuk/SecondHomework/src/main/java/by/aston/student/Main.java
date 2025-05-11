package main.java.by.aston.student;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Petr",List.of(
                        new Book("Book A", 300, 2001),
                        new Book("Book B", 150, 1999),
                        new Book("Book C", 200, 2021),
                        new Book("Book D", 400, 2005),
                        new Book("Book E", 250, 2010))),
                new Student("Alex",List.of(
                        new Book("Book F", 500, 2003),
                        new Book("Book G", 300, 1998),
                        new Book("Book H", 150, 2015),
                        new Book("Book I", 200, 2000),
                        new Book("Book J", 450, 2008))),
                new Student("Ivan",List.of(
                        new Book("Book K", 350, 1995),
                        new Book("Book L", 250, 2022),
                        new Book("Book M", 200, 2007),
                        new Book("Book N", 300, 2004),
                        new Book("Book O", 400, 2023)))
        );

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPage))
                .distinct()
                .filter(books -> books.getYear() >= 2000)
                .limit(3)
                .findAny()
                .ifPresentOrElse(book -> System.out.println("Year: " + book.getYear()),
                        () -> System.out.println("Book is empty")
                );

    }
}