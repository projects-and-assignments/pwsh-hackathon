class main
{
    public static void main(String[] args)
    {
        System.out.println("I'm ready for the competition!");
    }
}

class myObj 
{
    // instance fields
    private int myInt;
    private String myString;
    public final static int FACTOR = 8;

    // constructors
    public myObj(int myVar, String myString)
    {
        this.myInt = myVar;
        this.myString = myString;
    }

    // accessors
    public int getInt()
    {
        return myInt * FACTOR;
    }
    
    public String getString()
    {
        return myString;
    }

    // mutators
    public void setInt(int newInt)
    {
        myInt = newInt;
    }
    
    public void setString(String newString)
    {
        myString = newString;
    }
}