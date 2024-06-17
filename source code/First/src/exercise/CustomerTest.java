package exercise;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer1 = Customer.getInstance();
		customer1.setCustomerName("Lee");
		System.out.println(customer1.cardNum);
		System.out.println(customer1.customerName + "카드번호 : " + customer1.customerID);
		
		Customer customer2 = Customer.getInstance();
		customer2.setCustomerName("Son");
		System.out.println(customer2.cardNum);
		System.out.println(customer2.customerName + "카드번호 : " + customer2.customerID);
	}

}
