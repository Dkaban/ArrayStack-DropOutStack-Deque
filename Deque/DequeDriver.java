//*************************************************************************************
//  DequeDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: FEBRUARY 23rd, 2021
//  COURSE: COMP 2231, ASSIGNMENT 2: QUESTION 3
//
//  This class demonstrates the functionality of the modified version of the Deque to the user.
//  We display enqueueing from the front and rear, de-queuing from the front and rear,
//  and peeking from the front and rear.  As well as display the queue and its size.
//*************************************************************************************

public class DequeDriver
{
    public static void main(String[] args)
    {
        Deque<String> deque = new Deque<>();

        System.out.println("-----------------------------------");
        System.out.println("Enqueue From Front: ");
        deque.enqueueFront("Potato");
        deque.enqueueFront("Orange");
        deque.enqueueFront("Strawberry");
        deque.enqueueFront("Banana");
        System.out.println(deque.toString());
        System.out.println("Size: " + deque.size());
        System.out.println("Front: " + deque.first());
        System.out.println("Rear: " + deque.last());
        System.out.println("-----------------------------------");
        System.out.println("Enqueue From Rear: ");
        deque.enqueueRear("CAR");
        System.out.println(deque.toString());
        System.out.println("Size: " + deque.size());
        System.out.println("Front: " + deque.first());
        System.out.println("Rear: " + deque.last());
        System.out.println("-----------------------------------");
        System.out.println("Dequeue From Front: ");
        deque.dequeueFront();
        System.out.println(deque.toString());
        System.out.println("Size: " + deque.size());
        System.out.println("Front: " + deque.first());
        System.out.println("Rear: " + deque.last());
        System.out.println("-----------------------------------");
        System.out.println("Dequeue From Rear: ");
        deque.dequeueRear();
        System.out.println(deque.toString());
        System.out.println("Size: " + deque.size());
        System.out.println("Front: " + deque.first());
        System.out.println("Rear: " + deque.last());
    }
}
