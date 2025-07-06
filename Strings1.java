/* 

//Declaration of string buliders
public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        System.out.println(sb);
    }
}
*/

//Find the inder no.
/* 
public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        System.out.println(sb.charAt(0));
    }
}
*/

/* 
//replace the index at char

public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        //set charat index 
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }
}
*/

/*
//insert the character at any index
public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        System.out.println(sb);
        sb.insert(2,"n");
        System.out.println(sb);
    }
}

*/
/* 
//delete the charatcter of the string 

public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        System.out.println(sb);
        sb.delete(2, 3);
        sb.delete(2, 4);
        System.out.println(sb);
    }
}
*/



/* 
//append in string

public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh ");
        sb.append("e");
        sb.append("l");
        sb.append("1");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

*/

//Reverseing the string

public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Saurabh Patel");
        for (int i = 0; i < sb.length()/2; i++) {               //  %2 is important 
            int front = i;
            int back = sb.length()-1-i;

            char frontChar =sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}