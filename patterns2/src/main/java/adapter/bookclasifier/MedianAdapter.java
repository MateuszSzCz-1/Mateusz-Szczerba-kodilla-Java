package adapter.bookclasifier;

import adapter.bookclasifier.librarya.Book;
import adapter.bookclasifier.librarya.Classifier;
import adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for (Book bookA : bookSet) {
            adapter.bookclasifier.libraryb.Book bookB =
                    new adapter.bookclasifier.libraryb.Book(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookMap.put(new BookSignature(bookA.getSignature()), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}