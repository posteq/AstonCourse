package main.java.by.aston.collections.arraylist;

import java.util.Arrays;

class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T value) {
        ensureCapacity();
        elements[size++] = value;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Clear to let GC do its work
    }

    public void addAll(MyArrayList<T> other) {
        if (other == this) {
            Object[] tmp = new Object[size];
            System.arraycopy(elements, 0, tmp, 0, size);
            for (Object value : tmp) {
                add((T) value);
            }
        } else {
            for (int i = 0; i < other.size(); i++) {
                add((T) other.get(i));
            }
        }
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
