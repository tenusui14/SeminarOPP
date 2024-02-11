package main.linkedList.core.lists;

import main.linkedList.core.util.DescendingIterator;
import main.linkedList.core.util.Linked;
import main.linkedList.core.util.Node;

import java.util.Iterator;

public class GBLinkedList<T> implements Linked<T>, Iterable<T>, DescendingIterator<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public GBLinkedList() {
        last = new Node<T>(first,null,null);
        first = new Node<T>(null,null, last);
    }


    @Override
    public void addFirst(T elem) {
    Node<T> next = first;
    next.setCurrentElement(elem);
    first = new Node<T>(null,null,next);
    next.setPrevious(first);
    size++;
    }

    @Override
    public void addLast(T elem) {
        Node<T> prev = last;
        prev.setCurrentElement(elem);
        last = new Node<T>(prev,null,null);
        prev.setNext(last);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        Node<T> result = first.getNext();
        for (int i = 0; i < counter; i++) {
            result = getNextElement(result);
        }
        return result.getCurrentElement();
    }
    private Node<T> getNextElement(Node<T> current){
        return current.getNext();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter< size;
            }

            @Override
            public T next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<T> descendingIterator() {
        return new Iterator<T>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public T next() {
                return getElementByIndex(counter--);
            }
        };
    }
}
