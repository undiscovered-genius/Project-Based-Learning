package assignment5;

public class savingAcc extends Account{
	
	double min_bal;
	double sav_bal;
	
	savingAcc(String cust_name, int account_number, double min_bal, double sav_bal) {
		super(cust_name, account_number);
		this.min_bal = min_bal;
		this.sav_bal = sav_bal;
	}
	
	public savingAcc() {
		super();
		// TODO Auto-generated constructor stub
	}

	void getData() {
		System.out.println(" Customer Name : "+cust_name);
		System.out.println(" Account Number : "+account_number);
		System.out.println(" Minimum Balance : Rs."+min_bal);
		System.out.println(" Saving Balanve : Rs."+sav_bal);
	}
	
	void putData(String cust_name, int account_number, double minBal, double savBal) {
		putData(cust_name, account_number);
		this.min_bal = minBal;
		this.sav_bal = savBal;
	}
}
