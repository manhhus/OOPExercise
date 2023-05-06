package hw3.src.customer_invoice;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return this.id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCustomerID() {
		return getCustomer().getId();
	}

	public String getCustomerName() {
		return getCustomer().getName();

	}

	public int getCustomerDiscount() {
		return getCustomer().getDiscount();

	}

	public double getAmountAfterDiscount() {
		return this.amount;

	}

	public String toString() {
		return "Invoice[id = " + id + " customer = " + getCustomerName() + "(" + id + ") " + "(" + getCustomerDiscount()+ "%) " + "amount = " + amount
				+ "]";

	}

}
