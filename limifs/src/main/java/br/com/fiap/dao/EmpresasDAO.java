package br.com.fiap.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Empresas;

public class EmpresasDAO {

    public void inserirEmpresa(Empresas empresas) throws SQLException, IOException {

        Connection con = ConnectionFactory.getConnection();

            String sql = "INSERT INTO T_LIM_EMPRESA (nom_empresas, loc_empresas, tipo_empresas, email_empresas, cnpj_empresas, senha_empresas) " +
            "VALUES (?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            

            stmt.setString(1,empresas.getNomeEmpresas());
            stmt.setString(2,empresas.getLocEmpresas());
            stmt.setString(3,empresas.getTipoEmpresas());
            stmt.setString(4,empresas.getEmailEmpresas());
            stmt.setString(5,empresas.getCnpjEmpresas());
            stmt.setString(6,empresas.getSenhaEmpresas());

            stmt.execute();
            con.close();
    }

    public List<Empresas> buscarTodosEmpresas() throws SQLException, IOException {
        List<Empresas> lista = new ArrayList<>();
    
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM T_LIM_EMPRESA";
        ResultSet rs = stmt.executeQuery(sql);
    
        while(rs.next()){
            String nomeEmpresas = rs.getString("nomeEmpresas");
            String locEmpresas = rs.getString("locEmpresas");
            String tipoEmpresas = rs.getString("tipoEmpresas");
            String emailEmpresas = rs.getString("emailEmpresas");
            String cnpjEmpresas = rs.getString("cnpjEmpresas");
            String senhaEmpresas = rs.getString("senhaEmpresas");
    
            Empresas empresas = new Empresas(nomeEmpresas, locEmpresas, tipoEmpresas, emailEmpresas, cnpjEmpresas, senhaEmpresas);
            lista.add(empresas);
        }
    
        con.close();
        return lista;
    }
}

