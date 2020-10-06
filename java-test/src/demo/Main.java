package demo;

public class Main {

	public static void main(String[] args) {
		double d = Math.random();
		String result = Gacha.gacha(d);
		System.out.println(result);
	}
}
