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

    // constructors
    public myObj(int myVar)
    {
        this.myInt = myVar;
    }

    // accessors
    public int getInt()
    {
        return myInt;
    }

    // mutators
    public void setInt(int newInt)
    {
        myInt = newInt;
    }
}