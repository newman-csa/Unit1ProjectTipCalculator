import  java.util.Scanner;

public class Calulator
{
    public static void main(String[] arg)
    {
        // Initializing variables before main program
        Scanner scn = new Scanner(System.in);
        double totalTip = 0.0;
        double totalBillTip = 0.0;
        double tipPerPerson = 0.0;
        double totalPerPerson = 0.0;

        // The following askes for specifaction
        //Uses scanner to insert into new variable
        System.out.println("--This is a tip calculator--\n");
        System.out.print("What is your total bill?: ");
        double totalBill = scn.nextDouble();
        System.out.print("How many people are splitting the tip?: ");
        int numberPeople = scn.nextInt();
        System.out.print("What percent will you tip?: ");
        int tipPercentage = scn.nextInt();

        //Calulations completed for all sub values
        totalTip = ((double)tipPercentage/100)*totalBill;
        tipPerPerson = totalTip/numberPeople;
        totalBillTip = totalTip + totalBill;
        totalPerPerson = totalBillTip/numberPeople;

        // Final printout for the calculator, which displays that calculated stats as list
        System.out.println("\n-- Your Total--");
        System.out.println("Total Tip: $"+ String.format("%.2f", totalTip));
        System.out.println("Total Bill + Tip: $"+ String.format("%.2f", totalBillTip));
        System.out.println("Tip Per Person: $"+ String.format("%.2f", tipPerPerson));
        System.out.println("Total Per Person (Bill + Tip): $"+ String.format("%.2f", totalPerPerson));
    }
}
