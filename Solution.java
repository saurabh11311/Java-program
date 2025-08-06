/* 
//Q.Enter a number from the user & make the function to Print their avarage 

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
*/


/* 
//Q. Write the function to print the sum of all odd number from 1 to n.

import java.util.Scanner;

public class Solution {

    public static void Printsum(int n) {
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Printsum(n);
    }
    
}
*/


/* 
//Write a function which takesin 2 number and return the greater if those two.

import java.util.Scanner;

public class Solution {
    if(a>b){
        return a;
    }else{
        return b;
    }

    public static getcharcter(int a,int b){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreater(a, b));
    }
}
*/

/* 
//Q.Write a function that takes in the radius as input and return the circumference of  a circle 

import java.util.Scanner;

public class Solution {
    public static Double getCircumference(Double radius){
        return 2*3.14*radius;
       }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(getCircumference(r));
    }
}
*/    

//wriet a function that takes in age as input and return if that person is eligible to voto or not a person age>18 is eligible to vote 
/* 
import java.util.*;
public class Solution {
    public static boolean isEligible (int age){
        if(age<18){
            return true;
        }
            return false;
        }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }
}
*/

// Q. Write an infinite loop using do while condition 
/* 
import java.util.*;
@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        do{

        }while(true);
    }
}
*/


//Q. Write a porgram to enter the number till the user wants and at the end it should display the count of positive negative and zero entered
/* 
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        int positive = 0, negative = 0;  int Zero =0;
        System.out.println("Press 1 to continous & 0 to stop ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input==1) {
            System.out.println("Enter your number :");
            int number = sc.nextInt();
            if (number>0) {
                positive++;
            }else if(number<0){
                negative++;
            }else{
                Zero++;
            }
        }
        System.out.println("Press 1 to contionus & 0 to Stop ");{
        input=sc.nextInt();
        }
        System.out.println("positive:"+ positive);
        System.out.println("Negative:"+ negative);
        System.out.println("Zero:"+ Zero);
    }
}
*/

//