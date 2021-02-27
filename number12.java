import java.util.*;
public class number12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(); 

        String names = input.nextLine();
        String[] sortedNames = names.split(" ");
        

        for(String n : sortedNames)
        {
            list.add(n);
        }
        System.out.println("Collections: ");
        Collections.sort(list);
        System.out.println(list);
        
    }
}
