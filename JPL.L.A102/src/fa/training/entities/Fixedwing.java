package fa.training.entities;

public class Fixedwing extends Airport {
	private String fixedWingID;
	private String planeType;
	private double minNeededRunwaySize;

	public Fixedwing() {
		super();
	}

	public String getFixedWingID() {
		return fixedWingID;
	}

	public void setFixedWingID(String fixedWingID) {
		this.fixedWingID = fixedWingID;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public double getMinNeededRunwaySize() {
		return minNeededRunwaySize;
	}

	public void setMinNeededRunwaySize(int minNeededRunwaySize) {
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

	@Override
	public String toString() {
		return "Fixedwing [fixedWingID=" + fixedWingID + ", planeType=" + planeType + ", minNeededRunwaySize="
				+ minNeededRunwaySize + "]";
	}

}
