import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isArmstrong = checkArmstrong(x);
        System.out.println(isArmstrong);
        sc.close();
    }
    static int countDigits(int n){
	int digits = 0;
	while(n!=0){
		digits++;
		n = n/10;
	}
	return digits;
}
/**
 * @param n
 * @return
 */
static boolean checkArmstrong(int n){
	int duplicatedNumber = n;
	double cubedNumber = 0; 
	int noOfDigit = countDigits(n);
	while(n!=0){
		int reminder = n%10;
		cubedNumber = (int) (Math.pow(reminder,noOfDigit) +cubedNumber);
		n = n/10;
	}
	if(cubedNumber == duplicatedNumber){
		return true;
	}
	return false;
	//Write your code here
}
}

