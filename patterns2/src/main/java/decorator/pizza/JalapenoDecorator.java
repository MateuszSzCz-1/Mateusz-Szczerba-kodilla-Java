package decorator.pizza;

public class JalapenoDecorator extends AbstractPizzaOrderDecorator {
    public JalapenoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Jalapeno";
    }
}