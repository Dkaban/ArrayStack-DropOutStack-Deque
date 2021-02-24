//*************************************************************************************
//  Deque.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: FEBRUARY 24th, 2021
//  COURSE: COMP 2231, ASSIGNMENT 2: QUESTION 3
//
//  This class has been modified to include getPrevious and setPrevious functionality for use in
//  our modified Deque class.
//*************************************************************************************

/**
 * Represents a node in a linked list.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class LinearNode<T>
{
    private LinearNode<T> next;
    private LinearNode<T> previous;
    private T element;
    /**
     * Creates an empty node.
     */
    public LinearNode()
    {
        next = null;
        element = null;
    }
    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public LinearNode(T elem)
    {
        next = null;
        element = elem;
    }

    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public LinearNode<T> getNext() {
        return next;
    }

    //We need to be able to track the previous node for deque purposes
    public LinearNode<T> getPrevious() { return previous; }

    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(LinearNode<T> node) {
        next = node;
    }

    //We need to be able to set the previous node for deque purposes
    public void setPrevious(LinearNode<T> node) { previous = node; }

    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public T getElement() {
        return element;
    }
    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(T elem
    )
    {
        element = elem
        ;
    }
}