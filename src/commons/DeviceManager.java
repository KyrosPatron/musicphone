package commons;

import commons.dataClasses.GeoPoint;
import commons.interfaces.IGps;
import commons.interfaces.IPlayer;
import static java.lang.Math.*;


public class DeviceManager {
	/**
	 * Singleton implementation Java-style
	 */
	private static DeviceManager instance = null;
	private DeviceManager() {}
	public static DeviceManager getInstance (){
		if (instance==null) {
			instance = new DeviceManager();
		}
		return instance;
	}
	public IPlayer Player;
	public IGps Gps;
	public IPlayer getPlayer() {
		return Player;
	}
	public void setPlayer(IPlayer player) {
		Player = player;
	}
	public IGps getGps() {
		return Gps;
	}
	public void setGps(IGps gps) {
		Gps = gps;
	}


	public static double computeDistance(GeoPoint point1, GeoPoint point2, String string) {
		double lat1 = toRadiants(point1.getLatitude());
		double lon1 = toRadiants(point1.getLongitude());
		
		double lat2 = toRadiants(point2.getLatitude());
		double lon2 = toRadiants(point2.getLongitude());
		
		double deltaLat = abs(lat1 - lat2);
		double deltaLon = abs(lon1 - lon2);
		
		double add1 = pow(sin(deltaLat/2),2);
		double add2 = cos(lat1) * cos(lat2) * pow(sin(deltaLon/2),2);
		
		double a = sqrt(add1+add2);
		
		
		
		
		
		return 2 * asin(min(1.0,a)) * 6371.01;
	}
	
	public static double toRadiants(String degree) {
		double degreeAsDouble = Double.parseDouble(degree);
		
		return  degreeAsDouble * PI / 180;
	}

}
