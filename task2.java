/*@uthor : Anshu Varghese

 This application performs a number guessing game.The system generates a random number.
 The user has to guess the system generated  number in limited number of chances.
 Based on number of guesses, the user will be scored accordingly by the application.*/

import java.util.Scanner;
import java.util.Random;
public class task2 {
    
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Start the game\n2. End the game");
             System.out.println("Enter your choice:");
             int ch1=sc.nextInt();
             if(ch1==1)
             {
            Random r=new Random();
            int systeminput=r.nextInt(100);
            System.out.println("The computer generates a random number! \nYou have to guess the number");
            System.out.println("Enter number of chances to guess the number:");
            int noofchances=sc.nextInt();
            int count=1;
            for(int i=0;i<noofchances;i++)
            {
                System.out.println("Enter user input:");
               int userinput=sc.nextInt();
               if(systeminput==userinput)
               {
                 System.out.println("Correct guess!");
                 break;
               }
               else if(systeminput<userinput){
                   
                   System.out.println(userinput+" is more than systeminput");
                   count++;
               }
               else if(systeminput>userinput){
                   
                   System.out.println(userinput+" is less than systeminput");
                   count++;
               }
               else{
                   System.out.println("Invalid number!");
               }
            }
            if(count>=noofchances)
            {
                System.out.println("Failed to guess");
                System.out.println("Your score is 0 out of 10");
            }
            else{
                System.out.println("You guessed the answer in "+count+" attempts");
                int score=((noofchances-count)*100)/(noofchances*10);
                System.out.println("Your score is "+score+" out of 10");
            }
        } 
         else{
             System.out.println("Thank you for playing!");
         }
    }
}
       