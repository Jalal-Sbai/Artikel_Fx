package com.example.artikel_fx;

import java.util.ArrayList;
//hier alle Operationen zur Zugriff auf Tabelle
public class Artikeltabelle
{
    //Liste mit Testdaten
    private ArrayList<Artikel> liste;

    //Konstruktor, um liste mit Testdaten zu füllen
    public Artikeltabelle()
    {
        liste = new ArrayList<>();
        liste.add(new Artikel(1, "Hose", 23.45, 10));
        liste.add(new Artikel(2, "Hemd", 19.99, 12));
        liste.add(new Artikel(3, "Socken", 5.89, 20));
    }

    //alles ausgeben
    public ArrayList<Artikel> select()
    {
        return liste;
    }

    //Überladene Methode
    public ArrayList<Artikel> select(double maxPreis)
    {
        ArrayList<Artikel> suche = new ArrayList<>();
        for(Artikel a : liste)
        {
            if(a.getPreis() <= maxPreis)
            {
                suche.add(a);
            }
        }
        return suche;
    }

    public boolean insert(int id, String bezeichnung, double preis, int menge)
    {
        liste.add(new Artikel(id, bezeichnung, preis, menge));
        return true;
    }

    public boolean delete(int id)
    {
        boolean gefunden = false;
        for(int i = 0; i < liste.size(); i++)
        {
            if(liste.get(i).getId() == id)
            {
                liste.remove(i);
                gefunden = true;
                break;
            }
        }
        return gefunden;
    }

    //update
    public boolean update(int id, double preis)
    {
        boolean gefunden = false;
        for(Artikel a : liste)
        {
            if(a.getId() == id)
            {
                a.setPreis(preis);
                gefunden = true;
                break;
            }
        }
        return gefunden;
    }
}