package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {

    private String sql;
    private Connection conn;

    public int logar(String usuario, String senha) {
        int logou = 0;
        try {
            conn = Conexao.conexao();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE emailUsuario = ? AND senhaUsuario = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.first()) {
                logou = 1;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return logou;
    }

}
