package src.com.revature.utils;

import java.lang.Exception;

public class List <T> {
    Node<T> head;
    Node<T> tail;

    public T get (int index) {
        Node<T> returnNode = head;
        for (int i = 0; i < index; i++) {
            if (returnNode.next == null) {
                // throw new Exception (String.format("List index out of range at [%i]", i+1));
            }
            returnNode = returnNode.next;
        }
        return returnNode.value;
    }

    public void add (T value) {
        Node<T> current = head;
        if (current == null) {
            head = new Node<T>(value);
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(value);
    }

    public void remove (T value) {
        throw new UnsupportedOperationException();
    }

    public T removeAtIndex (int index) throws Exception {
        Node<T> returnNode = head;
        Node<T> prevNode = null;
        for (int i = 0; i < index; i++) {
            if (returnNode.next == null) {
                throw new Exception (String.format("List index out of range at [%i]", i+1));
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
