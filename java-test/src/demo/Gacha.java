package demo;

public class Gacha {
	private static double SR = 0.01;
	private static double R = 0.1;

	public static String gacha(double rval) {
		if (rval <= SR) {
			return "SR ★★★★★";
		} else if (rval <= R) {
			return "R ★★★★";
		} else {
			return "N ★★★";
		}
	}
}
