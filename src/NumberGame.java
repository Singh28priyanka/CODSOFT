import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random ran =new Random();
        int LowerBound=1;
        int UpperBound=100;
        int randomNumber=ran.nextInt(UpperBound-LowerBound+1)+ LowerBound;
        int guess ,attempts=0,maxAttempts=10;
        System.out.println("Guess the number between  " + LowerBound + " and " + UpperBound );
        while (attempts < maxAttempts){
            System.out.print("Enter your guess:");
            guess=input.nextInt();
            attempts++;

            if(guess==randomNumber){
                System.out.println("Correct! Right guess!!!!" + attempts + " attempts.");
                break;
            }
            else if(guess > randomNumber){
                System.out.println(" Oops its too High!!!guess again.");
            }
            else {
                System.out.println(" Oops its too Low!!! guess again.");
            }

        }
        if(attempts==maxAttempts){
            System.out.println(" Out of attempts! the number was: " + randomNumber);
        }
        input.close();

    }
}
