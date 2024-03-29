package bank;

public class bank {
    int balance;
    
    bank(int balance){
    	this.balance=balance;
    }
    void withdrawl(int amt) {
    	if(balance<amt) {
    		System.out.println("Insufficient Balance");
    	}
    	else {
    		balance-=amt;
    	}
    }
    void deposit(int amt) {
    	balance+=amt;
    }
    void display_balance() {
    	System.out.println("Balance is:"+balance);
    }
    public static void main(String[] args) {
    	
    }
}