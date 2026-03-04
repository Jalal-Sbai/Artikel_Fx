package com.example.artikel_fx;

// Aufbau der Tabelle
public class Artikel {

    private int id;
    private  String bezeichnung;
    private double preis;
    private  int menge;

    public Artikel(int id, String bezeichnung,double preis, int menge) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.menge = menge;
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }
}
