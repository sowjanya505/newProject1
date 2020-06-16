package demo.account;

import java.util.*;

public class Transaction {

private static double interestRate;
private static double newBalance;
private static double interest;
public static void main(String[] args) {
    double priorBalance;
    double addtlCharges = 100;
    double newBalance;
    double minPayment;

    boolean creditcard_balance = false;
	if (creditcard_balance == true) {
        interestRate = 0.0;
    } else {
        interestRate = 0.02;
    }

    newBalance = calculateInterest(priorBalance, addtlCharges);
    minPayment = calculateMinPayment(newBalance);
    state = isactive(priorBalance);
    // output the resulting statement (DO NOT CHANGE)
    System.out.println("\n");
    System.out.println("CS CARD International Statement");
    System.out.println("===============================");
    System.out.printf("Previous balance:   $%,8.2f\n", priorBalance);
    System.out.printf("Additional charges: $%,8.2f\n", addtlCharges);
    System.out.printf("Interest:           $%,8.2f\n\n", interest);
    System.out.printf("New balance:        $%,8.2f\n\n", newBalance);
    System.out.printf("Minimum payment:    $%,8.2f\n", minPayment);
}


public static double calculateInterest(double priorBalance,
                                       double addtlCharges) {
    interest = (priorBalance + addtlCharges) * interestRate;
    return interest;
}


public static double calculateMinPayment(double balance) {
    
    if (newBalance < 0) {
        balance = 0;
    }
    if (newBalance >= 0 && newBalance <= 49.99) {
        balance = newBalance;
    }
    if (newBalance >= 50 && newBalance <= 300) {
        balance = 50.0;
    }
    if (newBalance > 300) {
        balance = (newBalance * 0.2) + newBalance;
    }
    return balance;

    public String cardStatus()
    {
    	double interest;
    	return (Balance == 3 *100 && Balance < 100) ?   "Delinquent" : "Active";
    	/*if (cardStatus() == "Delinquent")
    	{
    		//pay 25% of due
    		if(interest = Balance * 0.25) 
    			return  "Active" 
    			else "closed" ;
    	}*/
    		
    	}
}


}
