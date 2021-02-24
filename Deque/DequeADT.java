//*************************************************************************************
//  DequeADT.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: FEBRUARY 24th, 2021
//
//  This is the interface for setting up the Deque functionality.  We've added special functionality
//  that allows the user to add elements to the front and rear of the queue, as well as remove from
//  the front and rear of the queue.  Also the ability to peek at the front and rear elements.
//*************************************************************************************

public interface DequeADT<T>
{
    //Adds one element to the front of this queue
    public void enqueueFront(T element);
    //Adds one element to the rear of this queue
    public void enqueueRear(T element);
    //Adds one element to the rear of this queue
    public T dequeueFront();
    //Adds one element to the rear of this queue
    public T dequeueRear();
    //Peeks at the first element in this queue
    public T first();
    //Peeks at the last element in this queue
    public T last();
    //Returns if the queue is empty or not
    public boolean isEmpty();
    //Returns the size of the queue
    public int size();
    //Returns a string for output to the user
    public String toString();
}
