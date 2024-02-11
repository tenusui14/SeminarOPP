package main.linkedList.core.util;

public interface Linked<T> {
void addFirst(T elem);
void addLast(T elem);
int size();
T getElementByIndex(int counter);
}
