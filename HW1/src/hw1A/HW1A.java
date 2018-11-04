package bsu.vasilyeva_n.hw1A;

import java.util.Scanner;


/*
 Разработайте программу, которая проверяет, что числа a, b и c различны
(одинаковы).
 */
/**
 *
 * @author Natali
 */
public class HW1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the first number");
        int a = sc.nextInt();
        
        System.out.println("Input the second number");
        int b = sc.nextInt();
        
        System.out.println("Input the third number");
        int c = sc.nextInt();

        System.out.println("a= " + a + "; b= " + b + "; c= " + c);

        System.out.println(showResult(check(a, b, c)));

    }

    public static boolean check(int a, int b, int c) {

        return a != b && b != c && a != c;
    }

    public static String showResult(boolean a) {
        String st = "";
        if (a == false) {
            st = "The numbers are equal";
        } else {
            st = "The number are non-equal";
        }
        return st;

    }
}
