/* 
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


*/

/* 

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){

                    System.out.print("*");
                }
            System.out.println();
        }
    }
}

*/
/* 

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){

                    System.out.print("*");
                }
            System.out.println();
        }
    }
}


*/

/* 
public class pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){

                    System.out.print(" ");
                }

                for(int j=0; j<=n-i; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}

*/

/* 
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
        }
    }
}

*/

/* 
public class pattern{
    public static void main(String[] args) {
        int n=5;
        //outer loop 
        for (int i=1; i<= n; i++) {
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

*/


//butterfly pattern 



public class pattern{
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



