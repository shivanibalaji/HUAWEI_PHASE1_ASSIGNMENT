package interestcalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char more;
        
        do {

            System.out.println("SELECT THE OPTIONS OF BANK NAME " + "\n1." + " Interest Calculator-HDFC" + " \n2." + " Interest Calculator-ICICI"
                    + "\n3." + " InterestCalculator-SBI" + "\n4 " + " Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SBaccount HDFC = new HDFCaccount();
                    System.out.println("Enter the Average SB amount ");
                    double amount = sc.nextDouble();
                    System.out.println("Interest gained is : $ " + sb.calculateInterest(amount));

                 
                    break;

                case 2:
                	ICICIaccount ICICI = new ICICIaccount();
                    System.out.println("Enter the  Amount");
                    double amount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + fd.calculateInterest(fAmount));
        
                    break;
                case 3:
                	SBIaccount SBI = new SBIaccount();
                    System.out.println("Enter the amount");
                    double amount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + rd.calculateInterest(Ramount));
             
                    break;

                case 4:
                    System.out.println("DO YOU WANT TO CALCULATE AGAIN ????" + " "
                            + "RUN AGAIN THE PROGRAM");
                default:
                    System.out.println("Wrong choice");

            }
            System.out.println("WANA CONTINUE-(y for YES OR n for NO)");
   	     	more = sc.next().charAt(0);
//   	     	more =Integer.parseInt(obj1.readLine());
        }while(more=='y' || more=='Y');
        
    }

}
  