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
<<<<<<< HEAD

    public static final double FACTOR = 0.25;
=======
    public final static int FACTOR = 8;
>>>>>>> c7ca16dca9a24a9bf44e123f63764e446214e347

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