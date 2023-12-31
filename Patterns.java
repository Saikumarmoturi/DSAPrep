import java.util.Scanner;

public class Patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print22(x);
        sc.close();
    }

    static void print1(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print2(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void print3(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void print4(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    static void print5(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= x-i-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void print6(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void print7(int n){
        //approch 1
        /*
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int k=0;k<i;k++){
                // System.out.print("k ="+k);
                System.out.print("*");
            }
            System.out.println();
        }
         */

         //approch 2
        
         for(int i = 0;i<n;i++){
            //space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
         }


        
    }

    static void print8(int n ){
        for(int i = 0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j =0 ;j< 2*n-2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void print10(int n){
        //approch1
        // for(int i =0;i<n;i++){
        //     for(int j =0;j<=i;j++){
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }
        // for(int i =0;i<n;i++){
        //     for(int j =0;j< n-i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Approch2

        for(int i=1;i<2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    
    static void print11(int n){
        for(int i=0;i<n;i++){
            int start =1;
            if(i%2==0){
                start =1;
            }
            else{
                start = 0;
            }
            for(int j =0;j<i+1;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    static void print12(int n){
        for(int i =0;i<n;i++){
            //number
            for(int j=0;j<=i;j++){
                System.out.print((j+1));
            }
            //space
            for(int j =0;j<2*(n-1)-i*2;j++){
                System.out.print(" ");
            }
            //number
            for(int j = i;j>=0;j--){
                System.out.print((j+1));
            }
            System.out.println();
        }
    }

    static void print13(int n){
        int digit = 1;
        for(int i = 0;i<n ;i++){
            for(int j =0;j< i+1;j++){
                System.out.print(digit+" ");
                digit  = digit +1;
            }
            System.out.println();
        }
    }

    static void print14(int n){
        for(int i =0;i<n ;i++){
            for(char ch = 'A';ch<='A'+i;ch++){
                System.out.print(ch );
            }
            System.out.println();

        }
    }
    static void print15(int n){
        for(int i = 0;i<n ;i++){
            for(char j ='A';j<='A'+(n-i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print16(int n){
        char ch = 'A';
          for(int i =0;i<n ;i++){
            
            for(int j = 0;j<=i;j++){
                System.out.print(ch);
                System.out.print(" " );
               
            }
             ch = (char) (ch+1);
            System.out.println();
        }
    }
    static void print17(int n){
        for(int i = 0;i<n ;i++){
           //space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //chars
            char ch = 'A';
            int breakpoint = ((2*i+1)/2);
            for(int j = 0;j<2*i+1;j++){
                System.out.print(ch);
                // ch++;
                if(j<breakpoint){
                    ch++;
                }
                else{
                    ch=(char) (ch-1);
                }
            }
            //space
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void print18(int n){
        for(int i =0;i<n;i++){
            // char ch = (char) ('A'+n);
            for(int j =0;j<=i;j++){
                char print = (char) ('A'+(n-i-1)+j);
                System.out.print(print);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    static void print19(int n){
        for(int i =0 ;i<n;i++){
            //stars
            for(int j =0 ;j<n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j =0;j<2*i;j++){
                System.out.print(" ");
            }
            
            //stars
            for(int j =0 ;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        int spaces = 2*n-2;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j =0;j<spaces;j++){
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            spaces = spaces -2;
            System.out.println();
        }
    }
    static void print20(int n){
        int spaces = 2*n-2;
        for(int i =0;i<2*n-1;i++){
            int stars = i;
            if(i>=n){
                stars = 2*n-i-2;
            }
            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            for(int j =0 ;j<spaces;j++){
                System.out.print(" ");
            }
             for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            
            System.out.println();
            if(i<n-1){
            spaces = spaces-2;
        }
            else{
                spaces = spaces+2;
            }
           
        }
    }
    static void print21(int n){
        for(int i =0;i<n;i++){
            for(int j = 0 ;j<n ;j++){
                if(i == 0 || j ==0 || i==n-1 || j ==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void print22(int n){
        for(int i = 0;i<2*n-1;i++){
            for(int j =0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,down), Math.min(right, left)));
            }
            System.out.println();
        }
    }
}
