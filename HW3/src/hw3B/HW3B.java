/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw3B;

import java.util.Random;
import java.util.Scanner;

/*Задан массив А(5). На печать вывести элемент, содержащий наименьшее значение и его порядковый номер
*
 * @author Natali
 */
public class HW3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

         
        System.out.println("Input minimum value of element");
        int min = sc.nextInt();
          System.out.println("Input maximum value of element");
        int max = sc.nextInt();
      
        System.out.println(findMinElement(rndInit(min, max)));
        
    }


    public static int [] rndInit(int min, int max) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static String findMinElement(int[] array) {
        int tempElement=0;
        int tempIndex=0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                tempElement = array[i];
                tempIndex = i+1;
            }
        }
        return "The minimum element is " + tempElement + " with serial number " + tempIndex;
    }
    

}
