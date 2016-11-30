
package facade;

import javax.swing.table.DefaultTableModel;
import metodos.vendedor;

public class facadeTitular {
    vendedor v = new vendedor();
    
    public DefaultTableModel tablaVendedor(){
        return v.tablaVendedor();
    }
    public boolean insertarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        return v.insertarVendedor(idVendedor, idAgencia, nombr, apellidos, telefono, correo);
    }
    
    public boolean modificarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        return v.modificarVendedor(idVendedor, idAgencia, nombr, apellidos, telefono, correo);
    }
    
    public boolean eliminarVendedor(String idVendedor){
        return v.eliminarVendedor(idVendedor);
    }
}
