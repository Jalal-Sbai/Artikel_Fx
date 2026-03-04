package com.example.artikel_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ArtikelController {
    // wir brauchen eine Verbindung zur Artikeltabelle
    private Artikeltabelle api = new Artikeltabelle();

    // wir brauchen IDs zu jedem Element auf der FXML
    // in der Tabelle werden Objekte des Typs Artikel angezeigt
    @FXML
    private TableView<Artikel> artikelTabele;

    // wir brauchen für jede Spalte in der tabelle eine ID
    @FXML
    private TableColumn<Artikel, String> colBezeichnung;

    @FXML
    private TableColumn<Artikel, Integer> colId;

    @FXML
    private TableColumn<Artikel, Double> colPreis;

    @FXML
    private TableColumn<Artikel, Integer> colMenge;

    // nachdem der View (fxml) gezeichnet wurde, werden die Daten angezeigt
    // gezeichnet heißt: die xml-hierachy wurde in den Speicher geladen, die fx:ids
    // der Controls im View
    // sind alle bekannt
    @FXML
    public void initialize() {
        // wir elgen fest, welche Eigenschaft vom Objekt artikel in welcher TableColumn
        // angezeigt wird
        colBezeichnung.setCellValueFactory(new PropertyValueFactory<>("bezeichnung"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colPreis.setCellValueFactory(new PropertyValueFactory<>("preis"));
        colMenge.setCellValueFactory(new PropertyValueFactory<>("menge"));

        // liste mit Artikeldaten an den tableView übergeben
        // wenn die Daten in der Liste geändert werden, dann werden die Änderungen in
        // der Anzeige übernommen sofort

        ArrayList<Artikel> liste = api.select();
        if (liste != null) {
            ObservableList<Artikel> data = FXCollections.observableArrayList(liste);
            artikelTabele.setItems(data);
        }
    }
}
