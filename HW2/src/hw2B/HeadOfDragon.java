/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw2B;

/**
 *
 * @author Natali
 */
public class HeadOfDragon {
    
     public static int countHead(int age) {
        int sum = 0;
        final int ENTITY_HEAD = 3;
        final int FIRST_PERIOD = 200;
        final int SECOND_PERIOD = 300;

        if (age >= 0 && age < FIRST_PERIOD) {

            sum = (age * 3) + ENTITY_HEAD;
        }

        if (age >= FIRST_PERIOD && age < SECOND_PERIOD) {

            sum = FIRST_PERIOD * 3 + (age - FIRST_PERIOD) * 2 + ENTITY_HEAD;
        }

        if (age >= SECOND_PERIOD) {

            sum = FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2 + (age - SECOND_PERIOD) + ENTITY_HEAD;
        }

        return sum;
    }

    public static int countEyes(int age) {
        return 2 * countHead(age);

    }
}
