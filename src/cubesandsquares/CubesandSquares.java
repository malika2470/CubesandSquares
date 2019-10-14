/*Malika Sharma
 *14/10/2019
 *Cubes and Squares 
 * 
 */
package cubesandsquares;

import java.util.Scanner;

/**
 *
 * @author VIASVS
 */
public class CubesandSquares {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in); 
       Scanner keyedInput = new Scanner(System.in); 
        double choice5; 
        int choice;
        int number = 0; 
        int total1; 
        double squared;
        double cubed; 
        double power; 
        double choice3; 
            while (true)
            {
            System.out.println("Please enter your choice");
            System.out.println("1… Find the value of a number squared"); 
            System.out.println("2… Find the value of a number cubed"); 
            System.out.println("3… Find the value of a number, to any power"); 
            System.out.println("4...Exit"); 
            choice = keyedInput.nextInt();
            System.out.println("Please enter a number "); 
            number = keyedInput.nextInt();
            if (choice== 1){
            squared = number * number; 
            System.out.println("The answer squared is");
            System.out.println(squared); 
            } 
           if (choice==2){ 
            cubed = number * number *number; 
            System.out.println("The answer cubed is");
            System.out.println(cubed); 
        } 
           if (choice==3){ 
            System.out.println("Please enter a power");
            power = keyedInput.nextInt();
            double square = Math.pow(number, power);
            System.out.println(square); 
          } 
           else if (choice==4)
          { System.out.println("You have chosen to exist, goodbye!"); 
           break; 
          }
        }    
    } 
} 
                    
  

     
          
                
     

    
    

