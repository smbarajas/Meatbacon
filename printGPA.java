/*
Wrote a method called printGPA which will calculate a student's grade point average.
After typing a line of input which contains the student's name, user will then input a number
of scores, followed by that number of integer scores.+

*/

public static void printGPA() {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter a student record: ");
    String name = console.next();
    int numScore = console.next.Int();
    double sum = 0.0;

    for (int i = 0; i < numScore; i++) {
        int score = console.nextInt();
        sum += score;

    }
    double average = sum / numScore;
    System.out.println(name + "'s grade point average is " + average);
}