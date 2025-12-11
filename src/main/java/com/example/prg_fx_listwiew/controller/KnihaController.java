package com.example.prg_fx_listwiew.controller;
import com.example.prg_fx_listwiew.model.Kniha;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;



public class KnihaController {
    @FXML
    private ListView<Kniha> knihaListView;

    private void initialize(){
        Kniha k1 = new Kniha("Pravda Bohů", "Alberto", 2024);
        knihaListView.getItems().add(k1);
        Kniha k2 = new Kniha("Pravda Konce", "Alberto", 2029);
        knihaListView.getItems().add(k2);
    }
}
