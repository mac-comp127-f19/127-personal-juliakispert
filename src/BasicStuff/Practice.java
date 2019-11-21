package BasicStuff;

import java.util.Random;

import java.util.Scanner;

    public class Practice

    {

        public static void main(String[] args)

        {

            Scanner scan = new Scanner(System.in);
            Random generator = new Random();



            int upper;

//this number is given by user in the next steps

            int randomnumber;

            System.out.println("What positive integer do you want to be the upperbound to find a random number between 0 and the entered integer?");

            upper =  scan.nextInt();

            randomnumber = generator.nextInt(upper+1);

            System.out.println(randomnumber);

        }

    }

