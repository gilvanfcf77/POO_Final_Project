/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gilvan
 */
public class FileIO {
    
    public static ArrayList<Product> readFile(String file) throws IOException, FileNotFoundException, ClassNotFoundException {
        Product p;
        ArrayList<Product> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                p = (Product) objectInputStream.readObject();
                list.add(p);
                }
            catch (EOFException e) {
                break;
            }
        }
        // objectInputStream.close();
        fileInputStream.close();
        return list;
    }
    
    public static Product searchProduct(String name){
        Product p = null;
        ArrayList <Product> products = null;
        try {
            products = FileIO.readFile("products");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Product product : products){
            
            if(product.getName() == name){
                p = product;
            }
        
        }
        return p;
    
    }
    
    public static void register(int type, String name, int amount){
        Product p = FileIO.searchProduct(name);
        try {
            ArrayList<Product> products = FileIO.readFile("products.dat");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    
   }
