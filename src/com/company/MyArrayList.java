package com.company;

import java.util.Arrays;

public class MyArrayList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object obj) {
        if (elements.length == size) {
            int newCapacity = this.elements.length * 2;
            this.elements = Arrays.copyOf(this.elements, newCapacity);
        }
        this.elements[this.size] = obj;
        size++;
    }

    public int size() {
        return this.size;
    }

    public Object get(int index) {
        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", size + " + this.size);
        }
        return this.elements[index];
    }
}
