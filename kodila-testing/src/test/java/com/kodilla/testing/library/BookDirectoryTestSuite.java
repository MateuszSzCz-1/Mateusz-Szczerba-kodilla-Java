package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOfWithConditionEmptyResultList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Józek", "Grażyna", "741206754");
        Map<Book, LibraryUser> resultListOfZeroRentedBook = new HashMap<>();
        Set<Book> keySet = resultListOfZeroRentedBook.keySet();
        List<Book> resultListOfBooks = new ArrayList<>(keySet);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0, theListOfBooks0.size());
    }

    @Test
    void testListBooksInHandsOfWithConditionExactlyOneBook() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Józek", "Grażyna", "741206754");
        Book book4 = new Book("Book1", "Autor 1", 2019);
        Map<Book, LibraryUser> resultListOfOneRentedBook = new HashMap<>();
        resultListOfOneRentedBook.put(book4, libraryUser);
        Set<Book> keySet = resultListOfOneRentedBook.keySet();
        List<Book> resultListOfBooks = new ArrayList<>(keySet);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, theListOfBooks1.size());
    }

    @Test
    void testListBooksInHandsOfWithConditionExactlyFiveBooks() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Józek", "Grażyna", "741206754");
        Book book1 = new Book("book1", "author1", 2019);
        Book book2 = new Book("book2", "author2", 2018);
        Book book3 = new Book("book3", "author3", 2017);
        Book book4 = new Book("book4", "author4", 2016);
        Book book5 = new Book("book5", "author5", 2001);
        Map<Book, LibraryUser> resultListOfFiveRentedBook = new HashMap<>();
        resultListOfFiveRentedBook.put(book1, libraryUser);
        resultListOfFiveRentedBook.put(book2, libraryUser);
        resultListOfFiveRentedBook.put(book3, libraryUser);
        resultListOfFiveRentedBook.put(book4, libraryUser);
        resultListOfFiveRentedBook.put(book5, libraryUser);

        Set<Book> keySet = resultListOfFiveRentedBook.keySet();

        List<Book> resultListOfBooks = new ArrayList<>(keySet);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, theListOfBooks5.size());
    }
}
