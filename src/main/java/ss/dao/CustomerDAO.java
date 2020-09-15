package ss.dao;

import java.util.List;
import ss.entity.Customer;

public interface CustomerDAO {
    public List<Customer> getCustomers(); 

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteVustomer(int theId);
}
