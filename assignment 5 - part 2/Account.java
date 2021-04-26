package assignment5;

public class Account {
	String cust_name;
	int account_number;
	
	Account(String cust_name, int account_number){
		this.cust_name = cust_name;
		this.account_number = account_number;
	}
	
     public Account() {
		// TODO Auto-generated constructor stub
	}

	void getData() {
		System.out.println(" Customer Name : "+cust_name);
		System.out.println(" Account Number : "+account_number);
	}
	
	void putData(String cust_name, int account_number) {
		this.cust_name = cust_name;
		this.account_number = account_number;
	}
	
	String getName() {
		return cust_name;
	}
}
