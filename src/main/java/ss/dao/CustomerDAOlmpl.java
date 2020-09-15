package ss.dao;

import java.util.List;
//import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ss.entity.Customer;

@Repository
public class CustomerDAOlmpl  implements CustomerDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName",Customer.class); 
        
        List<Customer> customers = theQuery.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        Session curreSession = sessionFactory.getCurrentSession();
        curreSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer theCustomer= currentSession.get(Customer.class,theId);
        return theCustomer;
    }

    @Override
    public void deleteVustomer(int theId) {
        Session curreSession = sessionFactory.getCurrentSession();
        Query theQuery  = curreSession.createQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", theId);
        theQuery.executeUpdate();
    }
    
}
