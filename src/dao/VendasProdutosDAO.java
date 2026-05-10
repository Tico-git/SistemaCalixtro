package dao;

import bean.VendasProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasProdutosDAO {

    public void inserir(VendasProdutos vp) {

        String sql = "INSERT INTO vendas_produtos "
                + "(mhc_idVenda, mhc_idProduto, mhc_quantidade, mhc_precoUnitario, mhc_subtotal) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, vp.getMhc_idVenda());
                ps.setInt(2, vp.getMhc_idProduto());
                ps.setInt(3, vp.getMhc_quantidade());
                ps.setDouble(4, vp.getMhc_precoUnitario());
                ps.setDouble(5, vp.getMhc_subtotal());
                
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir venda produto: " + e.getMessage());

        }
    }
}