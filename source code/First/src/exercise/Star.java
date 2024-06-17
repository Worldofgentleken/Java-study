package exercise;

public class Star {

	String cafeName;
	int money;
	String menu;

	public Star(String cafeName) {
		this.cafeName = cafeName;
	}
	public void buy(int money) {
		this.money += money;
		menu = "아메리카노";
	}
	public void showInfo() {
		System.out.printf("%s에서 산 커피는 %s입니다.\n", cafeName, menu);
	}
}
