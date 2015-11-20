/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import DAO.CustomerDao;
import java.util.List;
import pojo.Customer;

/**
 *
 * @author rafa
 */
public class CustomerFacade {
    
    CustomerDao customerDao;
    
    public CustomerFacade(){
        this.customerDao = new CustomerDao();
    }
    
    public List<Customer> getListaClientes(){
        return customerDao.findAll();
    }
}
