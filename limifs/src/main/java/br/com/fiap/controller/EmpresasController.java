package br.com.fiap.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.App;
import br.com.fiap.dao.EmpresasDAO;
import br.com.fiap.model.Empresas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class EmpresasController implements Initializable {

    @FXML private TextField textFieldNomeEmpre;
    @FXML private TextField textFieldLocEmpre;
    @FXML private TextField textFieldTipoEmpre;
    @FXML private TextField textFieldEmailEmpre;
    @FXML private TextField textFieldCnpjEmpre;
    @FXML private TextField textFieldSenhaEmpre;

    public void salvarEmpresa(){
        var empresa = carregarEmpresa();
        try {
            EmpresasDAO dao = new EmpresasDAO();
            dao.inserirEmpresa(empresa);
            mostrarAlerta("Empresa cadastrada com sucesso!");
            limparFormulario();
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
    }

    private void limparFormulario() {
        textFieldNomeEmpre.setText("");
        textFieldLocEmpre.setText("");
        textFieldTipoEmpre.setText("");
        textFieldEmailEmpre.setText("");
        textFieldCnpjEmpre.setText("");
        textFieldSenhaEmpre.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    private Empresas carregarEmpresa() {
        String nomeEmpresa = textFieldNomeEmpre.getText();
        String locEmpresa = textFieldLocEmpre.getText();
        String tipoEmpresa = textFieldTipoEmpre.getText();
        String emailEmpresa = textFieldEmailEmpre.getText();
        String cnpjEmpresa = textFieldCnpjEmpre.getText();
        String senhaEmpresa = textFieldSenhaEmpre.getText();
    
        return new Empresas(nomeEmpresa, locEmpresa, tipoEmpresa, emailEmpresa, cnpjEmpresa, senhaEmpresa);
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






