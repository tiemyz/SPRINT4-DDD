package br.com.fiap.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Candidato;

public class CandidatoDAO {



    public void inserirCandidato(Candidato candidato) throws SQLException, IOException {

        Connection con = ConnectionFactory.getConnection();

            String sql = "INSERT INTO T_LIM_CANDIDATO (nom_candidato, tel_candidato, data_candidato, cpf_candidato, genero_candidato, senha_candidato, email_candidato) " +
            "VALUES (?,?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            

            stmt.setString(1,candidato.getNomeCandidato());
            stmt.setString(2,candidato.getTelCandidato());
            stmt.setString(3,candidato.getDataCandidato());
            stmt.setString(4,candidato.getCpfCandidato());
            stmt.setString(5,candidato.getGeneroCandidato());
            stmt.setString(6,candidato.getSenhaCandidato());
            stmt.setString(7,candidato.getEmailCandidato());

            stmt.execute();
            con.close();
    }

    public List<Candidato> buscarTodosCandidatos() throws SQLException, IOException {
        List<Candidato> lista = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM T_LIM_CANDIDATO";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            String nomeCandidato = rs.getString("nomeCandidato");
            String telCandidato = rs.getString("telCandidato");
            String dataCandidato = rs.getString("dataCandidato");
            String cpfCandidato = rs.getString("cpfCandidato");
            String generoCandidato = rs.getString("generoCandidato");
            String senhaCandidato = rs.getString("senhaCandidato");
            String emailCandidato = rs.getString("emailCandidato");

            Candidato candidato = new Candidato(nomeCandidato, telCandidato, dataCandidato, cpfCandidato, generoCandidato, senhaCandidato, emailCandidato);
            lista.add(candidato);
        }

        con.close();
        return lista;
    }
}