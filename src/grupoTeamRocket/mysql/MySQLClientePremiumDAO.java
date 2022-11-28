package grupoTeamRocket.mysql;

import grupoTeamRocket.dao.ClientePremiumDAO;
import grupoTeamRocket.modelo.ClientePremium;

import java.sql.Connection;
import java.util.List;

public class MySQLClientePremiumDAO implements ClientePremiumDAO {

    private Connection conn;
    public MySQLClientePremiumDAO(Connection conn) {
        this.conn = conn;
    }

    public MySQLClientePremiumDAO() {

    }

    @Override
    public void insertar(ClientePremium a) {

    }

    @Override
    public void modificar(ClientePremium a) {

    }

    @Override
    public void eliminar(ClientePremium a) {

    }

    @Override
    public List<ClientePremium> obtenerTodos() {
        return null;
    }

    @Override
    public ClientePremium obtener(Long id) {
        return null;
    }
}
