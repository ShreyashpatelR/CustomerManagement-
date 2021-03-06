package ss.controller;

import ss.dao.CustomerDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ss.entity.Customer;
import ss.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/list")
	public String listCustomers(Model theModel) {
            List<Customer> theCustomers = customerService.getCustomer();
            theModel.addAttribute("customers",theCustomers);
            return "list-customer-view"; //"list-customers";			 
	}
        
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer",theCustomer);
        return "Add-customer-view";
    }
    
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        //System.out.println(" ---------------=-----------==-----------=-"+theCustomer.toString());
            
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";   
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel){ //
        Customer theCustomer= customerService.getCustomer(theId);
        theModel.addAttribute("customer",theCustomer);
        return "Add-customer-view";
    }
    
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId){
        customerService.deleteCustomer(theId);
        return "redirect:/customer/list";
    }
}
