/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw2C;

/**
 *
 * @author Natali
 */
public class VowelOrConsonantLetter {
    public static boolean isVowelLetterFirstMethod(char q) {
     q=Character.toUpperCase(q);
     return (q == 'A' || q == 'E' || q == 'Y' || q == 'U' || q == 'I' || q == 'O');
    }
    
    public static boolean isVowelLetterSecondMethod(char q) {
        boolean answer=false;
        q=Character.toUpperCase(q);
     switch(q) {
         case 'A': 
         case 'E': 
         case 'Y': 
         case 'U': 
         case 'I': 
         case 'O': answer = true; break;      
     }
      return answer;
    }
    
     public static boolean isVowelLetterThirdMethod(char q) {
        char b = Character.toUpperCase(q);         
        String ch = Character.toString(b);
        String s=("AEYUIO");
        return s.contains(ch);
    }
     
       public static boolean isVowelLetterFourthMethod(char q) {
           boolean answer = false;
            q = Character.toUpperCase(q);
       char[] letters={'A','E','Y','U','I','O'};
          for (int i=0; i<letters.length; i++ ) {
              if (q==letters[i]) {
                answer=true;
                
              }
         break;
    }
          return answer;
  }
}
       
