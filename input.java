import  java.util.*;
public class input
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int a=sc.nextInt();
         if (a>18)
         System.out.println("not an adult");
         else
         System.out.println("adult");
         }
}