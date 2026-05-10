package dao;

import bean.Licencas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LicencasDAO {

    public void inserir(Licencas l) {

        String sql = "INSERT INTO licencas "
                + "(id, marca, tipo, empresa, dataInicio, dataExpiracao, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, l.getId());
                ps.setString(2, l.getMarca());
                ps.setString(3, l.getTipo());
                ps.setString(4, l.getEmpresa());
                ps.setDate(5, new java.sql.Date(l.getDataInicio().getTime()));
                ps.setDate(6, new java.sql.Date(l.getDataExpiracao().getTime()));
                ps.setString(7, l.getStatus());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir licença: " + e.getMessage());

        }
    }
}