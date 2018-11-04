/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1C;

import java.util.Scanner;

/*
 *
 На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 &gt;
 R2). Разработайте программу нахождения площади кольца, внешний радиус
которого равен R1, а внутренний радиус равен R2.
 * @author Natali
 */
public class HW1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first radius");
        double R1 = sc.nextDouble();

        System.out.println("Input the second radius");
        double R2 = sc.nextDouble();

        double ringSquare = findSquare(R1, R2);

        System.out.println("The square between 2 rings is " + ringSquare);
    }

    final static double PI = 3.141593;

    public static double findSquare(double a, double b) {
        double s1 = PI * a * a;
        double s2 = PI * b * b;

        return s1 - s2;

    }
}
