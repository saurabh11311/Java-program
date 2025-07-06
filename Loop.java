
import java.util.Scanner;



// using of while loop
/* 
public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=20) { 
            System.out.println(i);
            i++;
        }
    }
}
*/

// print the table


public class Loop{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}
