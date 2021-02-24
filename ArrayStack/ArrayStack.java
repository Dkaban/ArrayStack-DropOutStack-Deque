//*************************************************************************************
//  ArrayStack.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: FEBRUARY 22nd, 2021
//  COURSE: COMP 2231, ASSIGNMENT 2: QUESTION 1
//
//  This class is a modified version of an Array Stack which maintains the top position
//  as the actual top of the stack (instead of using the element above the top).  Then top is
//  incremented or decremented depending on needs, maintaining the actual top position.
//*************************************************************************************

import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class ArrayStack<T> implements StackADT<T>
{
    private final static int DEFAULT_CAPACITY = 10;
    private int top;
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity the initial size of the array
     */
    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity)
    {
        //using 0 points to the element above the stack
        top = -1;

        stack = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     *
     * @param element generic element to be pushed onto stack
     */
    public void push(T element)
    {
        if (size() == stack.length)
            expandCapacity();

        //Since we're working with -1 initially, we need to increment before using it as an index
        top++;
        stack[top] = element;
    }

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     *
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result = stack[top];
        stack[top] = null;
        //Moved the decrement to after we've used it as an index (since we started 1 element in)
        top--;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     *
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top];
    }

    @Override
    public boolean isEmpty()
    {
        return top == -1;
    }

    @Override
    public int size()
    {
        return top;
    }

    public String toString()
    {
        String result = "";
        for(int i=0;i<=top;i++)
        {
            result = result + stack[i];
            if(i != top)
            {
                result += ", ";
            }
        }

        if(result.equals(""))
        {
            result = "Stack is Empty";
        }

        return result;
    }
}