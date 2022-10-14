package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fiap.model.Candidato;

public class CandidatoDAO {



    public void cadastrar(Candidato candidato) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        var stm = con.prepareStatement(
            "INSERT INTO T_LIMIFS_CANDIDATO (nom_candidato, tel_candidato, data_candidato, cpf_candidato, genero_candidato, senha_candidato, email_candidato) " +
            "VALUES (?,?,?,?,?,?,?)"
            );

        stm.setString(1,candidato.getNomeCandidato());
        stm.setString(2,candidato.getTelCandidato());
        stm.setString(3,candidato.getDataCandidato());
        stm.setString(4,candidato.getCpfCandidato());
        stm.setString(5,candidato.getGeneroCandidato());
        stm.setString(6,candidato.getSenhaCandidato());
        stm.setString(7,candidato.getEmailCandidato());


        stm.execute();
        con.close();
    }
}

