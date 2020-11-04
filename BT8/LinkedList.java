/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT8;

/**
 *
 * @author dinhc
 */
public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertAndSort(int item) {
        if (isEmpty()) {
            first = last = new Node(item);
        } else if (first.data < item) {
            insertAtFont(item);
        } else if (last.data > item) {
            insertAtBack(item);
        } else {
            Node temp = first;
            while (temp != null) {
                if (temp != last) {
                    Node next = temp.next;
                    if (temp.data >= item && next.data <= item) {
                        Node addNode = new Node(item);//them phan tu item vao linked list
                        temp.next = addNode;
                        addNode.next = next;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
            }
        }
    }

    public void insertAtFont(int item) {
        if (isEmpty()) {
            first = last = new Node(item);
        } else {
            first = new Node(item, first);
        }
    }

    public void insertAtBack(int item) {
        if (isEmpty()) {
            first = last = new Node(item);
        } else {
            last = last.next = new Node(item);
        }
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
