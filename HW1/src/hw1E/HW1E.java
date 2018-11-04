/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1E;

import java.util.Scanner;

/*
 Написать программу, которая находит арифметическое и геометрическое
среднее цифр шестизначного числа N.
 * @author Natali
 */
public class HW1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the six digit number");
        int sixDigitNumber = sc.nextInt();

        double sredneeArifm = getSredneeArifm(sixDigitNumber);
        System.out.println("Srednee ariphmeticheskoe = " + sredneeArifm);
        double sredneeGeometr = getSredneeGoometr(sixDigitNumber);
        System.out.println("Srednee geometricheskoe = " + sredneeGeometr);

    }

    public static double getSredneeArifm(int sixDigitNumber) {
        int[] digit = new int[6];
        double sum = 0;
        int i = 0;

        while (sixDigitNumber > 0 && i < digit.length) {
            digit[i] = sixDigitNumber % 10;
            sixDigitNumber = sixDigitNumber / 10;
            sum += digit[i];
            i++;
        }

        return sum / digit.length;

    }

    public static double getSredneeGoometr(int sixDigitNumber) {
        int[] digit = new int[6];
        double pr = 1;
        int i = 0;

        while (sixDigitNumber > 0 && i < digit.length) {
            digit[i] = sixDigitNumber % 10;
            sixDigitNumber = sixDigitNumber / 10;
            pr *= digit[i];
            i++;
        }

        return Math.pow(pr, digit.length);

    }

}
