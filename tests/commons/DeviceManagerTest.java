package commons;

import static org.junit.Assert.*;

import org.junit.Test;

import commons.dataClasses.GeoPoint;

public class DeviceManagerTest {

	@Test
	public void testTwoSamePoints() {
		GeoPoint point1 = new GeoPoint("0", "0");
		GeoPoint point2 = new GeoPoint("0", "0");

		assertEquals(0,DeviceManager.computeDistance(point1,point2,"km"),0);
		
	}
	
	@Test
	public void testToRadiants() {
		String degree = "60";
		assertEquals(1.047, DeviceManager.toRadiants(degree),0.1);
	}
	
	@Test
	public void testTwoPoints0_0vs60_0() {
		GeoPoint point1 = new GeoPoint("0", "0");
		GeoPoint point2 = new GeoPoint("60", "0");

		assertEquals(6671.70,DeviceManager.computeDistance(point1,point2,"km"),0.1);
		
	}



}
