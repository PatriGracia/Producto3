package grupoTeamRocket.dao;

import grupoTeamRocket.modelo.Pedido;

import java.util.List;

public interface PedidoDAO extends DAO<Pedido, Long>{
    List<Pedido> obtenerPorCliente (long cliente) throws DAOException;
}
