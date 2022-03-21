package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.BMI;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double weight = 0.0, height = 0.0;
		System.out.println("--- BMI Calculator ---");

		do {
			System.out.print("Weight(pounds): ");	
			try {
				weight = input.nextDouble();
			} catch(InputMismatchException error) {
				input.nextLine();
				System.err.println("Please enter only numeric values!");
				continue;
			}

			if (weight < 1) {
				System.err.println("Please enter a number greater than zero!");
			}
		} while(weight < 1);

		do {
			System.out.print("Height(inches): ");
			try {
				height = input.nextDouble();
			} catch(InputMismatchException error) {
				input.nextLine();
				System.err.println("Please enter only numeric values!");
				continue;
			}

			if (height < 1) {
				System.err.println("Please enter a number greater than zero!");
			}
		} while(height < 1);
		input.close();
			
		System.out.printf("BMI: %.1f%n", BMI.calculate(weight, height));

		System.out.println("----------------------");

		System.out.println(BMI.showBMIValues());
		
	}

}
