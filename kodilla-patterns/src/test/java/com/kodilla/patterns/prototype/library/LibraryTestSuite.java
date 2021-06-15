package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Test Library #1");
        Set<Book> books = library.getBooks();
        for (int i = 1; i <= 10; i++) {
            books.add(new Book("Book #" + i, "Writer #" + i,
                    LocalDate.now().minusDays(i).minusMonths(5 + i).minusYears(10 - i)));
        }

        Library clonedLib = null;
        try {
            clonedLib = library.shallowCopy();
            clonedLib.setName("Test Library #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLib = null;
        try {
            deepClonedLib = library.deepCopy();
            deepClonedLib.setName("Test Library #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        //Then
        for (Book book : library.books) {
            System.out.println(book.toString());
        }

        for (Book book : clonedLib.books) {
            System.out.println(book.toString());
        }

        for (Book book : deepClonedLib.books) {
            System.out.println(book.toString());
        }

        assertEquals(10, books.size());
        assertEquals(10, library.books.size());
        assertEquals(10, clonedLib.books.size());
        assertEquals(10, deepClonedLib.books.size());

        assertEquals(books.size(), library.getBooks().size());
        assertEquals(books.size(), deepClonedLib.getBooks().size());
        assertEquals(books.size(), clonedLib.getBooks().size());

    }
}