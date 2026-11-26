package Projects;

import java.util.Random;
import java.util.Scanner;

/*  //This is the code which i wrote without any help of ai
public class numberGuessingGame {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Wellcome to the number guessing game"+" lets see your guess");
        int n=r.nextInt(100);
        int c=0;
        int i=1;
        while(c!=n){
            System.out.println("choose a number between 0 & 100 ");
            c=sc.nextInt();
            if (c==n){
                System.out.println("Your guess was correct you win in "+i+" guess");
                System.out.println("");
                break;
            } else if(c<n){
                System.out.println("number is greater");
                i=i+1;
            }
            else {
                System.out.println("number is smaller");
                i=i+1;
            }
        }
*/


//This is the code improved by Ai not much changes (mentioned below with commnets
public class numberGuessingGame {

    public static void main(String[] args) { //main method public and string args because standard method

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 0 and 100.");

        int n = r.nextInt(101);  // 101 include number from 0-100 if i use 100 then the random number will be from 0-99;
        int count = 0;

        while (true) {  // use true and break statemnt where the condition becomes true because c!=n is confusing this is easy to understand

            System.out.print("Enter your guess: ");
            int c = sc.nextInt();
            count++;

            if (c == n) {
                System.out.println("Correct! You win!");
                System.out.println("You guessed it in " + count + " attempts.");
                break;
            }
            else if (c < n) {
                System.out.println("The number is greater. Try again!");
            }
            else {
                System.out.println("The number is smaller. Try again!");
            }
        }

        sc.close();  //good practice to close the scanner object
    }
}


