package br.com.fiap.controller;

import java.io.IOException;

import br.com.fiap.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToCandidato() throws IOException {
        App.setRoot("candidato");
    }

    @FXML
    private void switchToCurriculum() throws IOException {
        App.setRoot("curriculo");
    }

    @FXML
    private void switchToComunidade() throws IOException {
        App.setRoot("comunidade");
    }

    @FXML
    private void switchToVagas() throws IOException {
        App.setRoot("vagas");
    }

    @FXML
    private void switchToSaibaMais() throws IOException {
        App.setRoot("saiba_mais");
    }

    @FXML
    private void switchToPerfil() throws IOException {
        App.setRoot("perfil");
    }

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }

    @FXML
    private void switchToEmpresas() throws IOException {
        App.setRoot("empresas");
    }
}
