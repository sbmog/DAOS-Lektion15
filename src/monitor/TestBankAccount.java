package monitor;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
			BankAccountTraad bankAccountTraad1 = new BankAccountTraad(bankAccount);
			BankAccountTraad2 bankAccountTraad2 = new BankAccountTraad2(bankAccount);
			
			bankAccountTraad1.start();
			bankAccountTraad2.start();

		try {
			bankAccountTraad1.join();
			bankAccountTraad2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(bankAccount.getBalance());
		}
}
