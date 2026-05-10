package dao;

import bean.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosDAO {

    public void inserir(Produtos p) {

        String sql = "INSERT INTO produtos "
                + "(id, nome, preco, quantidadeEstoque, chegadaEstoque, descricao, fornecedor, categoria) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, p.getId());
                ps.setString(2, p.getNome());
                ps.setDouble(3, p.getPreco());
                ps.setInt(4, p.getQuantidadeEstoque());
                ps.setDate(5, new java.sql.Date(p.getChegadaEstoque().getTime()));
                ps.setString(6, p.getDescricao());
                ps.setString(7, p.getFornecedor());
                ps.setString(8, p.getCategoria());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir produto: " + e.getMessage());

        }
    }
}