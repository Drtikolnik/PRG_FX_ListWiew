package com.example.prg_fx_listwiew.controller;
import com.example.prg_fx_listwiew.model.Kniha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KnihaControllerObservable {
    private ObservableList<Kniha> knihy = FXCollections.observableArrayList();

    @FXML
    private ListView<Kniha> knihaListView;

    @FXML private Label titulLabel;
    @FXML private Label autorLabel;
    @FXML private Label rokLabel;

    @FXML private TextField titulField;
    @FXML private TextField autorField;
    @FXML private TextField rokField;

    @FXML private Button button1;

    @FXML
    public void initialize(){
        knihy.add(new Kniha("Pravda Bohů", "Alberto", 2024));
        knihy.add(new Kniha("Pravda Konce", "Alberto", 2029));
        knihaListView.setItems(knihy);
    }

    public void handleVyberKnihu(){
        titulLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokLabel.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
    }

    public void handlePridatKnihu(){
        knihy.add(new Kniha(titulField.getText(), autorField.getText(), Integer.parseInt(rokField.getText())));
        titulLabel.setText(titulField.getText());
        autorLabel.setText(autorField.getText());
        rokLabel.setText(String.valueOf(rokField.getText()));
        titulField.clear();
        autorField.clear();
        rokField.clear();
    }




















}
