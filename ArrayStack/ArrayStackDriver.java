//*************************************************************************************
//  ArrayStackDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: FEBRUARY 22nd, 2021
//
//  This is the driver class for demonstrating a modified version of the ArrayStack method where the top element
//  is actually the top (instead of above the top).  Displays outputs to the user and also shows that
//  the implementation is working correctly through calling and displaying modified methods.
//*************************************************************************************
public class ArrayStackDriver
{
    public static void main(String[] args)
    {
        //Creating an ArrayStack of a given size
        ArrayStack<String> arrayStack = new ArrayStack<>(4);

        arrayStack.push("First");
        arrayStack.push("Second");
        arrayStack.push("Third");
        arrayStack.push("Fourth");

        stackDisplays(arrayStack);
    }

    private static <T> void stackDisplays(ArrayStack<T> arrayStack)
    {
        //Loop through the Array displaying the elements, the size, and the pop each time
        while(!arrayStack.isEmpty())
        {
            System.out.println("-----------------------------------");
            displayStackChanges(arrayStack);
            System.out.println("Stack: " + arrayStack.toString());
        }
    }

    private static <T> void displayStackChanges(ArrayStack<T> arrayStack)
    {
        //Displays the stack, peeks at an element, then pops that element
        System.out.println("Stack: " + arrayStack.toString());
        System.out.println("Peek: " + arrayStack.peek());
        System.out.println("Popping: " + arrayStack.pop());
        System.out.println("-----------------------------------");
    }
}
