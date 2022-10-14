package br.com.fiap.controller;

import java.io.IOException;

import br.com.fiap.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
