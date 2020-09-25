
public class RoadVehicleFactory extends AbstractFactory {

	@Override
	Vehicle getVehicle(String vehicleType) {
		switch (vehicleType.toUpperCase()) {
		case "CAR":
			return new Car();
		case "BUS":
			return new Bus();

		default:
			break;
		}
		return null;
	}

}
