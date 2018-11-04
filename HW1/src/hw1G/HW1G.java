/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1G;

import java.util.Scanner;

/*
Разработайте небольшую цельную программу, которая меняет местами
содержимое двух целочисленных переменных a и b, не используя для этого
дополнительных переменных.
 * @author Natali
 */
public class HW1G {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number");
        int firstNumber = sc.nextInt();
        
        System.out.println("Input the second number");
        int secondNumber = sc.nextInt();
        
        System.out.println("Number" + " " + firstNumber + " " + secondNumber + " after changes numbers is " + change2Numbers(firstNumber, secondNumber) + " " + change2Numbers1(firstNumber, secondNumber));
    }
    
    
     public static int change2Numbers(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        return firstNumber;
    }
     
     public static int change2Numbers1(int firstNumber, int secondNumber) {
         firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        return secondNumber;
    }
}
