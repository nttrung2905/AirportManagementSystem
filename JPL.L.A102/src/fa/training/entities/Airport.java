package fa.training.entities;

public class Airport {
	private String airportID;
	private String name;
	private double runwaySize;
	private int maxFixedWingParkingPlace;
	private Fixedwing listOfFixedWingAirplaneID;
	private int maxRotatedWingParkingPlace;
	private Helicopter listOfHelicopterID;

	private String model;
	private int cruiseSpeed;
	private double emptyWeight;
	private double maxTakeOffWeight;

	public Airport() {
		super();
	}

	public String getAirportID() {
		return airportID;
	}

	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRunwaySize() {
		return runwaySize;
	}

	public void setRunwaySize(int runwaySize) {
		this.runwaySize = runwaySize;
	}

	public int getMaxFixedWingParkingPlace() {
		return maxFixedWingParkingPlace;
	}

	public void setMaxFixedWingParkingPlace(int maxFixedWingParkingPlace) {
		this.maxFixedWingParkingPlace = maxFixedWingParkingPlace;
	}

	public Fixedwing getListOfFixedWingAirplaneID() {
		return listOfFixedWingAirplaneID;
	}

	public void setListOfFixedWingAirplaneID(Fixedwing listOfFixedWingAirplaneID) {
		this.listOfFixedWingAirplaneID = listOfFixedWingAirplaneID;
	}

	public int getMaxRotatedWingParkingPlace() {
		return maxRotatedWingParkingPlace;
	}

	public void setMaxRotatedWingParkingPlace(int maxRotatedWingParkingPlace) {
		this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
	}

	public Helicopter getListOfHelicopterID() {
		return listOfHelicopterID;
	}

	public void setListOfHelicopterID(Helicopter listOfHelicopterID) {
		this.listOfHelicopterID = listOfHelicopterID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(int cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(int emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public double getMaxTakeOffWeight() {
		return maxTakeOffWeight;
	}

	public void setMaxTakeOffWeight(int maxTakeOffWeight) {
		this.maxTakeOffWeight = maxTakeOffWeight;
	}

	@Override
	public String toString() {
		return "Airport [airportID=" + airportID + ", name=" + name + ", runwaySize=" + runwaySize
				+ ", maxFixedWingParkingPlace=" + maxFixedWingParkingPlace + ", listOfFixedWingAirplaneID="
				+ listOfFixedWingAirplaneID + ", maxRotatedWingParkingPlace=" + maxRotatedWingParkingPlace
				+ ", listOfHelicopterID=" + listOfHelicopterID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed
				+ ", emptyWeight=" + emptyWeight + ", maxTakeOffWeight=" + maxTakeOffWeight + "]";
	}

}
