package dao;

import bean.ComprasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasProdutosDAO {

    public void inserir(ComprasProdutos cp) {

        String sql = "INSERT INTO compras_produtos "
                + "(mhc_idCompra, mhc_idProduto, mhc_quantidade, mhc_precoUnitario, mhc_subtotal) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, cp.getMhc_idCompra());
                ps.setInt(2, cp.getMhc_idProduto());
                ps.setInt(3, cp.getMhc_quantidade());
                ps.setDouble(4, cp.getMhc_precoUnitario());
                ps.setDouble(5, cp.getMhc_subtotal());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir compra produto: " + e.getMessage());

        }
    }
}