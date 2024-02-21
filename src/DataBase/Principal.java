
package DataBase;

import Vista.JFDB;



public class Principal {

    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.conexion();
        JFDB jfdb = new JFDB();
        jfdb.setVisible(true);
    }
}
