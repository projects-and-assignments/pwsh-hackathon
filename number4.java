import java.io.*;
import java.util.*;

public class number4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int z1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int z2 = input.nextInt();

        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - x1, 2)));   
    }
}