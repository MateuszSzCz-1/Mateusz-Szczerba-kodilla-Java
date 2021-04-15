
import com.kodilla.stream.beautification.Deco;
import com.kodilla.stream.beautification.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.ForumDirectory;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Sex;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        // ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        // expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        // System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        // PoemBeautifier poemBeautifier = new PoemBeautifier();

        //poemBeautifier.beautify("LA LA LA LA", Deco::decoWithSmileEmoji);
        //poemBeautifier.beautify("hej hej hej", Deco::decoToUppercase);
        //poemBeautifier.beautify("Raz Dwa Trzy", sentence -> sentence + "@@@@");
        //poemBeautifier.beautify("Ola ma kota", Deco::decoWithThreeDots);
        // poemBeautifier.beautify("a kot ma", Deco::decoWithHash);


        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);
       // BookDirectory theBookDirectory = new BookDirectory();
       // String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
         //       .filter(book -> book.getYearOfPublication() > 2005)
           //     .map(Book::toString)
             //   .collect(Collectors.joining(",\n", "<<", ">>"));                    // [2]
        //System.out.println(theResultStringOfBooks);
        ForumDirectory forum = new ForumDirectory();

        System.out.println("Using Stream to generate numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        Map<Integer, ForumUser> resultOfNaturalSelection = forum.getUserList().stream()
                .filter(user -> user.getSex().equals(Sex.M))
                .filter(user -> user.getYear() < 2003)
                .filter(user -> user.getNumberOfPublishedPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID, user -> user));

        System.out.println("Reminded forum users: " + resultOfNaturalSelection.size());
        resultOfNaturalSelection.entrySet().stream()
                .map(entry -> "ID #" + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
