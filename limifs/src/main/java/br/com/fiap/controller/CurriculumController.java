package br.com.fiap.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.App;
import br.com.fiap.dao.CurriculumDAO;
import br.com.fiap.model.Curriculum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CurriculumController implements Initializable{

    @FXML private TextField textFieldGrauCurri;
    @FXML private TextField textFieldCursosCurri;
    @FXML private TextField textFieldCertCurri;
    @FXML private TextField textFieldExpCurri;


    public void salvarCurriculo(){
        var curriculum = carregarCurriculum();
        try {
            CurriculumDAO dao = new CurriculumDAO();
            dao.inserirCurriculum(curriculum);
            mostrarAlerta("Currículo cadastrado com sucesso!");
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

    private Curriculum carregarCurriculum() {
        String grauCurriculo = textFieldGrauCurri.getText();
        String cursosCurriculo = textFieldCursosCurri.getText();
        String certCurriculo = textFieldCertCurri.getText();
        String expCurriculo = textFieldExpCurri.getText();

        return new Curriculum(grauCurriculo, cursosCurriculo, certCurriculo, expCurriculo);
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
