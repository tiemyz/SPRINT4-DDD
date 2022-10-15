package br.com.fiap.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Curriculum;

public class CurriculumDAO {

    public void inserirCurriculum(Curriculum curriculum) throws SQLException, IOException {

        Connection con = ConnectionFactory.getConnection();

           String sql = "INSERT INTO T_LIM_CURRICULO (grau_curriculo, cursos_curriculo, cert_curriculo, exp_curriculo) " +
            "VALUES (?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1,curriculum.getGrauCurriculo());
            stmt.setString(2,curriculum.getCursosCurriculo());
            stmt.setString(3,curriculum.getCertCurriculo());
            stmt.setString(4,curriculum.getExpCurriculo());

            stmt.execute();
            con.close();
    }

    public List<Curriculum> buscarTodosCurriculos() throws SQLException, IOException {
        List<Curriculum> lista = new ArrayList<>();

        Connection con = ConnectionFactory.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM T_LIM_CURRICULO";
        ResultSet rs = stmt.executeQuery(sql);
    
        while(rs.next()){
            String grauCurriculo = rs.getString("grauCurriculo");
            String cursosCurriculo = rs.getString("cursosCurriculo");
            String certCurriculo = rs.getString("certCurriculo");
            String expCurriculo = rs.getString("expCurriculo");
    
            Curriculum curriculum = new Curriculum(grauCurriculo, cursosCurriculo, certCurriculo, expCurriculo);
            lista.add(curriculum);
        }
    
        con.close();
        return lista;
    }
}


    

