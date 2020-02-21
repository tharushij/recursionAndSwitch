public class MyRecursionClass
{//cailey eatmon
    public static void main(String args[])
    {
        counting(2);
    } //driver with a call to a recursive method

    public static void counting(int num)
    {
        if(num > 0)
        {
            counting(num-1); //this is the recursive call
        } //end if to get to base case
        switch(num) //anything you can do with a switch block you can do with a conditional
        {
            case 1: //enacts when num contains 1
                System.out.println("one");
                break;
            case 2: //enacts when num contains 2
                System.out.println("two");
                break;
            case 3: //enacts when num contains 3
                System.out.println("three");
                break;
        } //end switch block
    } //recursive method with a switch case
}
