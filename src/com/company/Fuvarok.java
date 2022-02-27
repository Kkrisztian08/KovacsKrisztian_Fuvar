package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    @Override
    public String toString() {
        String s = "";
        for (Fuvar fuvar : fuvarokLista) {
            s += fuvar + "\n";
        }
        return s;
    }
}
