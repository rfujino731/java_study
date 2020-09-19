package java_study;

import java.util.Scanner;

public class calc2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight, height, bmi;
		
//		weight = 70;
//		height = 1.75;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("体重は？ (kg): ");
		weight = stdIn.nextDouble();
			
		System.out.print("身長は？ (cm): ");
		height = stdIn.nextDouble();
		
		height /= 100;
		
		bmi = weight / (height * height);
		System.out.println("BMIは、" + bmi);
		
		if (bmi < 18.5) {
			System.out.println("やせ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}
				

	}

}
