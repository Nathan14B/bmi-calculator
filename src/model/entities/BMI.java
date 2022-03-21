package model.entities;

import model.exceptions.NonPositiveValueException;

public class BMI {
	public static double calculate(double weight, double height) {
		if (weight <= 0.0 || height <= 0.0) {
			throw new NonPositiveValueException("Weight and Height values must be greater than zero!");
		}

		return weight * 703 / Math.pow(height, 2);
	}

	public static String showBMIValues() {
		StringBuilder sb = new StringBuilder();

		sb.append("BMI VALUES\n");
		sb.append("Underweight: less than 18.5\n");
		sb.append("Normal:      between 18.5 and 24.9\n");
		sb.append("Overweight:  between 25 and 29.9\n");
		sb.append("Obese:       30 or greater\n");

		return sb.toString();
	}
}
