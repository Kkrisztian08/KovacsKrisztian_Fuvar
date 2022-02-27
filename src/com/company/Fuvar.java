package com.company;

public class Fuvar {
    private int taxi_id;
    private String indulas;
    private int idotartam;
    private double tavolsag;
    private double viteldij;
    private double borravalo;
    private String fizetes_modja;

    public Fuvar(String s){
        String[] datas=s.split(";");
        this.taxi_id=Integer.parseInt(datas[0]);
        this.indulas=datas[1];
        this.idotartam=Integer.parseInt(datas[2]);
        this.tavolsag=Double.parseDouble(datas[3]);
        this.viteldij=Double.parseDouble(datas[4]);
        this.borravalo=Double.parseDouble(datas[5]);
        this.fizetes_modja =datas[6];
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        this.taxi_id = taxi_id;
    }

    public String getIndulas() {
        return indulas;
    }

    public void setIndulas(String indulas) {
        this.indulas = indulas;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public void setIdotartam(int idotartam) {
        this.idotartam = idotartam;
    }

    public double getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(double tavolsag) {
        this.tavolsag = tavolsag;
    }

    public double getViteldij() {
        return viteldij;
    }

    public void setViteldij(double viteldij) {
        this.viteldij = viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public void setBorravalo(double borravalo) {
        this.borravalo = borravalo;
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }

    public void setFizetes_modja(String fizetes_modja) {
        this.fizetes_modja = fizetes_modja;
    }

    @Override
    public String toString() {
        return String.format("%-8d %-20s %10d mp %10.2f m %10.2f $ %10.2f $ %12s",
                taxi_id, indulas, idotartam, tavolsag, viteldij, borravalo, fizetes_modja);
    }
}
