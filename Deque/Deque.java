//*************************************************************************************
//  Deque.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: FEBRUARY 24th, 2021
//
//  This class handles all the functionality of the Deque.  Special functionality includes
//  adding, removing, and peeking at elements from the front or rear of the queue.
//*************************************************************************************
/**
 * LinkedQueue represents a linked implementation of a queue.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class Deque<T> implements DequeADT<T>
{
    private int count;
    private LinearNode<T> head, tail;

    /**
     * Creates an empty queue.
     */
    public Deque()
    {
        count = 0;
        head = tail = null;
    }

    @Override
    public void enqueueFront(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);
        //Since we're adding from the front, we want to know the head element and the next element
        node.setElement(element);
        node.setNext(head);
        if(head != null)
        {
            //Since we've moved the head node down into the queue, we can set the current head to be our new node
            head.setPrevious(node);
        }
        else if(head == null)
        {
            //If the head is null, we know we're at the tail so set tail to working node
            tail = node;
        }
        //Update the current head to be the newly added node
        head = node;
        count++;
    }

    @Override
    public void enqueueRear(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);
        //Since we're adding to the rear, we want to know an element into the queue up from the rear, plus the rear
        node.setElement(element);
        node.setPrevious(tail);
        if(tail != null)
        {
            //We then set the node after the tail, since we're adding an element
            tail.setNext(node);
        }
        else if(tail == null)
        {
            //If the tail doesn't exist, then we know want the head to be set
            head = node;
        }
        //update tail to be current working tail node
        tail = node;
        count++;
    }

    @Override
    public T dequeueFront()
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        //We want a copy of the next element after head
        LinearNode<T> node = head.getNext();
        if(node != null)
        {
            //Since we have the next node, we can delete the head since that was our goal
            node.setPrevious(null);
        }
        else if(node == null)
        {
            //If the next node is null from the head then head and tail must be the same.
            tail = null;
        }
        //We want to update the head element to be the current node
        T nodeVal = head.getElement();
        head = node;
        count--;
        return nodeVal;
    }

    @Override
    public T dequeueRear()
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        //We need to use the previous node from the Rear
        LinearNode<T> node = tail.getPrevious();

        if(node != null)
        {
            //We set the existing rear node to null, to remove it
            node.setNext(null);
        }
        else if(node == null)
        {
            //If there is no previous node from the rear head & tail must be the same
            head = null;
        }
        //We want to update the tail variable according to the new tail
        T nodeVal = tail.getElement();
        tail = node;
        count--;
        return nodeVal;
    }

    @Override
    public T first()
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        return head.getElement();
    }

    @Override
    public T last()
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        return tail.getElement();
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
        LinearNode<T> current = head;

        while(current != null)
        {
            result = result + current.getElement();
            current = current.getNext();
            //For readability, we want a comma on all but last element displayed
            if(current != null)
            {
                result += ", ";
            }
        }
        return result;
    }
}
