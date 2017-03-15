/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlifetimecalculator;

import java.util.Scanner;

/**
 *
 * @author aniqanawar
 */
public class inputValues {
    double hprice, hfuel, lprice, lfuel;
    
    
public double set_hprice(){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter price of high-efficiency car:");
      hprice = keyboard.nextDouble();
      return hprice;

}

public double set_hfuel(){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter fuel of high-efficiency car:");
      hfuel = keyboard.nextDouble();
      return hfuel;

}

public double set_lprice(){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter price of low-efficiency car:");
      lprice = keyboard.nextDouble();
      return lprice;

}

public double set_lfuel(){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter fuel of low-efficiency car:");
      lfuel = keyboard.nextDouble();
      return lfuel;

}
    
}
