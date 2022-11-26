package grupoTeamRocket.dao;

import java.sql.*;
import java.sql.Connection;
//..

public class Conexion {

    protected Connection conexion;
    private final String url = "jdbc:mysql://teamrocketmysql.mysql.database.azure.com:3306/teamrocket";
    private final String user = "Administrador";
    private final String password = "Pokemon1234";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    //ClientePremium c = new ClientePremium ("Paat", "Cuenca", "B3834", "paaat@", 20);
    PreparedStatement ps = null;
    public Conexion(){

    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecta");
            /*ps = cx.prepareStatement("INSERT INTO cliente_premium VALUES (?, ?, ?, ?, ?);");
            ps.setString(1, c.getEmail());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getNif());
            ps.setString(4, c.getDomicilio());
            ps.setFloat(5, c.getDescuento());
            ps.execute();
            System.out.println("Se añade"); */
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conecta");
            throw new RuntimeException(e);
        }
        return cx;
    }

    public void desconectar() throws SQLException{
        if(cx != null){
            if(!cx.isClosed()){
                cx.close();
            }
        }
    }

   /* public static void main(String[] args){
        Conexion conexion = new Conexion();
        conexion.conectar();
    }*/
}
