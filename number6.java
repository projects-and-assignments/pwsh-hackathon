import java.io.*;
import java.util.*;

public class number6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String[] lines = line.split("[,.;]");
        Arrays.sort(lines);

        for(String s : lines)
        {
            int numberOf = Integer.parseInt(s);
            System.out.println(numberOf);
           // System.out.println(s.toString());       
        }

        
    }
}