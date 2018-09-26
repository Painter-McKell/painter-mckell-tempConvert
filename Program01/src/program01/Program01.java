/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, prod;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in degrees Celsius: ");
        n1 = keyboard.nextDouble();
        
        prod = (9.0/5.0) * n1 + 32.0;
        System.out.println("The temperature in degress Farenheit is: " + prod);
   
    }
    
}
