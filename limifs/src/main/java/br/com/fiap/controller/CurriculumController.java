package br.com.fiap.controller;

import java.io.IOException;

import br.com.fiap.App;
import javafx.fxml.FXML;

public class CurriculumController {

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }
    
}
