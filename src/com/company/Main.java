package com.company;

public class Main {

    public static void main(String[] args) {
        Fuvarok fuvarok=new Fuvarok("fuvar.csv");
        System.out.println(fuvarok);

        System.out.println("1. feladat: "+fuvarok.getfuvarokSzama()+" db utazás került feljegyzésre az állományban");
    }
}
