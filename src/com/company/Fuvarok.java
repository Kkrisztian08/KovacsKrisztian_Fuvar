package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Fuvarok {
    private List<Fuvar> fuvarokLista;

    public Fuvarok(String fileName){

        fuvarokLista= new LinkedList<>();

        try {
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            br.readLine();
            String line =br.readLine();
            while (line!=null){
                fuvarokLista.add(new Fuvar(line));
                line=br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public long getFuvarokSzama(){
        return fuvarokLista.stream().count();
    }

    public double getTaxisBevetel(int taxi_id) {
        return fuvarokLista.stream()
                .filter(fuvar -> fuvar.getTaxi_id() == taxi_id).mapToDouble(fuvar -> fuvar.getViteldij() + fuvar.getBorravalo()).sum();
    }

    public long getTaxisFuvarSzam(int taxi_id) {
        return fuvarokLista.stream()
                .filter(fuvar -> fuvar.getTaxi_id() == taxi_id).count();
    }

    public double getMerfold(){
        return fuvarokLista.stream().mapToDouble(fuvar ->fuvar.getTavolsag()).sum();
    }

    public Fuvar getLeghosszabIdo(){
        return fuvarokLista.stream().max(Comparator.comparingInt(fuvar -> fuvar.getIdotartam())).get();
    }

    public Fuvar getLegtobbBorravalo() {
        return fuvarokLista.stream().max(Comparator.comparingDouble(Fuvar::getBorravalo)).get();
    }


    @Override
    public String toString() {
        String s = "";
        for (Fuvar fuvar : fuvarokLista) {
            s += fuvar + "\n";
        }
        return s;
    }
}
