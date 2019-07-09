package dao;

import java.util.ArrayList;
import model.Usuario;

public interface InterfaceDAO {

    public void add(Usuario obj);

    public void update(Object obj);

    public void delete(Object obj);

    public ArrayList consulta(String sql);
}
