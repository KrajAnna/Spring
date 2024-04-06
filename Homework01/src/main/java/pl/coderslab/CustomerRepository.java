package pl.coderslab;

import java.util.List;

public interface CustomerRepository {
    void add(Customer customer);
    void remove(Customer customer);
    List<Customer> downloadList();
}
