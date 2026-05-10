package dao;

import bean.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class VendasDAO {

    public void inserir(Vendas v) {

        String sql = "INSERT INTO vendas "
                + "(mhc_idCliente, mhc_idUsuario, mhc_dataVenda, mhc_horaVenda, "
                + "mhc_valorTotal, mhc_formaPagamento, mhc_status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, v.getMhc_idCliente());
                ps.setInt(2, v.getMhc_idUsuario());
                ps.setDate(3, java.sql.Date.valueOf(v.getMhc_dataVenda()));
                ps.setTime(4, Time.valueOf(v.getMhc_horaVenda()));
                ps.setDouble(5, v.getMhc_valorTotal());
                ps.setString(6, v.getMhc_formaPagamento());
                ps.setString(7, v.getMhc_status());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir venda: " + e.getMessage());

        }
    }
}