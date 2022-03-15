package interestcalculator;

import java.util.*;

public class ICICIaccount extends Account{
	double ICICIinterestRate;
    double ICICIAmount;
    int noOfYears;
    
    double General;
    Scanner FDScanner = new Scanner(System.in);

    @Override
    double calculateInterest(double amount){
        this.ICICIAmount = amount;

        System.out.println("Enter the no of years");
        noOfYears = FDScanner.nextInt();

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
        

        return ICICIAmount *noOfYears* ICICIinterestRate;
    }
}
