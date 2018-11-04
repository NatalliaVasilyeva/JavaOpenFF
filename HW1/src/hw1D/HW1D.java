/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw1D;

import java.util.Scanner;


/*
 Разработайте программу, которая проверяет, что цифры четырёхзначного
числа N образуют возрастающую (убывающую) последовательность (к примеру,
число 1357 удовлетворяет условию, т.к. его цифры соответствуют следующему
неравенству: 1 &lt; 3 &lt; 5 &lt; 7, т.е. идут в порядке возрастания).
 * @author Natali
 */
public class HW1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the four digit number");
        int fourDigitNumber = sc.nextInt();

        boolean result = checkIsRiseNumberInBigNumber(fourDigitNumber);

        System.out.println("four digit number= " + fourDigitNumber);
        System.out.println("result: " + result);
    }

    public static boolean checkIsRiseNumberInBigNumber(int fourDigitNumber) {
        int[] digit = new int[4];
        boolean result = false;
        int i = 0;

        while (fourDigitNumber > 0 && i < digit.length) {
            digit[i] = fourDigitNumber % 10;
            fourDigitNumber = fourDigitNumber / 10;
            i++;
        }

        for (int j = 0; j < digit.length - 1; j++) {
            if (digit[j] <= digit[j + 1]) {
                break;
            }
            if (j == digit.length - 2) {
                result = true;
            }
        }
        return result;
    }
}
