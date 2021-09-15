package fa.training.services;

public class HelicopterService implements AirportService {

	@Override
	public void fly() {
		System.out.println("Helicopter fly");
	}

}
