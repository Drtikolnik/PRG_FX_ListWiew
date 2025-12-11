module com.example.prg_fx_listwiew {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prg_fx_listwiew to javafx.fxml;
    opens com.example.prg_fx_listwiew.controller to javafx.fxml;
    opens com.example.prg_fx_listwiew.model to javafx.fxml;
    exports com.example.prg_fx_listwiew;
}