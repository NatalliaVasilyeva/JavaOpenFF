/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1B;

import java.util.Scanner;

/*
Масса динозавра задаётся в килограммах. Разработайте программу, которая
вычисляет, сколько это миллиграмм, грамм и тонн.
 */
/**
 *
 * @author Natali
 */

public class HW1B {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the mass of dinozaur in kilogramm");
        double quantityOfKilogramm = sc.nextDouble();

        double quantityOfMilligramm = calculateMilligramm(quantityOfKilogramm);
        double quantityOfGramm = calculateGramm(quantityOfKilogramm);
        double quantityOfTonn = calculateTonn(quantityOfKilogramm);

        System.out.println(quantityOfKilogramm + " kilogramm " + "is " + quantityOfMilligramm + " milligramm " + " or " + quantityOfGramm + " gramm" + " or " + quantityOfTonn + " tonn");

    }

    public static double calculateMilligramm(double quantityOfKilogramm) {
        return quantityOfKilogramm * 10000000;
    }

    public static double calculateGramm(double quantityOfKilogramm) {
        return quantityOfKilogramm * 1000;
    }

    public static double calculateTonn(double quantityOfKilogramm) {
        return quantityOfKilogramm / 1000;

    }

}
