
import com.kodilla.good.patterns.challenges.ProductOrderService.ProductOrderService;

public class Run {
    public static void main(String[] args) {
        System.out.println("Product ordering service");
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.manageOrder();
        System.out.println("");
    }
}
