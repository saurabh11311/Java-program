/* 
// Take an array of string input from the user and find the comulative (combined) length of all those striing 

import java.util.Scanner;

public class StringsQue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt(); // Read the number of strings
            int toLenght = 0; // Variable to store the cumulative length of all strings
            String[] array = new String[size]; // Declare and initialize the array

            for(int i=0;i<size;i++) {
                array[i]=scanner.next();
                toLenght += array[i].length(); // Add the length of each string to the cumulative length
            }
            System.out.println(toLenght); // Print the cumulative length of all strings
        }
    }
}
*/


/* 

//Q. Input a String from the user. Create a new string called "resul" in which you will replace the latter 'e' in the original string with letter 'i'?

import java.util.Scanner;

public class StringsQue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='e'){
                result += 'i'; // Replace the last 'e' with 'i'
           } else {
                result += str.charAt(i); // Keep the other characters unchanged
           }
        }
    }
}
*/


//Q. Input an email from the user. you have to create a username from the email by deleting the part that comes after @ .Display that username to the user
//Example:- email :- saurabha11311@gamil.com   username :- saurabha11311    email :- helloworld123@gamil.com   username :- helloworld123

