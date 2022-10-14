package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fiap.model.Empresas;

public class EmpresasDAO {

    public void cadastrar(Empresas empresas) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        var stm = con.prepareStatement(
            "INSERT INTO T_LIM_EMPRESAS (nom_empresas, loc_empresas, tipo_empresas, email_empresas, cnpj_empresas, senha_empresas) " +
            "VALUES (?,?,?,?,?,?)" /*LOCAL DATE */
            );

        stm.setString(1,empresas.getNomeEmpresas());
        stm.setString(2,empresas.getLocEmpresas());
        stm.setString(3,empresas.getTipoEmpresas());
        stm.setString(4,empresas.getEmailEmpresas());
        stm.setString(5,empresas.getCnpjEmpresas());
        stm.setString(6,empresas.getSenhaEmpresas());

        stm.execute();
        con.close();
    }
}