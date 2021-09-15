package fa.training.entities;

public class Helicopter extends Airport {
	private String helicopterID;
	private int range;

	public Helicopter() {
		super();
	}

	public String getHelicopterID() {
		return helicopterID;
	}

	public void setHelicopterID(String helicopterID) {
		this.helicopterID = helicopterID;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Helicopter [helicopterID=" + helicopterID + ", range=" + range + "]";
	}

}
