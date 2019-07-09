package dao;

import java.util.ArrayList;

public interface InterfaceDAO {

    public void add(Object obj);

    public void update(Object obj);

    public void delete(Object obj);

    public ArrayList consulta(String sql);
}
