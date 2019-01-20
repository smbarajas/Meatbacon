/*
The third excercise from page 190, chapter 2
A method called 'printPowersOfN'.
Will print out the number to the x power.
*/

//Define the powers class

public class Powers {

    public static int printPowersOfN (int base, int exponent) }
    int answer = 1;

//the for loop

    for (int i=0; i <=exponent; i++) {
        System.out.print(answer);
        System.out.print(" ");
        answer*=base;

    }

    return answer;

}

//Prints out n to the x power

public static void main(String[] args) {
    System.out.println(printPowersOfN(4, 3));
    System.out.println(printPowersOfN(5, 6));
    System.out.println(printPowersOfN(-2, 8));

    }
    
}