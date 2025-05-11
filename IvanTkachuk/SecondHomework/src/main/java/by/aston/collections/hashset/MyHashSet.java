package main.java.by.aston.collections.hashset;

import java.util.Objects;

public class MyHashSet<T> {
    private Node<T>[] table;
    private int size;
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public MyHashSet() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T value) {
        if (contains(value)) {
            return;
        }
        ensureCapacity();
        int index = getIndex(value);
        Node<T> newNode = new Node<>(value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public void remove(T value) {
        int index = getIndex(value);
        Node<T> current = table[index];
        Node<T> prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean contains(T value) {
        int index = getIndex(value);
        Node<T> current = table[index];
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private int getIndex(T value) {
        return Math.abs(Objects.hashCode(value)) % table.length;
    }

    private void ensureCapacity() {
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }
    }

    private void resize() {
        Node<T>[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;

        for (Node<T> node : oldTable) {
            while (node != null) {
                add(node.value);
                node = node.next;
            }
        }
    }

    public int size() {
        return size;
    }

}
