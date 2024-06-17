package exercise;

public class Customer {
	private static Customer instance = new Customer();

	private Customer() {
		cardNum++;
		customerID = cardNum;
	}

	public static int cardNum = 1000;
	public int customerID;
	public String customerName;
	public int age;
	public String address;

	public static Customer getInstance() {
		if (instance == null) {
			instance = new Customer();
		}
		return instance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String name) {
		customerName = name;
	}
}
