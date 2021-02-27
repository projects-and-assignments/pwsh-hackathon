import java.util.Scanner;

public class triangle 
{
    public static int checkTriange(double a, double b, double c) 
    {
        if (a + b <= c || a + c <= b || b + c <= a)
        {
            System.out.print("NOT A TRIANGLE ");
            return 0;
        }
            
        else
        {
            System.out.print("TRIANGLE ");
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfTimes = input.nextInt();

        for(int i = 0; i < numberOfTimes; i ++)
        {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
    
            if(checkTriange(a, b, c)  == 1)
            {
                if (Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2))
                    System.out.println("ACUTE");
                if (Math.pow(a, 2) + Math.pow(b, 2) ==  Math.pow(c, 2))
                    System.out.println("RIGHT");
                if (Math.pow(a, 2) + Math.pow(b, 2) <  Math.pow(c, 2))
                    System.out.println("OBTUSE");
            }
        }
        input.close();
    }
}