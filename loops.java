public class loops
{
   
    public static void main(String[]args)
    { int i;
        
        System.out.println("for loop");
        for(i=0;i<5;i++)
        {
            System.out.println(i);
        }
        System.out.println("while loop");
        i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
        i=0;
        System.out.println("do while");
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<5);
    }
}