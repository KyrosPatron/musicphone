package commons;

import commons.dataClasses.GeoPoint;
import commons.interfaces.IGps;
import commons.interfaces.IPlayer;


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


	public static double computeDitance(GeoPoint point1, GeoPoint point2, String string) {
		
		return 0;
	}
	public static double toRadiants(String degree) {
		double degreeAsDouble = Double.parseDouble(degree);
		
		return  degreeAsDouble * Math.PI / 180;
	}

}
