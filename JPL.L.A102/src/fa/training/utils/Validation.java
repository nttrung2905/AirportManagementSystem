package fa.training.utils;

import java.util.Scanner;

public class Validation {
	private String pattern1 = "AP\\d{5}";
	private String pattern2 = "FW\\d{5}";
	private String pattern3 = "RW\\d{5}";

	// ID is a string of 7 characters, started by “AP”
	public boolean checkAirportID(String ID) {
		boolean isValid = ID.matches(pattern1);
		if (!isValid) {
			System.out.println(ID + " Mã ISBN không hợp lệ, vui lòng nhập lại nhé!");
		} else {
			System.out.println(ID + " Mã ISBN hợp lệ!");
		}
		return isValid;

	}

	// ID is a string of 7 characters, started by “FW”
	public boolean checkFixedWingID(String ID) {
		boolean isValid = ID.matches(pattern2);
		if (!isValid) {
			System.out.println(ID + " Mã ISBN không hợp lệ, vui lòng nhập lại nhé!");
		} else {
			System.out.println(ID + " Mã ISBN hợp lệ!");
		}
		return isValid;
	}

	// ID is a string of 7 characters, started by “RW”
	public boolean checkRotatedID(String ID) {
		boolean isValid = ID.matches(pattern3);
		if (!isValid) {
			System.out.println(ID + " Mã ISBN không hợp lệ, vui lòng nhập lại nhé!");
		} else {
			System.out.println(ID + " Mã ISBN hợp lệ!");
		}
		return isValid;
	}

	// The model size is maximum 40 characters.
	public boolean checkModelSize(String nameModel) {
		boolean isValid = false;
		if (nameModel.length() <= 40) {
			isValid = true;
		}
		if (!isValid) {
			System.out.println(nameModel + "Model size is maximum 40 characters, Please try again!");
		} else {
			System.out.println(nameModel + "The name of model is valid.");
		}
		return isValid;
	}

	// Fixed wing airplane type are CAG (Cargo), LGR (Long range) and PRV (Private)
	public boolean checkFixedWingAirplaneType(String planeType) {
		boolean isValid = false;
		if (planeType.equals("CAG") || planeType.equals("LGR ") || planeType.equals("PRV ")) {
			isValid = true;
		}

		if (!isValid) {
			System.out.println(planeType + "The fixed wing airplane is not valid, Please try again!");
		} else {
			System.out.println(planeType + "The fixed wing airplane is valid.");
		}
		return isValid;
	}

	// min runway size does not excess the airport runway size.
	public boolean checkRunwaySize(double minFWRunwaySize, double airportRunwaySize) {
		boolean isValid = false;
		if(minFWRunwaySize <= 0 || airportRunwaySize <= 0) {
			System.out.println("Input data is not valid!");
			return isValid;
		}
		if (airportRunwaySize > minFWRunwaySize) {
			isValid = true;
		}
		if (!isValid) {
			System.out.println(
					"Fixed wing airplane min runway size does not excess the airport runway size.Please try again");
		} else {
			System.out.println("Fixed wing airplane min runway size is valid");
		}
		return isValid;

	}

	// The max takeoff weight of helicopter does not excess 1.5 times of its empty
	// weight.
	public boolean checkWeightHelicopter(double maxTakeOffWeight, double emptyWeight) {
		boolean isValid = false;
		if(emptyWeight <= 0 || maxTakeOffWeight <= 0) {
			System.out.println("Input data is not valid!");
			return isValid;
		}
		if (1.5 * emptyWeight >= maxTakeOffWeight) {
			isValid = true;
		}
		if (!isValid) {
			System.out.println(
					"The max takeoff weight of helicopter does not excess 1.5 times of its empty weight. Please try again!");
		} else {
			System.out.println("The max take off weight is valid.");
		}
		return isValid;
	}

	public static void main(String[] args) {
		Validation v = new Validation();
//		System.out.println("Nhap id: ");
		Scanner s = new Scanner(System.in);
//		System.out.println("FX airplane min runway size: ");
//		double minFWRunwaySize = s.nextDouble();
//		System.out.println("The airport runway size: ");
//		double airportRunwaySize = s.nextDouble();

		System.out.println("The empty weight of helicopter: ");
		double emptyWeight = s.nextDouble();
		System.out.println("The max takeoff weight of helicopter: ");
		double maxTakeOffWeight = s.nextDouble();

//		v.checkAirportID(id);
//		v.checkFixedWingID(id);
//		v.checkModelSize(name);
//		v.checkRotatedID(id);
//		v.checkFixedWingAirplaneType(id);
//		v.checkRunwaySize(minFWRunwaySize, airportRunwaySize);
		v.checkWeightHelicopter(maxTakeOffWeight, emptyWeight);

	}
}
