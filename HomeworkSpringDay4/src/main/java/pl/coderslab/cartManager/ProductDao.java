package pl.coderslab.cartManager;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class ProductDao {
    private final List<Product> products = List.of(
            new Product(1L, "Jabłko", 0.25),
            new Product(2L, "Banan", 0.15),
            new Product(3L, "Marchew", 0.20),
            new Product(4L, "Daktyle", 0.75),
            new Product(5L, "Jajka", 2.10),
            new Product(6L, "Figa", 0.85),
            new Product(7L, "Winogrona", 2.50),
            new Product(8L, "Miód", 3.45),
            new Product(9L, "Lody", 1.10),
            new Product(10L, "Sok", 1.80)
    );

//    public List<Product> getList(){
//        return products;
//    }
}
