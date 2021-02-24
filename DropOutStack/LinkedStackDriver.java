//*************************************************************************************
//  LinkedStackDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: FEBRUARY 23rd, 2021
//
//  This driver class demonstrates how a modified version of a LinkedStack works and displays
//  information to the user.  More information about how the modified DropOutLinkedStack works is contained
//  in the header of the DropOutLinkedStack.java file.
//*************************************************************************************

public class LinkedStackDriver
{
    private static final int MAX_STACK_SIZE = 5;
    public static void main(String[] args)
    {
        //Creating a LinkedStack of a given size
        DropOutLinkedStack<String> stringLinkedStack = new DropOutLinkedStack<>(MAX_STACK_SIZE);
        stringLinkedStack = pushNamesOnStack(new String[] {"Dustin","Humaira","Manuhran","Sally","Carl"},stringLinkedStack);

        System.out.println("-----------------------------------");
        displayStackInformation(stringLinkedStack);

        System.out.println("-----------------------------------");
        stringLinkedStack = pushNamesOnStack(new String[] {"Zebra"}, stringLinkedStack);
        displayStackInformation(stringLinkedStack);

        System.out.println("-----------------------------------");
        stringLinkedStack = pushNamesOnStack(new String[] {"Car"}, stringLinkedStack);
        displayStackInformation(stringLinkedStack);
    }

    private static DropOutLinkedStack<String> pushNamesOnStack(String[] names, DropOutLinkedStack<String> stringLinkedStack)
    {
        for(int i=0;i<names.length;i++)
        {
            stringLinkedStack.push(names[i]);
        }
        return stringLinkedStack;
    }
    private static <T> void displayStackInformation(DropOutLinkedStack<T> stringLinkedStack)
    {
        System.out.println("Stack Contents:\n" + stringLinkedStack.toString());
        System.out.println("Stack Size: " + stringLinkedStack.size());
        System.out.println("Peek: " + stringLinkedStack.peek());
    }
}
