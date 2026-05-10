package dao;

import bean.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {

    public void inserir(Usuarios u) {

        String sql = "INSERT INTO usuarios "
                + "(id, nome, apelido, cpf, dataNascimento, senha, nivel, "
                + "email, telefone, ativo, dataCadastro, horaCadastro, "
                + "cargo, acessos, genero) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            try (Connection conn = ConexaoDAO.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setInt(1, u.getId());
                ps.setString(2, u.getNome());
                ps.setString(3, u.getApelido());
                ps.setString(4, u.getCpf());
                ps.setDate(5, new java.sql.Date(u.getDataNascimento().getTime()));
                ps.setString(6, u.getSenha());
                ps.setString(7, u.getNivel());
                ps.setString(8, u.getEmail());
                ps.setString(9, u.getTelefone());
                ps.setBoolean(10, u.isAtivo());
                ps.setDate(11, new java.sql.Date(u.getDataCadastro().getTime()));
                ps.setString(12, u.getHoraCadastro());
                ps.setString(13, u.getCargo());
                ps.setString(14, u.getAcessos());
                ps.setString(15, u.getGenero());
                
                ps.execute();
            }

        } catch (SQLException e) {

            System.out.println("Erro ao inserir usuário: " + e.getMessage());

        }
    }
}