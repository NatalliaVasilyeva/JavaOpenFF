/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw3A;


import static java.lang.Math.PI;
import java.util.Scanner;
/*Созлать программу для вычисления математической формулы 
 *
 * @author Natali
 */
public class HW3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

         
        System.out.println("Input the quantity of sum element");
        int quantityOfEnum = sc.nextInt();
          System.out.println("Input the X");
        int x = sc.nextInt();
        
        System.out.println("The result of formula is " + calculateFormula(quantityOfEnum, x));
        
    }
    
    
    public static double calculateFormula (int quantityOfEnum, double x) {
        
        double result=0;
        for (int i=1; i<=quantityOfEnum; i++) {
            result+= ((Math.pow(x, i) * Math.cos(i*PI/3))/i);
            
        }
        return result;
    }
    
}
