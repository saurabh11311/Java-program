//Bit Manipulation  ==> 1.Get 2.Set 3.Clear 4.Update


/* 
//1. Get Bit   (Q). Get the 3rd bit (position=2) of a number n. 
//   BitMask:- 1<<i
//   Operator:- AND 

public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if ((bitMask&n)==0) {
            System.out.println("bit was Zero");
        } else {
            System.out.println("bit was Non-Zero");
        }
    }
}
*/


/* 
//2. Set Bit 

// (Q). Set the 2nd Position=1 of a number n.  (n=0101)  BitMask:- 1<<i ; operation:-OR

public class Bits {

    public static void main(String[] args) {
        int n =5;
        int pos = 1;
        int bitMask =1<<pos;
        int newNumber = bitMask/n;
        System.out.println(newNumber);
    }
}
*/

//3..Clear Bit

// (Q). Clear the 3rd bit (postion=2) of the number n. (n=0101)  Bitmask:- 1<<i   Operation:- AND with OR

public class Bits {

    public static void main(String[] args) {
        int n =5;
        int pos = 2;
        int bitMask =1<<pos;
        int notbitMask = ~(bitMask);
        int newNumber= notbitMask & n;
        System.out.println(newNumber);
       
    }
}