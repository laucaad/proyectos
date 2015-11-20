/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Customer;

/**
 *
 * @author rafa
 */
public class CustomerDao {
    
    private Session sesion;
    
    public CustomerDao(){
        SessionFactory sessionFactory = CarteraHibernateUtil.getSessionFactory();
        this.sesion = sessionFactory.openSession();
    }
    
    public List<Customer> findAll(){
        Transaction transacion = this.sesion.beginTransaction();
        
        try{
            
            Query query = this.sesion.createQuery("from Customer");
            List list = query.list();
            transacion.commit();
            return list;
            
        }catch(Exception e){
            transacion.rollback();
            throw e;
        }
    }
    
    public Customer findById(){
        return null;
    }
}
