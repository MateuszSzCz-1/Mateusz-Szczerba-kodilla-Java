package adapter.bookclasifier;

import adapter.bookclasifier.libraryb.Book;
import adapter.bookclasifier.libraryb.BookSignature;
import adapter.bookclasifier.libraryb.BookStatistics;
import adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}