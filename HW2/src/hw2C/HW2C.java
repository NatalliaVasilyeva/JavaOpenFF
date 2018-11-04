/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw2C;

/*Напишите программу, которая бы определяла, является ли введённая буква
(символ) гласной (постарайтесь сделать минимум четырьмя способами,
разрешается и больше).
 * @author Natallia Vasilyeva 
 */
public class HW2C {
    public static void main(String[] args) {
        View.print("Try to use four method to find vowel letter ");
        
        
       char ch = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterFirstMethod(ch));
       
       char ch1 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterSecondMethod(ch1));
       
       char ch2 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterThirdMethod(ch2));
       
       char ch3 = UserInput.input("Input the char ");
       View.print("The char vowel? " + VowelOrConsonantLetter.isVowelLetterFourthMethod(ch3));
       
    }
}
