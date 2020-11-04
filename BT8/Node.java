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
public class Node {

    int data;
    Node next;

    public Node() {
    }

    public Node(int value) {
        data = value;
        next = null;
    }

    public Node(int value, Node node) {
        data = value;
        next = node;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
