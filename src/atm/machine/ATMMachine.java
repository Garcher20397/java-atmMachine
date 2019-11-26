/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

/**
 *
 * @author mlarrubia
 */
import java.util.Scanner;
public class ATMMachine {

    /**
     * @param args the command line arguments
     */
    static Scanner kb = new Scanner(System.in);
    private static final String username = "Mr.Poop123";
    private static final int PIN = 1234;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter your username: ");
        String nameOfUser = kb.nextLine();
        System.out.println("Now enter your PIN: ");
        int pin = kb.nextInt();
        
        if(credentials(nameOfUser, pin))
        
    }
    public static boolean credentials(String nameOfUser, int pin){
    if (nameOfUser.equals(username) && pin == PIN){
        System.out.println("Welcome to your Wells Fargo bank accout!");
    return true;
      }
    else{
    System.out.println("You have been temporarily locked out of your account... Please contact customer support.");
    return false;
    }
    
    }
}
