package Week1.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * {@inheritDoc}
 */

// A LinkedIntList object can be used to store a list of integers.
public class LinkedIntList {
    private ListNode front;   // node holding first value in list (null if empty)

    // Constructs an empty list.
    public LinkedIntList() {
        front = null;
    }

    // Constructs a list containing the given elements.
    public LinkedIntList(int... elements) {
        this("front", elements);
    }

    public LinkedIntList(String name, int... elements) {
        // string to print for front of list
        if (elements.length <= 0) {
            return;
        }
        front = new ListNode(elements[0]);
        ListNode current = front;
        for (int i = 1; i < elements.length; i++) {
            current.next = new ListNode(elements[i]);
            current = current.next;
        }
    }

    // Appends the given value to the end of the list.
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // Inserts the given value at the given index in the list.
    // Precondition: 0 <= index <= size
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    public boolean equals(Object o) {
        if (o instanceof LinkedIntList) {
            LinkedIntList other = (LinkedIntList) o;
            return toString().equals(other.toString());   // hackish
        } else {
            return false;
        }
    }

    // Returns the integer at the given index in the list.
    // Precondition: 0 <= index < size
    public int get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Removes the value at the given index from the list.
    // Precondition: 0 <= index < size
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    // Deletes and returns the last value in the list.
    public int deleteBack() {
        // Check if the list is empty
        if (front == null) {
            throw new NoSuchElementException("List is empty.");
        }

        // If there's only one node, return its value and set front to null
        if (front.next == null) {
            int value = front.data;
            front = null;
            return value;
        }

        // Traverse to the second-to-last node
        ListNode current = front;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        // Now 'current' is the second-to-last node
        int value = current.next.data;  // Save the value of the last node
        current.next = null;            // Remove the last node
        return value;
    }

    // Returns the number of elements in the list.
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Returns a text representation of the list.
    public String toString() {
        String result = "[";
        ListNode current = front;
        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        result += "]";
        return result;
    }

    // ListNode class definition.
    public static class ListNode {
        public int data;          // data stored in this node
        public ListNode next;     // link to next node in the list

        // Constructs a node with given data and given link
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        // Constructs a node with data 0 and null link
        public ListNode() {
            this(0, null);
        }

        // Constructs a node with given data and null link
        public ListNode(int data) {
            this(data, null);
        }
    }
}


