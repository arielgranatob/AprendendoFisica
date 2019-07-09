package dao;

import dao.Conexao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.JFrameCalcular;
import static view.JFrameCalcular.lerSessao;

public class UsuariosDAO implements InterfaceDAO {

    private String sql;
    private Connection conn;

    public void add(Object obj) {
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

    public ArrayList consulta(String sql) {
        ArrayList<Usuario> arrayUsuarios = new ArrayList();
        try {
            conn = Conexao.conexao();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nomeUsuario"));
                usuario.setEmail(rs.getString("emailUsuario"));
                usuario.setSenha(rs.getString("senhaUsuario"));
                arrayUsuarios.add(usuario);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return arrayUsuarios;
    }

    @Override
    public void update(Object obj) {
        try {
            Usuario usuario = (Usuario) obj;
            sql = "UPDATE usuario SET pontuacaoUsuario = ?  WHERE idUsuario = ?";
            conn = Conexao.conexao();
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "5");
            stmt.setString(2, JFrameCalcular.lerSessao());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Adicionado 5 pontos ao ID "+JFrameCalcular.lerSessao()+" com sucesso!");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "IMPOSSÍVEL EXECUTAR O COMANDO SQL\n" + error);
        }
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
