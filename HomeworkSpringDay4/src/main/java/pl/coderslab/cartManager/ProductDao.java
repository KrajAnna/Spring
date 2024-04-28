package pl.coderslab.cartManager;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
@Getter
public class ProductDao {
    private final List<Product> products = new ArrayList<>();
    public void addProduct(String name, double price) {
        products.add(new Product(findMaxId()+1, name, price));
    }


    public Long findMaxId() {
        return products.stream()
                .map(Product::getId)
                .max(Comparator.naturalOrder())
                .orElse(1L);
    }

//    public List<Product> getList(){
//        return products;
//    }
}
