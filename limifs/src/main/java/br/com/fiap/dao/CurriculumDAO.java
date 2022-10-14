package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fiap.model.Curriculum;

public class CurriculumDAO {

    public void cadastrar(Curriculum curriculum) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        var stm = con.prepareStatement(
            "INSERT INTO T_LIMIFS_CURRICULUM (grau_curriculo, cursos_curriculo, cert_curriculo, exp_curriculo) " +
            "VALUES (?,?,?,?)"
            );

        stm.setString(1,curriculum.getGrauCurriculo());
        stm.setString(2,curriculum.getCursosCurriculo());
        stm.setString(3,curriculum.getCertCurriculo());
        stm.setString(4,curriculum.getExpCurriculo());

        stm.execute();
        con.close();
    }
}
