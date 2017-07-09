/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author gilvan
 */
public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String msg) {
        super(msg);
    }
    
}
