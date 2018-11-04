/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1F;

import java.util.Scanner;

/*
 Написать программу, которая находит арифметическое и геометрическое
среднее цифр шестизначного числа N.
 * @author Natali
 */
public class HW1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the seven digit number");
        int sevenDigitNumber = sc.nextInt();

        int newSevenDigitNumber = getBackSideNumber(sevenDigitNumber);

        System.out.println("Sourse number is " + sevenDigitNumber);
        System.out.println("Reverce number is " + newSevenDigitNumber);

    }

    public static int getBackSideNumber(int sevenDigitNumber) {
        int[] digit = new int[7];

        int newNumber = 0;
        int divizion = 1000000;
        int i = 0;

        while (sevenDigitNumber > 0 && i < digit.length) {
            digit[i] = sevenDigitNumber % 10;
            sevenDigitNumber = sevenDigitNumber / 10;
            i++;
        }

        for (int j = 0; j < digit.length; j++) {
            newNumber += digit[j] * divizion;
            divizion /= 10;
        }

        return newNumber;

    }

}
