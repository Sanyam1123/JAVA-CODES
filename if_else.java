import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers, a and b, for comparing:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        if (a == b) {
            System.out.println("a and b are equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }
}
