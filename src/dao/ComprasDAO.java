package dao;

import bean.Compras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasDAO {

    public void inserir(Compras c) {

        String sql = "INSERT INTO compras "
                + "(mhc_status, mhc_idFornecedor, mhc_dataCompra, mhc_valorTotal) "
                + "VALUES (?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setString(1, c.getMhc_status());
                ps.setInt(2, c.getMhc_idFornecedor());
                ps.setDate(3, java.sql.Date.valueOf(c.getMhc_dataCompra()));
                ps.setDouble(4, c.getMhc_valorTotal());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir compra: " + e.getMessage());

        }
    }
}