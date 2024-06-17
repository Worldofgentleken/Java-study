package exercise;

public class BuyCoffee {

	public static void main(String[] args) {
		Coffee customerKim = new Coffee("김씨", 8000);
		Coffee customerLee = new Coffee("이씨", 10000);
		
		Star star1 = new Star("별다방");
		customerKim.buyStar(star1);
		customerKim.showInfo();
		star1.showInfo();
		
		Kong kong1 = new Kong("콩다방");
		customerLee.buyKong(kong1);
		customerLee.showInfo();
		kong1.showInfo();
	}

}
