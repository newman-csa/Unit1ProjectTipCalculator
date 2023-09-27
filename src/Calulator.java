import  java.util.Scanner;

public class Calulator
{
    public static void mai(String[] arg)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("--This is a tip calculator--\n");
        System.out.print("What is your total bill?: ");
        int totalBill = scn.nextInt();
        System.out.print("\nHow many people are splitting the tip?: ");
        int numberPeople = scn.nextInt();
        System.out.print("\nHow many people are splitting the tip?: ");
        int tipPercentage = scn.nextInt();


    }
}
