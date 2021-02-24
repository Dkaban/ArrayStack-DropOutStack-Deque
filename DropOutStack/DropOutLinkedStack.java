//*************************************************************************************
//  DropOutLinkedStack.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: FEBRUARY 23rd, 2021
//
//  This class is a modified version of a LinkedStack.  It maintains a constant size and essentially
//  nulls out the 'oldest' element in the stack to allow placement of a new node.
//  The bottom element is lost when n+1 elements is pushed onto the top.
//*************************************************************************************

/**
 * Represents a linked implementation of a stack.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class DropOutLinkedStack<T> implements StackADT<T>
{
    private int maxStackSize;
    private int count;
    private LinearNode<T> top;

    /**
     * Creates an empty stack.
     */
    public DropOutLinkedStack(int stackSize)
    {
        count = 0;
        top = null;
        maxStackSize = stackSize;
    }

    /**
     * Adds the specified element to the top of this stack.
     *
     * @param element element to be pushed on stack
     */
    public void push(T element) {
        LinearNode<T> temp = new LinearNode<T>(element);
        temp.setNext(top);
        top = temp;
        count++;

        if(count > maxStackSize)
        {
            LinearNode<T> node = top;
            while(node.getNext().getNext() != null)
            {
                node = node.getNext();
            }

            node.setNext(null);
            count--;
        }
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     *
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    @Override
    public T peek()
    {
        if(isEmpty())
        {
            throw new EmptyCollectionException("stack");
        }

        return top.getElement();
    }

    @Override
    public boolean isEmpty()
    {
        return count == 0;
    }

    @Override
    public int size()
    {
        return count;
    }

    public String toString()
    {
        String result = "";
        LinearNode current = top;

        while (current != null)
        {
            result = result + current.getElement();
            current = current.getNext();

            //Adding a comma, for better readability
            if(current != null)
            {
                result += ", ";
            }
        }

        return result;
    }
}
