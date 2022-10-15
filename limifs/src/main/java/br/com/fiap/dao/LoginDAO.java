package br.com.fiap.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Login;


public class LoginDAO {

    public void inserirLogin(Login login) throws SQLException, IOException {

        Connection con = ConnectionFactory.getConnection();

            String sql = "INSERT INTO T_LIM_LOGIN (user_login, password_login) " +
            "VALUES (?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,login.getUserLogin());
            stmt.setString(2,login.getPasswordLogin());

            stmt.execute();
            con.close();
    }

    public List<Login> buscarTodosLogins() throws SQLException, IOException {
        List<Login> lista = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM T_LIM_LOGIN";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            String userLogin = rs.getString("userLogin");
            String passwordLogin = rs.getString("passwordLogin");

            Login login = new Login(userLogin, passwordLogin);
            lista.add(login);
        }

        con.close();
        return lista;
    }
}