/*
Wrote a method called printGPA which will calculate a student's grade point average.
After typing a line of input which contains the student's name, user will then input a number
of scores, followed by that number of integer scores.
*/

import java.util.Scanner;
public class printGPA {
  public static void printGPA(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter a student record: ");
    String name = console.next();
    double numScore = console.nextDouble();
    double sum = 0.0;

    for (double i = 0.0; i < numScore; i++) {
        double score = console.nextDouble();
        sum += score;

    }
    double average = sum / numScore;
    System.out.println(name + "'s grade point average is " + average);
  }
}