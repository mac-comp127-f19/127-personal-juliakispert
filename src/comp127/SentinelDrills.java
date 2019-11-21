package comp127;
import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args){
        divideByTwo();

    }
    public static void OddEven(){
        int answer;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("What integer do you want to check if it is odd or even?");
                answer = scan.nextInt();
             if (answer%2==0)
                 System.out.println("Your number is even");
             else
                 System.out.println("Your number is odd");

        }while(answer > 0);

    }
    public static void divideByTwo(){
        Scanner scan = new Scanner(System.in);
        int userInteger;
        int countDivisionByTwo = 0;
        System.out.println("give an integer");
            userInteger = scan.nextInt();
         while(userInteger !=1 ){
             userInteger = userInteger/2;
             countDivisionByTwo ++;
         }
         System.out.println(countDivisionByTwo);

    }
}
