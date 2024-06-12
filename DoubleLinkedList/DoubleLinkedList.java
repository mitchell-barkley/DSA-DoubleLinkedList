package DoubleLinkedList;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    //Create a DLL
    public DoubleNode createDLL(int nodeValue) {
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    //Insert into a DLL
    public void insertDLL (int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if (head == null) {
            // Create a new DLL
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            // Insert at the beginning
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            // Insert at the end
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        } else {
            // Insert at a specified location
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            newNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseDLL(){
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    // Reverse Traverse a DLL
    public void reverseTraverseDLL(){
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.print("\n");
    }

    // Search for a Node in a DLL
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found!! ");
        return false;
    }

    // Delete a Node in a DLL
    public void deleteNode(int location) {
        if (head == null) {
            System.out.print("The DLL does not exist");
            return;
        } else if (location == 0) {
            // Delete the first node
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            // Delete the last node
            DoubleNode tempNode = tail.prev;
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            // Delete a node from a specified location
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete the entire DLL
    public void deleteDLL() {
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.print("The DLL has been deleted");
    }
}