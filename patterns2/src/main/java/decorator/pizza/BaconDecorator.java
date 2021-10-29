package decorator.pizza;

public class BaconDecorator extends AbstractPizzaOrderDecorator {
    public BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", bacon";
    }
}