package com.example.artikel_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private TableView<Artikel> tableView;

    @FXML
    private TableColumn<Artikel, String> nameColumn;

    @FXML
    private TableColumn<Artikel, Double> priceColumn;

    private final ObservableList<Artikel> artikelListe = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableView.setItems(artikelListe);
    }

    @FXML
    protected void addArtikel() {
        artikelListe.add(new Artikel(1, "Neuer Artikel", 9.99, 1));
    }
}