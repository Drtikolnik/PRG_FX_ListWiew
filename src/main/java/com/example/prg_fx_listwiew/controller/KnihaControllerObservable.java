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
    @FXML private TextField najitField;

    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;

    @FXML
    public void initialize(){
        knihy.add(new Kniha("Pravda Bohů", "Alberto", 2024)); //Teles
        knihy.add(new Kniha("Pravda Světla", "Alberto", 2025)); //Liren
        knihy.add(new Kniha("Pravda Prvních", "Alberto", 2026)); //Olrim
        knihy.add(new Kniha("Pravda Konce", "Alberto", 2027)); //Ralok-Irlma
        knihy.add(new Kniha("Pravda Počátku", "Alberto", 2029)); //Nalis
        knihaListView.setItems(knihy);
    }

    public void handleVyberKnihu(){
        titulLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorLabel.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokLabel.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
        titulField.setText(knihaListView.getSelectionModel().getSelectedItem().getTitul());
        autorField.setText(knihaListView.getSelectionModel().getSelectedItem().getAutor());
        rokField.setText(String.valueOf(knihaListView.getSelectionModel().getSelectedItem().getRokVydani()));
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

    public void handleOdebratKnihu(){
        if(knihaListView.getSelectionModel().getSelectedItem() == null){

        }else{
            knihy.remove(knihaListView.getSelectionModel().getSelectedItem());
        }

    }

    public void handleUpravitKnihu(){
        if(knihaListView.getSelectionModel().getSelectedItem() == null){

        }else{
            handleOdebratKnihu();
            handlePridatKnihu();
            //knihaListView.refresh();
        }
    }

    public void handleNajitKnihu(){

        for(Kniha k : knihy){
            if(najitField.getText().equals(k.getTitul())){
                knihaListView.getSelectionModel().select(k);
                handleVyberKnihu();
                return;
            }
        }

    }






















}
