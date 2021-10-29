package decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String getIngredients() {
        return "Pizza with delicious tomato sauce, with cheese";
    }
}