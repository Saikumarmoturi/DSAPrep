import java.util.Scanner;

public class PrimeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String isPrime = isPrime(x);
        System.out.println(isPrime);
        sc.close();
    }

    public static String isPrime(int n) {
        int k = n;
        int divisor = 2;
        int count = 0;
        if (n == 1) {
            return "NO";
        }

        while (Math.sqrt(n) > divisor) {
            if (k % divisor == 0) {
                count++;
            }
            divisor++;
        }
        if (count == 0) {
            return "YES";
        }
        return "NO";
        // return "YES"?count==0:"NO";
        // Your code goes here
    }
}
