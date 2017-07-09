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

/**
 *
 * @author gilvan
 */
public class FileIO {
    
    public ArrayList<Product> readFile(String file) throws IOException, FileNotFoundException, ClassNotFoundException {
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
   
   }
