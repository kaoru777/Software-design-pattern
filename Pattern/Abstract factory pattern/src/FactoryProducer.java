
public class FactoryProducer {
	public static AbstractFactory getVehicle(boolean air) {
		if(air) {
			return new AirVehicleFactory();
		} else {
			return new RoadVehicleFactory();
		}
	}

}
