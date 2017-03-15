/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlifetimecalculator;

/**
 *
 * @author aniqanawar
 */
public class inputValidation {
    
    public int validation(double number){
    int status_number = 0;
    status_number = +notNegative(number);
    return status_number;
    }
    
    public int notNegative(double number){
        if (number>=0){
            return 0;
            }
            return 1;
    }
    
}
