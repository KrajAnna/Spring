package pl.coderslab.cartManager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class CartController {
    private final Cart cart;
    private final ProductDao productDao;

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart(@RequestParam Long id, @RequestParam(defaultValue = "1") int qty) {
        Optional<Product> product = productDao.getProducts().stream()
                .filter(p-> p.getId().equals(id))
                .findFirst();

        if (product.isPresent()){
            addItemToCart(product.get(), qty);
            return "Added to cart "+ product.get();
        } else {
            return "Product with ID: " + id + " not found";
        }

    }

    private void addItemToCart(Product p, Integer qty){
        cart.getCartItems().stream()
                .filter(cartItem -> p.getId().equals(cartItem.getProduct().getId()))
                .findFirst()
                .ifPresentOrElse(cartItem -> cartItem.increaseQty(qty), () -> cart.addToCart(new CartItem(qty, p)));
    }


    @RequestMapping("/cart")
    @ResponseBody
    public String cart() {
        return PRODUCT_TEMPLATE.formatted(cart.getCartSize(), cart.getTotalQty(), cart.getTotalPrice());
    }

    private final static String PRODUCT_TEMPLATE = """
            W koszyku jest %s pozycji.
            W koszyku jest %s produktów.
            Wartość koszyka to: %s.
            """;

}
