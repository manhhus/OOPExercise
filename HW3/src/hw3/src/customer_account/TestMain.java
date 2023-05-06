package hw3.src.customer_account;

public class TestMain {
	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Tran Van Manh", 'm');
		System.out.println(customer1);

		Account account1 = new Account(136, customer1, 550.5);
		System.out.println(account1);
		System.out.println("id is: " + account1.getId());
		System.out.println("customer is: " + account1.getCustomer());
		System.out.println("customer's name is: " + account1.getCustomerName());
		System.out.println("balance is: " + account1.getBalance());

		account1.deposit(50);
		System.out.println(account1);

		account1.withdraw(100.50);
		System.out.println(account1);
	}

}
