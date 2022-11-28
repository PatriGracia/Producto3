package grupoTeamRocket.mysql;

import grupoTeamRocket.dao.DAOException;
import grupoTeamRocket.dao.PedidoDAO;
import grupoTeamRocket.modelo.Pedido;

import java.sql.Connection;
import java.util.List;

public class MySQLPedidoDAO implements PedidoDAO {

    private Connection conn;
    public MySQLPedidoDAO(Connection conn) {
        this.conn = conn;
    }

    public MySQLPedidoDAO() {

    }

    @Override
    public void insertar(Pedido a) {

    }

    @Override
    public void modificar(Pedido a) {

    }

    @Override
    public void eliminar(Pedido a) {

    }

    @Override
    public List<Pedido> obtenerTodos() {
        return null;
    }

    @Override
    public Pedido obtener(Long id) {
        return null;
    }

    @Override
    public List<Pedido> obtenerPorCliente(long cliente) throws DAOException {
        return null;
    }
}
