package labs;
class Bank {
    double amount;

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method 
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount<=amount)?"Withdrawal successful":"Insufficient balance";

        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Deposit method or setter method
    void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Displaying balance
    void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
}


public class lab3 {

	public static void main(String[] args) {
		Bank b = new Bank(10000);

        double withdrawalAmount = 15000;
        double depositAmount = 5000;

        b.withdraw(withdrawalAmount);
        b.deposit(depositAmount);
        b.displayBalance();
		

	}

}
