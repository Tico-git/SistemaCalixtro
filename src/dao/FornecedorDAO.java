package dao;

import bean.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO {

    public void inserir(Fornecedor f) {

        String sql = "INSERT INTO fornecedor "
                + "(razaoSocial, nomeComercial, cnpj, site, cidade, endereco, "
                + "cep, bairro, complemento, numero, email, telefone, contrato, uf) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setString(1, f.getRazaoSocial());
                ps.setString(2, f.getNomeComercial());
                ps.setString(3, f.getCnpj());
                ps.setString(4, f.getSite());
                ps.setString(5, f.getCidade());
                ps.setString(6, f.getEndereco());
                ps.setString(7, f.getCep());
                ps.setString(8, f.getBairro());
                ps.setString(9, f.getComplemento());
                ps.setString(10, f.getNumero());
                ps.setString(11, f.getEmail());
                ps.setString(12, f.getTelefone());
                ps.setString(13, f.getContrato());
                ps.setString(14, f.getUf());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());

        }
    }
}