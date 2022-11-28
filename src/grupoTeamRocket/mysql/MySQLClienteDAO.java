package grupoTeamRocket.mysql;


import grupoTeamRocket.dao.ClienteDAO;
import grupoTeamRocket.dao.DAOException;
import grupoTeamRocket.modelo.Cliente;

import java.sql.Connection;
import java.util.List;

public class MySQLClienteDAO implements ClienteDAO {

    final String INSERT = "INSERT INTO cliente (email, domicilio, nif, nombre) VALUES (?,?,?,?);";
    final String GETALL = "SELECT id_articulo, descripcion, precio, gastos_envio, tiempo_preparacion FROM articulo";
    private Connection conn;
    @Override
    public void insertar(Cliente a) throws DAOException {

    }

    @Override
    public void modificar(Cliente a) throws DAOException {

    }

    @Override
    public void eliminar(Cliente a) throws DAOException {

    }

    @Override
    public List<Cliente> obtenerTodos() throws DAOException {
        return null;
    }

    @Override
    public Cliente obtener(Long id) throws DAOException {
        return null;
    }
}
