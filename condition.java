
import java.util.Scanner;

/* 
import java.util.Scanner;
*/
// find a number of even or odd
/* 
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
*/

// find given no. is greater or eual or not

/* 
public class condition{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal");
        } else {
            if (a>b) {
                System.out.println("a is greater");
            }else{
                System.out.println("a is Smaller");
            }
        }
    }
}
*/


// by using switch statement to printn  sunday to saturaday 


/* 
import java.util.*;

public class condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

         switch (n) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday ");
                break; 
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thrusday");
                break; 
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturaday");
                break;                  
            default:
                System.out.println("Sunday");
        }
        
    }
}


*/


// by using switch statement to print +,-,*,/ and so on .....


public class condition{
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            switch(n){
                case 1 -> System.out.println(a+b);
                case 2 -> System.out.println(a-b);
                case 3 -> System.out.println(a*b);
                case 4 -> {
                    if (b==0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
                }
                case 5 -> {
                    if (b==0) {
                        System.out.println("Invali modulus");
                    } else {
                        System.out.println(a%b);
                    }
                }
                default -> System.out.println( "Invalid number");
                
            }
        }
    }
}