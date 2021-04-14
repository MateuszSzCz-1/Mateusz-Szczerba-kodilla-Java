
import com.kodilla.stream.beautification.Deco;
import com.kodilla.stream.beautification.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


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


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
