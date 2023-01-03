/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_prakstrukdat;

/**
 *
 * @author SUCI WULANDARI - 210605110154
 */
public class algQueue {

    public int maxSize;
    public String[] queArray;
    public int front;
    public int rear;
    public int nItems;

    public algQueue(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String value) {
        if (isFull()) {
            //System.out.println("Maaf " + value + ", antrian masih penuh");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }

            queArray[++rear] = value;
            //System.out.println(value + " masuk antrian");
            nItems++;
        }
    }

    public String remove() {

        String temp = queArray[front];
        queArray[front] = "null";
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void display() {

        int temp = this.front;
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[front++] + " ");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println();
        front = temp;
    }
}
