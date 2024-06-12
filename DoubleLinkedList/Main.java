package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertDLL(1, 0);
        doubleLinkedList.insertDLL(2, 1);
        doubleLinkedList.insertDLL(3, 2);
        doubleLinkedList.insertDLL(4, 3);
        doubleLinkedList.insertDLL(5, 4);
        doubleLinkedList.insertDLL(6, 5);
        doubleLinkedList.traverseDLL();
        System.out.println();
        doubleLinkedList.reverseTraverseDLL();
        System.out.println();
        doubleLinkedList.searchNode(4);
        System.out.println();
        doubleLinkedList.deleteNode(0);
        doubleLinkedList.deleteNode(3);
        doubleLinkedList.traverseDLL();
        System.out.println();
        doubleLinkedList.deleteDLL();
        System.out.println();
        doubleLinkedList.traverseDLL();
        System.out.println();
    }
}
