/*
Wrote a method named 'repl' that accepts a string and a number of repetitions
Returns the String concatenated x many times.
For example the call repl("hello, 2") returns "hellohello".
When the number of repetitions is 0, an empty string will be returned.
*/

public static String repl(String word, int rept) {
    String concatenation = "";

    for (int i = 0; i < rept; i++) {
            concatenation += word;
    }

    return concatenation;

    }