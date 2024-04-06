package pl.coderslab.beans;

import org.springframework.stereotype.Component;
import pl.coderslab.Customer;
import pl.coderslab.CustomerLogger;
import pl.coderslab.CustomerRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private final Set<Customer> customers = new HashSet<>();
    private final CustomerLogger customerLogger;

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void add(Customer customer) {
        boolean result = customers.add(customer);
        customerLogger.log("add", result);
    }

    @Override
    public void remove(Customer customer) {
        boolean result = customers.remove(customer);
        customerLogger.log("remove", result);
    }

    @Override
    public List<Customer> downloadList() {
        customerLogger.log();
        return customers.stream()
                .toList();
    }
}
