import java.util.HashMap;
import java.util.Scanner;

public class Demo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(x);
        sc.close();
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Hey", x);
        System.out.println(hm);
    }
    
}