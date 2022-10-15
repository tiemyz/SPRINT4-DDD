package br.com.fiap.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.App;
import br.com.fiap.dao.CandidatoDAO;
import br.com.fiap.model.Candidato;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CandidatoController implements Initializable{

    @FXML private TextField textFieldNomeCand;
    @FXML private TextField textFieldTelCand;
    @FXML private TextField textFieldDataCand;
    @FXML private TextField textFieldCpfCand;
    @FXML private TextField textFieldGeneroCand;
    @FXML private TextField textFieldSenhaCand;
    @FXML private TextField textFieldEmailCand;

    public void salvarCandidato(){
        var candidato = carregarCandidato();
        try {
            CandidatoDAO dao = new CandidatoDAO();
            dao.inserirCandidato(candidato);
            mostrarAlerta("Candidato cadastrado com sucesso!");
            limparFormulario();
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
    }
    
    private void limparFormulario() {
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    private Candidato carregarCandidato() {
        String nomeCandidato = textFieldNomeCand.getText();
        String telCandidato = textFieldTelCand.getText();
        String dataCandidato = textFieldDataCand.getText();
        String cpfCandidato = textFieldCpfCand.getText();
        String generoCandidato = textFieldGeneroCand.getText();
        String senhaCandidato = textFieldSenhaCand.getText();
        String emailCandidato = textFieldEmailCand.getText();

        return new Candidato(nomeCandidato, telCandidato, dataCandidato, cpfCandidato, generoCandidato, senhaCandidato, emailCandidato);
    }

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }
    
}
