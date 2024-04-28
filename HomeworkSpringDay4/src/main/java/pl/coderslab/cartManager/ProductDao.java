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

    private void addRandomProducts(){
        products.add(new Product(1L, "Jabłko", 0.25));
                products.add(new Product(2L, "Banan", 0.15));
                products.add(new Product(3L, "Marchew", 0.20));
                products.add(new Product(4L, "Daktyle", 0.75));
                products.add(new Product(5L, "Jajka", 2.10));
                products.add(new Product(6L, "Figa", 0.85));
                products.add(new Product(7L, "Winogrona", 2.50));
                products.add(new Product(8L, "Miód", 3.45));
                products.add(new Product(9L, "Lody", 1.10));
                products.add(new Product(10L, "Sok", 1.80));
    }

    public void addProduct (String name, double price ){
       products.add(new Product(findMaxId(), name, price));
    }

    public Long findMaxId (){
        return products.stream()
                .map(Product::getId)
                .max(Comparator.naturalOrder())
                .orElse(0L);
    }

//    public List<Product> getList(){
//        return products;
//    }
}
