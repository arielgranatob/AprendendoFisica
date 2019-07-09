package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.JFrameCalcular;

public class UsuariosDAO implements InterfaceDAO {

    private String sql;
    private Connection conn;

    @Override
    public void add(Usuario obj) {
        try {

            Usuario usuario = (Usuario) obj;
            sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, senhaUsuario, pontuacaoUsuario) VALUES (?, ?, ?, ?)";

            conn = Conexao.conexao();
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, 0);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Você foi cadastrado com sucesso!\nAgora é só realizar o login e se divertir!");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Impossível executar o comando SQL\n" + error);
        }
    }

    @Override
    public ArrayList consulta(String sql) {
        ArrayList<Usuario> arrayUsuarios = new ArrayList();
        try {
            conn = Conexao.conexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeQuery();

            try (ResultSet rs = stmt.getResultSet()) {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("idUsuario"));
                    usuario.setNome(rs.getString("nomeUsuario"));
                    usuario.setEmail(rs.getString("emailUsuario"));
                    usuario.setSenha(rs.getString("senhaUsuario"));
                    arrayUsuarios.add(usuario);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return arrayUsuarios;
    }

    @Override
    public void update(Object obj) {
        try {
            int pontos = 10;
            Usuario usuario = (Usuario) obj;
            sql = "UPDATE usuario SET pontuacaoUsuario = pontuacaoUsuario+?  WHERE idUsuario = ?";
            conn = Conexao.conexao();
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, String.valueOf(pontos));
            stmt.setString(2, JFrameCalcular.lerSessao());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "O ID " + JFrameCalcular.lerSessao() + " ganhou " + pontos + "!");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "IMPOSSÍVEL EXECUTAR O COMANDO SQL\n" + error);
        }
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
