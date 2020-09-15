/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ss.dao.CustomerDAO;
import ss.entity.Customer;

@Service
public class CustomerServicelmpl implements CustomerService{

    @Autowired
    public CustomerDAO customerDAO;
    
    
    @Override
    @Transactional
    public List<Customer> getCustomer() {
       return customerDAO.getCustomers(); 
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId); 
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteVustomer(theId);
    }
    
}
