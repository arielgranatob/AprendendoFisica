package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static Connection conn = null;

    private Conexao() {
        String userName = "arielgranato_userAprendendoFisica";
        String password = "7jarcuvCh1iO";
        String url = "jdbc:mysql://arielgranato.com.br:3306/arielgranato_AprendendoFisica";
        String driver = "com.mysql.jdbc.Driver";
        // String driver = "org.mariadb.jdbc.Driver";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection conexao() {
        if (conn == null) {
            new Conexao();
            return conn;
        } else {
            return conn;
        }
    }
}