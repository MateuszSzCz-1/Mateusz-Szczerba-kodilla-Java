package decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    @Test
    public void testOnionWithAdditionalCheese() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        order = new CheeseDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(27, price);
        assertEquals("Pizza  with delicious tomato sauce, with cheese, onion", pizza);
    }

    @Test
    public void testThinPizzaWithAnchoisAndSalamiAndJalapeno() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AnchoisDecorator(order);
        order = new SalamiDecorator(order);
        order = new JalapenoDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(35, price);
        assertEquals(" Pizza  with delicious tomato sauce, with cheese, anchois, salamim, jalapeno", pizza);
    }

    @Test
    public void testTripleCricketsPizza() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new SalamiDecorator(order);
        order = new SalamiDecorator(order);
        order = new SalamiDecorator(order);

        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(35, price);
        assertEquals("Pizza  with delicious tomato sauce, with cheese, salami, salami, salami", pizza);
    }

    @Test
    public void testAllPossibleIngrendientsPizza(){
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AnchoisDecorator(order);
        order = new BaconDecorator(order);
        order = new CheeseDecorator(order);
        order = new FruttiDiMareDecorator(order);
        order = new JalapenoDecorator(order);
        order = new MushroomsDecorator(order);
        order = new OnionDecorator(order);
        order = new SalamiDecorator(order);


        //When
        String pizza = order.getIngredients();
        double price = order.getPrice();

        //Then
        assertEquals(59.5, price);
        assertEquals(" Pizza with delicious tomato sauce, with cheese, anchois, bacon,  cheese, mix of seafood, Jalapeno, mushrooms, onions, salami", pizza);

    }
}
