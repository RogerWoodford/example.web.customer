package example.web.customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ICustomerServiceImpl implements ICustomerService {
    ArrayList<Customer> customers;

    ICustomerServiceImpl()
    {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Roger", "Woodford"));
        customers.add(new Customer(2, "John", "Doe"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void deleteById(Long id) {
        customers.remove(id);
    }

    @Override
    public void update(Customer resource) {

    }

    @Override
    public Long create(Customer resource) {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer getById(Object id) {
        return null;
    }
}
