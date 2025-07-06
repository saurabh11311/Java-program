
/* 
//Srings Declaration and Initialization
public class Strings {
    public static void main(String[] args) {
        
        //Strings declaration
        String name = "Tony";
        String FullName = "Tony Stark";
        String sentence = "My name is Tony Stark";
    }
}
*/

/* 

//String by Given data to by User
import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Read a line of input
        String fullName = sc.nextLine(); // Read another line of input
        String sentence = sc.nextLine(); // Read a third line of input
        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullName);   
        System.out.println("Sentence: " + sentence);
        sc.close(); // Close the scanner to prevent resource leaks
        

    }
}

*/


/* 

//Concatenation function of by String 
public class Strings{
    public static void main(String[] args) {
        //concetaination 
        String FirstName = "Saurabh";
        String LastName = "Patel";
        String FullName = FirstName + LastName ;
        System.out.println(FullName);
        System.out.println(FirstName + " " + LastName); // Concatenation with space
        System.out.println(FirstName.concat(" ").concat(LastName)); // Using concat method

         
        for(int i = 0; i< FullName.length(); i++){
            System.out.print(FullName.charAt(i)); // Print each character of FullName
        }
    }

}

*/


/* 
// String Methods
public class Strings{
    public static void main(String[] args) {
        String name = "Saurabh Patel";
        String fullName = "Saurabh Patel";
        String sentence = "My name is Saurabh Patel";

        // Length of the string
        System.out.println("Length of name: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Check if the string contains a substring
        System.out.println("Contains 'Saurabh': " + name.contains("Saurabh"));

        // Replace a substring
        System.out.println("Replace 'Patel' with 'Singh': " + name.replace("Patel", "Singh"));

        // Split the string into an array
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

*/



/* 
//Compare to String 

public class Strings {

    public static void main(String[] args) {
        //compare 
        String name1 = "Saurabh";
        String name2 = "Saurabh";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Both strings are equal.");
        } else if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " comes before " + name2);
        } else {
            System.out.println(name1 + " comes after " + name2);
            
        }

    }
}

*/


/* 

//Compare to other example

public class Strings {

    public static void main(String[] args) {
        //compare
        String name1 = "Saurabh";
        String name2 = "saurabh";

        if(new String("Saurabh")==new String("Saurabh")){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        
    }
}

*/


/* 
//Substrings
public class Strings {

    public static void main(String[] args) {
        String name = "Saurabh Patel";
        
        // Extracting a substring
        String firstName = name.substring(0, 7); // "Saurabh"
        String lastName = name.substring(8); // "Patel"
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
        // Extracting a substring from the end
        String lastThreeChars = name.substring(name.length() - 3); // "tel"
        System.out.println("Last three characters: " + lastThreeChars);
    }
}

*/

/* 

//Substring Example

public class Strings {

    public static void main(String[] args) {
        //substring
        String Sentence = "My name is Saurabh Patel";
        //substring (Beg index, end index)
        String name1 = Sentence.substring(0,11 ); // "My name is "
        //substring (Beg index) 
        String name2 = Sentence.substring(11); // "Saurabh Patel"
        //substring (Beg index, end index)  
        String name3 = Sentence.substring(11, 22); // "Saurabh Patel"

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
    */


/*
//parseInt method of Interger class

public class Strings {

    public static void main(String[] args) {
        String str = "12345";
        int number = Integer.parseInt(str); // Convert String to int
        System.out.println("The integer value is: " + number);
        
        // Example of parsing a string with a decimal
        String decimalString = "123.45";
        double decimalNumber = Double.parseDouble(decimalString); // Convert String to double
        System.out.println("The double value is: " + decimalNumber);
    }
}
    */

/*     
//ToString method of Integer class
public class Strings {
    public static void main(String[] args) {
        int number = 12345;
        String str = Integer.toString(number); // Convert int to String
        System.out.println("The string value is: " + str);
        System.out.println("The Lenght of integer is: " + str.length());
        
        // Example of converting a double to a string
        double decimalNumber = 123.45;
        String decimalString = Double.toString(decimalNumber); // Convert double to String
        System.out.println("The string value of the double is: " + decimalString);
        System.out.println("The Lenght of double is: " + decimalString.length());
    }    
}    

*/

