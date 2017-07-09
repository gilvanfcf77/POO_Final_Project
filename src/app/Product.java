/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import exceptions.IllegalAmountException;
import exceptions.IllegalCodeException;
import exceptions.IllegalNameException;
import exceptions.IllegalPriceException;
import java.io.Serializable;

/**
 *
 * @author gilvan
 */
public class Product implements Serializable {
    
    private String name;
    private double price;
    private int amount;
    private String brand;
    private String description;
    private int code;

    public Product() {
    }   
    
    public Product(String name, double price, int amount, String brand, String description, int code) throws IllegalNameException, IllegalPriceException, IllegalAmountException, IllegalCodeException {
        
        if(name == null){
            
            throw new IllegalNameException("O campo Nome não pode ficar vazio");
        }
        else{
    
            this.name = name;   
        }
        
        if(price == 0 || price < 0){
            
            throw new IllegalPriceException("O Preço não pode ser zero ou negativo");
        }
        else{
    
            this.price = price;   
        }

        if(amount < 0){
            
            throw new IllegalAmountException("A Quantidade não pode ser negativa ou vazia");
        }
        else{
    
            this.amount = amount;   
        }
        
        
        this.brand = brand;
        this.description = description;
        
        if(code == 0 || code < 0){
            
            throw new IllegalCodeException("O campo Código não pode ser vazio ou negativo");
        }
        else{
    
            this.code = code;   
        }
    }     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }   
}
