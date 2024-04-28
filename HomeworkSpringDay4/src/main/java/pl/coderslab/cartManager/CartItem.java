package pl.coderslab.cartManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class CartItem {
    private Integer quantity;
    private Product product;

    public void increaseQty (int qty){
        this.quantity += qty;
    }
}
