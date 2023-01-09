package example.web.customer;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CustomerServiceTests {

    @Test
    void Customer_service_find_all_returns_non_empty() {
        ICustomerService cs = new ICustomerServiceImpl();

        Assert.notEmpty(cs.findAll(), "Collection must contain items");

    }
}
