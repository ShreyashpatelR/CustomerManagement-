package ss.service;

import java.util.List;
import ss.entity.Customer;

public interface CustomerService {

    public void saveCustomer(Customer theCustomer);
    public List<Customer> getCustomer();

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
