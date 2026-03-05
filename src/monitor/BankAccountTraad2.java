package monitor;

public class BankAccountTraad2 extends Thread {

	private BankAccount bankAccount;

	public BankAccountTraad2(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		int i = 0;
		while (i < 4) {
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bankAccount.setBalance(100, "d");
			i++;
		}
		System.out.println("Balancen er: " + bankAccount.getBalance());
	}

}
