package dao;

import bean.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDAO {

    public void inserir(Clientes c) {

        String sql = "INSERT INTO clientes "
                + "(nome, apelido, cpf, dataNascimento, cidade, uf, endereco, "
                + "cep, bairro, complemento, numero, email, telefone, "
                + "dataCadastro, horaCadastro, genero, estadoCivil, naturalidade) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setString(1, c.getNome());
                ps.setString(2, c.getApelido());
                ps.setString(3, c.getCpf());
                ps.setDate(4, new java.sql.Date(c.getDataNascimento().getTime()));
                ps.setString(5, c.getCidade());
                ps.setString(6, c.getUf());
                ps.setString(7, c.getEndereco());
                ps.setString(8, c.getCep());
                ps.setString(9, c.getBairro());
                ps.setString(10, c.getComplemento());
                ps.setString(11, c.getNumero());
                ps.setString(12, c.getEmail());
                ps.setString(13, c.getTelefone());
                ps.setDate(14, new java.sql.Date(c.getDataCadastro().getTime()));
                ps.setString(15, c.getHoraCadastro());
                ps.setString(16, c.getGenero());
                ps.setString(17, c.getEstadoCivil());
                ps.setString(18, c.getNaturalidade());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir cliente: " + e.getMessage());

        }
    }
}