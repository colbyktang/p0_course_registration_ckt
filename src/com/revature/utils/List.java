package src.com.revature.utils;

import java.lang.Exception;
import java.lang.RuntimeException;

public class List <T> {
    Node<T> head;
    Node<T> tail;

    public List () {}

    public List (T[] arr) {
        for (T item : arr) {
            add(item);
        }
    }

    public T get (int index) {
        Node<T> returnNode = head;
        for (int i = 0; i < index; i++) {
            if (returnNode.next == null) {
                // throw new RunTimeException (String.format("List index out of range at [%i]", i+1));
            }
            returnNode = returnNode.next;
        }
        return returnNode.value;
    }

    // Add new node at the end
    public void add (T value) {
        if (head == null) {
            head = new Node<T>(value);
            tail = head;
            return;
        }
        else {
            tail.next = new Node<T>(value);
            tail = tail.next;
        }
    }

    public void remove (T value) {
        throw new UnsupportedOperationException();
    }

    public T removeAtIndex (int index) {
        Node<T> returnNode = head;
        Node<T> prevNode = null;
        for (int i = 0; i < index; i++) {
            if (returnNode.next == null) {
                // throw new RunTimeException (String.format("List index out of range at [%i]", i+1));
            }
            prevNode = returnNode;
            returnNode = returnNode.next;
        }
        if (returnNode.next != null) {
            prevNode.next = returnNode.next;
        }
        else {
            prevNode.next = null;
        }
        return returnNode.value;
    }

    @Override
    public String toString () {
        String retString = "{";
        Node<T> current = head;

        while (current != null) {
            retString += (current.value.toString());
            if (current.next != null) {
                retString += ", ";
            }
            current = current.next;
        }
        retString += "}";
        return retString;
    }
}
