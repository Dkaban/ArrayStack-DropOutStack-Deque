# ArrayStack-DropOutStack-Deque

## Language: Java
## IDE: IntelliJ
This repo demonstrates modified version of an ArrayStack, a Drop-Out Stack and a Deque in Java

### ArrayStack
The original implementation used an element that was actually the next element in the array, not the ACTUAL top.
This modified version:
- Uses the actual top of the stack in its implementation.
- Starts at -1 and then icrements and decrements at the appropriate places

### Drop-Out Stack
A Drop-Out Stack is just like a regular stack, but it is of a fixed size.  That means that when an element is added, the bottom element is lost when an element is pushed onto the stack.
- The DropOutStack folder contains all the scripts necessary to run a drop-out stack implementation.

### Deque
A double ended queue (Deque) allows for adding, removing, and peeking at elements at the front or rear of the queue.  
- This is my own implementation rather than using the default Java API for deque
- The intention was to learn how a deque works.
