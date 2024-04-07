import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int i, number;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number for which you want to print the multiplication table:");
        number = sc.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        for (i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        sc.close(); // Close the Scanner object to prevent resource leak
    }
}
