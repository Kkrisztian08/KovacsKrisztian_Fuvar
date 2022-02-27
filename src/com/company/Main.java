package com.company;

public class Main {

    public static void main(String[] args) {
        Fuvarok fuvarok=new Fuvarok("fuvar.csv");
        System.out.println(fuvarok);

        System.out.println("1. feladat: "+fuvarok.getFuvarokSzama()+" db utazás került feljegyzésre az állományban");
        System.out.println("2. feladat: Az adott taxis bevétele: "+fuvarok.getTaxisBevetel(6185)+" Ft volt, amely "+ fuvarok.getTaxisFuvarSzam(6185)+" db fuvarból jött össze");
        System.out.println("3. feladat: A taxisok "+fuvarok.getMerfold()+" mérföldet tettek meg összesen");
    }
}
