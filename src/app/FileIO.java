/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.AddProduct;

/**
 *
 * @author gilvan
 */


public class FileIO {
    
    
    public static void addProduct(Product product){
        
        ObjectOutputStream objectOut = null;			
        try {
            objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("products.dat", true)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            objectOut.writeObject(product);
        } catch (IOException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            objectOut.close();
        } catch (IOException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
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
            products = FileIO.readFile("products.dat");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Product product : products){
  
            if(product.getName().equals(name)){
                p = product;
                
            }
        
        }
        return p;
    
    }
    
    public static void cleanList(){
        
        Writer out = null;
        try {
            out = new FileWriter("products.dat");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //limpa
            out.write("");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void register(int type, String name, int amount){
        
        Product p = FileIO.searchProduct(name);
        System.out.println(p.getName());
        System.out.println("Tipo: " + type);
        System.out.println("Quantidade: " + amount);
        
        
        ArrayList<Product> products = null;    
        
        try {
             products = FileIO.readFile("products.dat");
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i = 0; i < products.size(); i++)
        {
            
           if(products.get(i).getName().equals(name)){
            if(type == 1){
                
                    if(products.get(i).getAmount() > amount || products.get(i).getAmount() == amount)
                    {
                        products.get(i).setAmount(products.get(i).getAmount() - amount);
                        JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso.");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Quantidade insuficiente em estoque", "Alerta", JOptionPane.ERROR_MESSAGE);
                                
            }
            if(type == 2){
                products.get(i).setAmount(products.get(i).getAmount() + amount);
                JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso.");
                
            }
           
           }
        
        }
        
        cleanList();
        
        for(Product p2 : products){
            
            addProduct(p2);
        
        }
        
        
        
        
    
    }
    
   }
