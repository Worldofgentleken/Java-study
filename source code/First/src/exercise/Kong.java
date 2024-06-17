package exercise;

public class Kong {
	String cafeName;
	int money;
	String menu;

	public Kong(String cafeName) {
		this.cafeName = cafeName;
	}
	public void buy(int money) {
		this.money += money;
		menu = "라떼";
	}
	public void showInfo() {
		System.out.printf("%s에서 산 커피는 %s입니다.\n", cafeName, menu);
	}
}