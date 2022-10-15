package br.com.fiap.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.App;
import br.com.fiap.dao.LoginDAO;
import br.com.fiap.model.Login;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController implements Initializable {

    @FXML private TextField textFieldUserLogin;
    @FXML private TextField textFieldPasswordLogin;


    public void salvarLogin(){
        var login = carregarLogin();
        try {
            LoginDAO dao = new LoginDAO();
            dao.inserirLogin(login);
            mostrarAlerta("Login realizado!");
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

    private Login carregarLogin() {
        String userLogin = textFieldUserLogin.getText();
        String passwordLogin = textFieldPasswordLogin.getText();

        return new Login(userLogin, passwordLogin);
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
