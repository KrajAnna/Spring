package pl.coderslab.cartManager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class CartController {
    private final Cart cart;
    private final ProductDao productDao;

    @RequestMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", productDao.getProducts());
        return "products";
    }

    @RequestMapping("/addtocart")
    public String addtocart(@RequestParam Long id, @RequestParam(defaultValue = "1") int qty, Model model) {
        Optional<Product> product = productDao.getProducts().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        if (product.isPresent()) {
            addItemToCart(product.get(), qty);
            model.addAttribute("isPresent", true);
            model.addAttribute("product", product.get().getName());
        } else {
            model.addAttribute("isPresent", false);
            model.addAttribute("id", id);
        }
        return "add-to-cart";
    }


    private void addItemToCart(Product p, Integer qty) {
        cart.getCartItems().stream()
                .filter(cartItem -> p.getId().equals(cartItem.getProduct().getId()))
                .findFirst()
                .ifPresentOrElse(cartItem -> cartItem.increaseQty(qty), () -> cart.addToCart(new CartItem(qty, p)));
    }


    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cartItems", cart.getCartItems());
        //return PRODUCT_TEMPLATE.formatted(cart.getCartSize(), cart.getTotalQty(), cart.getTotalPrice());
        return "cart";
    }

    @GetMapping("/addProduct")
    public String displayForm() {

        return "add-product";
    }

    @PostMapping("/addProduct")
    @ResponseBody
    public String addProduct(@RequestParam String product, @RequestParam String price) {
        try {
            productDao.addProduct(product, Double.parseDouble(price));
            return "Produkt dodany do listy produktów";
        } catch (NumberFormatException e) {
            return "Niewłaściwy format ceny";
        }

    }

    @RequestMapping("/remove")
    public String removeProduct(@RequestParam String id) {
        cart.remove(Long.parseLong(id));
        return "cart";
    }

    private final static String PRODUCT_TEMPLATE = """
            W koszyku jest %s pozycji.
            W koszyku jest %s produktów.
            Wartość koszyka to: %s.
            """;

}
