//Number Guessing Game

import java.util.*;
public class Guessinggame{
    public static void main(String args[]){
         System.out.println("WELCOME TO GUESS NUMBER GAME");
         int initial = 1;
         int guessnum = 0;
         Scanner sc = new Scanner(System.in);
         System.out.println("To win the Game you need to guess the number");
         System.out.println("You have 5 attemps");
         int anum = (int) (Math.random() * 99 + 1);
         do{
            System.out.println("Enter a number between 1 to 100");
            if(sc.hasNextInt()){
               guessnum = sc.nextInt();
               if(guessnum == anum){
                     System.out.println("Hurray!!! You Won The Game!. Your number is correct!");
                     break;
               }
               else if(guessnum < anum){
                      System.out.println("Guess number is smaller."); 
               }
               else if(guessnum > anum){
                      System.out.println("Guess number is Greater.");
               }
               if(initial == 5){
                    System.out.println("You exceeded 5 attempts.");
                    System.out.println("Try Again!");
                    break;
               }
               initial += 1;
            }
            else{
              System.out.println("Enter a valid number");
              break;
            }
          }while(guessnum!=anum);
     }
}
               
               