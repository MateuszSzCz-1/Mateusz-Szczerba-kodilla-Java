package decorator.pizza;

public class FruttiDiMareDecorator extends AbstractPizzaOrderDecorator {
    public FruttiDiMareDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", mix of seafood";
    }
}