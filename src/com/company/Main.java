package com.company;

public class Main {

    public static void main(String[] args) {
        Fuvarok fuvarok=new Fuvarok("fuvar.csv");
        System.out.println(fuvarok);

        System.out.println("1. feladat: "+fuvarok.getFuvarokSzama()+" db utazás került feljegyzésre az állományban");
        System.out.println("2. feladat: Az adott taxis bevétele: "+fuvarok.getTaxisBevetel(6185)+" Ft volt, amely "+ fuvarok.getTaxisFuvarSzam(6185)+" db fuvarból jött össze");
        System.out.println("3. feladat: A taxisok "+fuvarok.getMerfold()+" mérföldet tettek meg összesen");
        System.out.println("4. feladat: A leghosszab idejű fuvar adatai: "+ fuvarok.getLeghosszabIdo());
        System.out.println("5. feladat: "+fuvarok.getLegtobbBorravalo());
        System.out.println("6. feladat: Az adott taxis összen "+fuvarok.getTaxisKm(4261)+" km-t tett meg");
        System.out.println("7. feladat: Hibás sorok száma: "+ fuvarok.getHibasSorokSzama()+"\n\t\t\t összes időtartama: "+fuvarok.getHibasSorokUtazasIdotartama()+"\n\t\t\t teljes bevétel: "+fuvarok.getHibasSorokTeljesBevetele());
        System.out.println("8. feladat: "+fuvarok.getSzerepelE(1452));
        System.out.println("9. feladat: A 3 legrövidebb fuvar adatai"+fuvarok.getLegrovidebb3());
        System.out.println("10. feladat: December 24.-én "+fuvarok.getFuvarSzamAdottIdopontban("12-24")+" darab fuvar volt.");
        System.out.println("11. feladat: December 31.-én "+fuvarok.getBorravaloAdottIdopontban("12-31")+" arányban adtak borravalót.");
    }
}
