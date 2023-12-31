import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        palindrome(-121);
        sc.close();
    }
  static   boolean palindrome(int n)
{
    int k =n;
    int reverseNum = 0;
    while(n!=0){
        reverseNum = n%10+reverseNum*10;
        n = n/10;
    }
    System.out.println(reverseNum);
    if(reverseNum == n){
    return true;}
    return false;
    // Write your code here
}
}