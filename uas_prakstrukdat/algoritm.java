/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_prakstrukdat;

/**
 *
 * @author SUCI WULANDARI - 210605110154
 */
public class algoritm {

    public int maxSize;
    public String[] stackArray;
    public int top;

    public algoritm(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String item) {
        stackArray[++top] = item;
    }

    public void pop() {
        stackArray[top] = null;
        top--;

    }

    public String peek() {

        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {

        return (top == maxSize - 1);

    }
}
