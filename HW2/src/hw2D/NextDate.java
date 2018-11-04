/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw2D;

/**
 *
 * @author Natali
 */
public class NextDate {

 public static String takeNextDay(int day, int month, int year) {
  String nextDay = "";
    
   System.out.println("The day what you choose is " + day + "." + month + "." + year);

        switch (day) {
            case 31:
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                  
                    nextDay = takeDateInString(day+1, month+1, year);
                    
                } else {
                    if (month == 12) {
                       
                     nextDay = takeDateInString(1, 1, year+1);
                    } else {
                        System.out.println("Error. Input a right day");
                    }
                }
                break;
            case 30:
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    
                     nextDay = takeDateInString(day+1, month, year);

                } else {
                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                      
                         nextDay=takeDateInString(1, month+1, year);
                    } else {
                        System.out.println("Error. Input a right day");
                    }
                }

                break;

            case 28:
                if ((year % 400 == 0 && month == 2) || (year % 4 == 0 && year % 100 != 0 && month == 2) && month == 2) {
                   
                   nextDay=takeDateInString(29, month, year);
                } else if (month == 2) {
                   
                    nextDay = takeDateInString(1, 3, year);
                } else {
                   
                    nextDay = takeDateInString(day+1, month, year);
                }
               
                break;

            default:
                nextDay = takeDateInString(day+1, month, year);
                break;
        }

       

    
   return nextDay;
    }
    
    public static String takeDateInString(int day, int month, int year) {
        return String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year);
    }
}
