/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.vasilyeva_n.hw2B;

/*
В молодом возрасте дракон каждый год отращивает по три головы, но после
того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
одной. Предполагается, что дракон появляется на свет сразу с тремя головами.
Разработайте программу, которая высчитывала бы, сколько голов и глаз у
дракона, которому N лет?
 * @author Natali
 */
public class HW2B {
    
    
     public static void main(String[] args) {

        View.print("The programm count how many heads and eyes has dragon");

        int age = UserInput.input("Input a how old the dragon: ");

        int head = HeadOfDragon.countHead(age);
        int eyes = HeadOfDragon.countEyes(age);

        View.print("The dragon has " + head + " heads" + " and " + eyes + " eyes");
    }
}
