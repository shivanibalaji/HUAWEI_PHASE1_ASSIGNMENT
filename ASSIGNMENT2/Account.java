package interestcalculator;

public abstract class Account {
	 double interestRate;
	 double amount; 
	 abstract double calculateInterest(double amount);
}