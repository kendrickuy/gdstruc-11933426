package com.kenuy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cars> carsList = new ArrayList<>();

        carsList.add(new Cars(850000, "FordEverest", 2016));
        carsList.add(new Cars(450000, "HyundaiAccent", 2019));
        carsList.add(new Cars(798000, "NissanNV350", 2020));
        carsList.add(new Cars(728000, "NissanNV350", 2017));
        carsList.add(new Cars(758000, "HyundaiH100", 2020));

//       carsList.forEach(Cars -> System.out.println(Cars));

//        System.out.println(carsList.contains(new Cars(728000,"NissanNV350", 2017)));

//        System.out.println(carsList.indexOf(new Cars(728000,"NissanNV350", 2017)));




















    }
}
