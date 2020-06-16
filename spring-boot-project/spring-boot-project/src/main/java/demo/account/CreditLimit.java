package demo.account;
public class CreditLimit{
    int accountNo, Balance, totalCharges, totalCredits, creditLimit;

    // SETTERS
    public void setAccountInfo(int accountNo, int startBalance, int totalCharges,
                               int totalCredits, int creditLimit){
        setAccountNo(accountNo);
        setStartBalance(startBalance);
        setTotalCharges(totalCharges);
        setTotalCredits(totalCredits);
        setCreditLimit(creditLimit);
    }
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    public void setStartBalance(int startBalance){
        this.Balance = startBalance;
    }
    public void setTotalCharges(int totalCharges){
        this.totalCharges = totalCharges;
    }
    public void setTotalCredits(int totalCredits){
        this.totalCredits = totalCredits;
    }
    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
    // GETTERS
    public int getAccountNo(){
        return accountNo;
    }
    public int getStartBalance(){
        return Balance;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public int getTotalCharges(){
        return totalCharges;
    }
    public int getTotalCredits(){
        return totalCredits;
    }
    public int getNewBalance(){
        return getStartBalance() - getTotalCharges() + getTotalCredits();
    }
    public boolean creditExceeded(){
        return (getNewBalance() > getCreditLimit()) ? false : true;
    }
    public String cardStatus()
    {
    	double interest;
    	return (Balance == 3 *100 && Balance < 100) ?   "Delinquent" : "Active";
    	if (cardStatus() == "Delinquent")
    	{
    		//pay 25% of due
    		if(interest = Balance * 0.25) 
    			return  "Active" 
    			else "closed" ;
    	}
    		
    	}
    }	
