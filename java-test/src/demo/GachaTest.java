package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GachaTest {
	@Test
	public void testGacha() {
		String resultSr = Gacha.gacha(0.01);
		assertEquals("SR ★★★★★", resultSr);
		
		String resultR = Gacha.gacha(0.1);
		assertEquals("R ★★★★", resultR);
		
		String resultN = Gacha.gacha(0.5);
		assertEquals("N ★★★", resultN);	
	}
}
