package bsu.vasilyeva_n.hw2A;

import java.awt.geom.Point2D;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
На прямоугольной декартовой системе координат на плоскости заданы три
точки с соответствующими координатами в виде пары значений (x,y).
Определить, являются ли данные точки вершинами треугольника. И если да, то
дополнительно определить, является ли данный треугольник прямоугольным.
 *
 * @author Natali
 */
public class HW2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Scanner sc = new Scanner(System.in);

         
        System.out.println("The coordinate of first point"); 
        System.out.println("Input the X coordinate of first point");
        int xFirstPoint = sc.nextInt();
        System.out.println("Input the Y coordinate of first point");
        int yFirstPoint = sc.nextInt();
        
        
        System.out.println("The coordinate of second point"); 
        System.out.println("Input the X coordinate of second point");
        int xSecondPoint = sc.nextInt();
        System.out.println("Input the Y coordinate of first point");
        int ySecondPoint = sc.nextInt();
        
        
        System.out.println("The coordinate of third point"); 
        System.out.println("Input the X coordinate of third point");
        int xThirdPoint = sc.nextInt();
        System.out.println("Input the Y coordinate of third point");
        int yThirdPoint = sc.nextInt();
        
        
        
        double firstSide = calculateDistance(xFirstPoint, yFirstPoint,  xSecondPoint, ySecondPoint);
        double secondSide = calculateDistance(xSecondPoint, ySecondPoint, xThirdPoint, yThirdPoint);
        double thirdSide = calculateDistance(xFirstPoint, yFirstPoint, xThirdPoint, yThirdPoint);
        
        
        System.out.println("Is it the side of tringle? " + checkIsSideOfTriangle(firstSide, secondSide, thirdSide));
        //System.out.println("Is the 90 deg triangle?" + checkTriangleIs90Deg(firstSide, secondSide,thirdSide));
        checkTriangleIs90Deg(firstSide, secondSide, thirdSide);
        
    }
    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {

        //return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return Point2D.distance(x1, y1, x2, y2);

    }
    
    public static boolean checkIsSideOfTriangle(double firstSide, double secondSide, double thirdSide) {

        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;

    }
    
    
    public static void checkTriangleIs90Deg(double firstSide, double secondSide, double thirdSide) {
       boolean result;
        if(checkIsSideOfTriangle(firstSide, secondSide,thirdSide)==true) {
            result = (firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide) || (firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide) || (thirdSide * thirdSide + secondSide * secondSide == firstSide * firstSide);
        System.out.println("Is the 90 deg triangle?" + result);      
        }
               
    }
}
    

