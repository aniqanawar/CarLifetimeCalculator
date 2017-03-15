
package carlifetimecalculator;

import java.util.Scanner;

/**
 *
 * @author aniqanawar
 */
public class CarLifetimeCalculator {
    static double hprice, hfuel, lprice, lfuel;

    public static void main(String[] args) {
        //Input Different values:
       
        setInputs();

        Calc calculator =new Calc();
        double numberOfYear= calculator.calcAnswer(hprice,hfuel, lprice, lfuel);
        System.out.println("Optimum Number of years the high efficiency car needs to last  :"+numberOfYear);
    }
    
    public static void setInputs(){
        inputValues inputV = new inputValues();
        
        hprice = inputV.set_hprice();
        hfuel = inputV.set_hfuel();
        lprice = inputV.set_lprice();
        lfuel = inputV.set_lfuel();
    }
    
}
