/******
Date: Sunday, September 23, 2018.
Text: Chapter 6, Question 6.1, p.204 (Introduction to Java Programming, 6th Ed)
Program: This program prompts the user for numbers which are added to an array.
		 The program then calculates the average and how many numbers are above the average.
******/

package sarah.chapter.six;

import java.util.Scanner;

public class AnalyzeInput {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		double counter = 0;			//used to sum array's numbers.
		double average  = 0;		//used to calculate the average.
		double aboveAverage = 0;	//used to find how many numbers are above the average.
		
		double[] arrayNumbers = new double[10];
		
		//Prompt user for a number ten times.
		for(int i = 0; i < 10; i++){
		System.out.print("Enter a number: ");		//prompt for number.
		arrayNumbers[i] = Scan.nextDouble();		//add number to the array.
		average = counter / arrayNumbers.length;	//calculates average.
		counter += arrayNumbers[i];
		}
		Scan.close();
				
		//Find the average.
		for(int i = 1; i < arrayNumbers.length; i++){
		average = counter / arrayNumbers.length;
		}
		
		//Find numbers that are above the average.
		for(int i = 0; i <arrayNumbers.length; i++){
			if(arrayNumbers[i] > average){
				aboveAverage++;
			}
		}
		
		//Calculate totals.
		System.out.println("Total: " + counter);
		System.out.println("Average: " + average);
		System.out.println("Above average: " + aboveAverage);
	}

}
