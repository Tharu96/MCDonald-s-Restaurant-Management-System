/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mc.server.repository.custom.impl;

import java.io.Serializable;
import lk.mc.server.entity.Customer;
import lk.mc.server.repository.SuperRepositoryImpl;
import lk.mc.server.repository.custom.CustomerRepository;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public class CustomerRepositoryImpl extends SuperRepositoryImpl<Customer, Integer> implements CustomerRepository{

    public CustomerRepositoryImpl() {
        
    }    
}
