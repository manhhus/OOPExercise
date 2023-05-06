package hw3.src.customer_account;

public class Customer {
	private final int id;
    private final String name;
    private final Character gender;

    public Customer(int id, String name, Character gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + id + ")";
    }

}
