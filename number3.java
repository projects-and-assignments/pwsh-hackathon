import java.io.*;
import java.util.*;

public class number3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        if(num % 13 == 0 || num % 15 == 0 || num % 17 == 0)
        {
            System.out.println("Meow!");
        }
        else{
            System.out.println("Hiss!");
        }
        
    }
}