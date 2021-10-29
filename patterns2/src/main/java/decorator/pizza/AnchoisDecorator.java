package decorator.pizza;

public class AnchoisDecorator extends AbstractPizzaOrderDecorator {
    public AnchoisDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", anchois";
    }
}