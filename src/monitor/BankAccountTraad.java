package monitor;

public class BankAccountTraad extends Thread {

	private BankAccount bankAccount;

	public BankAccountTraad(BankAccount bankAccount) {
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
			bankAccount.setBalance(100, "c");
			i++;
		}
		System.out.println("Balancen er: " + bankAccount.getBalance());
	}

}
