package example.web.customer;

import java.util.List;
public interface ICustomerService {
    List<Customer> findAll();

    void deleteById(Long id);

    void update(Customer resource);

    Long create(Customer resource);

    Customer findById(Long id);

    Customer getById(Object id);
}
