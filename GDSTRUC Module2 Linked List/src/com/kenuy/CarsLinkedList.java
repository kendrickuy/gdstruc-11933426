package com.kenuy;

import java.util.NoSuchElementException;
import java.util.Objects;

public class CarsLinkedList {
    private CarsNode head;

    public void addToFront(Cars cars)
    {
        CarsNode carsNode = new CarsNode(cars);
        carsNode.setNextCars(head);
        head = carsNode;
    }


    public void printList()
    {
        CarsNode current = head;
        System.out.print("HEAD > ");
        while (current != null)
        {
            System.out.print(current.getCars());
            System.out.print(" > ");
            current = current.getNextCars();
        }
        System.out.println("null");
    }

    private void remove(CarsNode head){
    }

    public void removeFirst()
    {
        CarsNode current = head;
        remove(head);
        head = current.getNextCars();
    }


    public void countElements()
    {
        CarsNode current = head;
        int count = 0;
        while(current != null)
        {
            current = current.getNextCars();
            count++;
        }
        System.out.println(count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarsLinkedList that = (CarsLinkedList) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }


    public boolean contains(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarsLinkedList that = (CarsLinkedList) o;
        return Objects.equals(head, that.head);
    }
}

