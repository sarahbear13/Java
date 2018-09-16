/******
Book: Introduction to Java Programming, 6th Edition
Program: 4.8- Prompt the user to enter the number of students, each student's name, and score. Display the student with the highest score.
******/

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		// Declare variables.
		int numberOfStudents; // The number of students marks entered.
		int i = 0; // The counter to compare to numberOfStudents.
		String name; // Holds the first name of the student.
		String topName = ""; // Holds the name of the student with the highest score.
		String nameSwitch;
		double studentScore; // Mark the student received.
		double highestScore = 0; // Supposed to hold the highest mark.
		double check; // Used to compare the studentScore to current highest score.

		// Prompt for the number of students.
		System.out.println("Enter the number of students: ");
		numberOfStudents = Scan.nextInt();

		// Begin do-while loop.
		do {
			System.out.println("Enter the student's name: ");
			name = Scan.next();
			System.out.println("Enter the mark: ");
			studentScore = Scan.nextDouble();
			i++;

			if (studentScore > highestScore) {
				check = studentScore;
				highestScore = check;

				nameSwitch = name;
				topName = nameSwitch;
			}

		} while (i < numberOfStudents);

		System.out.println("\nTHE STUDENT WITH THE HIGHEST SCORE:");
		System.out.println("Student: " + topName + "\nScore: " + highestScore);
	}
}
