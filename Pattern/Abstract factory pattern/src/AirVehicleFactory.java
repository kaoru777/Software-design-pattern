
public class AirVehicleFactory extends AbstractFactory {
	@Override
	Vehicle getVehicle(String vehicleType) {
		switch (vehicleType.toUpperCase()) {
		case "AIRPLANE":
			return new Airplane();
		case "PAPERPLANE":
			return new Paperplane();

		default:
			break;
		}
		return null;
	}
}
