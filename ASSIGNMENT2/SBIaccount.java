package interestcalculator;

import java.util.Scanner;

public class SBIaccount extends Account {

    double SBIInterestRate;
    double SBIamount;
    int noOfYears;
    //double monthlyAmount;
    double General;
    Scanner SBIScanner = new Scanner(System.in);

    @Override
    double calculateInterest(double Ramount){
        this.SBIamount = Ramount;
        System.out.println("Enter the number of years");
        noOfYears = SBIScanner.nextInt();
        //System.out.println("Enter RD holder age");
        //int age = RDScanner.nextInt();
        System.out.println("ENTER THE TYPE OF LOAN " + "\n1." + "HOUSE LOAN" + " \n2." + "EDUCATIONAL LOAN"
                    + "\n3." + "PERSONAL LOAN" + "\n4 " + " Exit");
                     int choice = sc.nextInt();
                     switch(choice){
                         case 1:
                         if (amount < 10000000){
                             General = 0.0800;
                         }else{
                             ICICIinterestRate=0.10
                         }
                         break;
                         case 2:
                         if (amount < 10000000){
                             General = 0.0750;
                         }else{
                             ICICIinterestRate=0.0850
                         }
                         break;
                         case 3:
                         if (amount < 10000000){
                             General = 0.0600;
                         }else{
                             ICICIinterestRate=0.0750
                         }
                         break;
                     }

        return SBIamount * SBIInterestRate*noOfYears;

    }

}