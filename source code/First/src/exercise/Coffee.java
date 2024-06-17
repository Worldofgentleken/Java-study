package exercise;

public class Coffee {
	public String customerName;
	public int money;
	public String menu;
	
	public Coffee(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	public void buyStar(Star star) {
		star.buy(4000);
		this.money -= 4000;
	}
	public void buyKong(Kong kong) {
		kong.buy(4500);
		this.money -= 4500;
	}
	public void showInfo() {
		System.out.println(customerName + "의 남은 돈은 " + money + "입니다.");
	}
}
