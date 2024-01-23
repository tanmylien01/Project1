/*-------------------------------------------------------------------------
// AUTHOR: My Lien Tan
// FILENAME: Lab1.java
// SPECIFICATION: this is a program that will read three test grades from the user and then calculate and print the average of those grades
// FOR: CS 1400- Lab #1
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab1 {
public static void main (String[] args) {
	// create a Scanner object to get input from the keyboard
	Scanner keyboard = new Scanner(System.in);
	// declare three integer variables to hold the test scores
	int testScore1, testScore2, testScore3;
	// declare one integer constant to hold the number of tests
	final int numberOfTests;
	numberOfTests = 3;
	// declare one double variable to hold the average
	double averageScore;
	// Get the Input
	System.out.println ("Enter the score on the first test: ");
	testScore1 = keyboard.nextInt();
	System.out.println ("Enter the score on the second test: ");
	testScore2 = keyboard.nextInt();
	System.out.println ("Enter the score on the third test: ");
	testScore3 = keyboard.nextInt();
	// Calculate the average
	averageScore = (testScore1 + testScore2 + testScore3)/3;
	// Display Results
	System.out.println ("The average test score is " + (float) averageScore);
	keyboard.close();
}
}
