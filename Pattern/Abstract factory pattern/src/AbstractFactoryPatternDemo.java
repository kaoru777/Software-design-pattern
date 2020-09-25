
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory airVehicleFactory = FactoryProducer.getVehicle(true);
		Vehicle airPlane = airVehicleFactory.getVehicle("AIRPLANE");
		airPlane.move();

		Vehicle paperPlane = airVehicleFactory.getVehicle("PAPERPLANE");
		paperPlane.move();

		AbstractFactory roadVehicleFactory = FactoryProducer.getVehicle(false);
		Vehicle car = roadVehicleFactory.getVehicle("CAR");
		car.move();

		Vehicle bus = roadVehicleFactory.getVehicle("BUS");
		bus.move();

	}
}
