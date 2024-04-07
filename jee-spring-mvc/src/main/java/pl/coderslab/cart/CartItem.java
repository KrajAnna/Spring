package pl.coderslab.cart;

import lombok.Data;

@Data
public class CartItem {
    private final Integer quantity;
    private final Product product;


}
