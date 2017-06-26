/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author gilvan
 */
public class Supermarket extends User {
    
    private String address;
    private String phone;
    private String webSite;
    private int id;
    
    private ArrayList<Product> products;
           
    public Supermarket() {
        this.products = new ArrayList<Product>();
        
        
    }
    
}
