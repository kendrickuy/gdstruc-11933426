package com.kenuy;

public class Main {

    public static void main(String[] args) {

        Cars FordEverest = new Cars(850000, "FordEverest", 2016);
        Cars HyundaiAccent = new Cars(450000, "HyundaiAccent", 2019);
        Cars NissanNV350 = new Cars(798000, "NissanNV350", 2020);
        Cars HyundaiH100 = new Cars(758000, "HyundaiH100", 2020);
        Cars NissanUrvanPremium = new Cars(1150000, "NissanUrvanPremium", 2018);

        CarsLinkedList carsLinkedList = new CarsLinkedList();

        carsLinkedList.addToFront(HyundaiAccent);
        carsLinkedList.addToFront(HyundaiH100);
        carsLinkedList.addToFront(NissanNV350);
        carsLinkedList.addToFront(FordEverest);
        carsLinkedList.addToFront(NissanUrvanPremium);

        carsLinkedList.printList();
//        //1. Remove function
//        System.out.println("After removing first element: ");
//        carsLinkedList.removeFirst(); carsLinkedList.printList();
//
//        //2. Element count
//        System.out.println("Element Count:"); carsLinkedList.countElements();

        //3. Contains()
//        System.out.println(carsLinkedList.contains(new Cars(1150000, "NissanUrvanPremium", 2018)));


        //4. IndexOf()



}
}
