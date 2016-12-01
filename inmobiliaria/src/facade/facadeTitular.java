
package facade;

import javax.swing.table.DefaultTableModel;
import metodos.inmueble;
import metodos.vendedor;

public class facadeTitular {
    vendedor v = new vendedor();
    inmueble inm = new inmueble();
    
    //Carga la tabla vendedores
    public DefaultTableModel tablaVendedor(int idAgencia){
        return v.tablaVendedor(idAgencia);
    }
    
    //Inserta vendedores pasandole los datos por parametros
    public boolean insertarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        return v.insertarVendedor(idVendedor, idAgencia, nombr, apellidos, telefono, correo);
    }
    
    //Modifica vendedores pasandole datos por parametros
    public boolean modificarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        return v.modificarVendedor(idVendedor, idAgencia, nombr, apellidos, telefono, correo);
    }
    
    //Elimina vendedor pasandole la id del vendedor
    public boolean eliminarVendedor(String idVendedor){
        return v.eliminarVendedor(idVendedor);
    }
    
    //Carga la tabla inmuebles
    public DefaultTableModel tablaInmueble(int idAgencia){
        return inm.tablaVendedor(idAgencia);
    }
    
    //Inserta piso pasandole los datos por parametros
    public boolean insertarPiso(int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, Integer habitaciones, Integer baños, String gas, String ubicacion){
        return inm.insertarPiso(idAgencia, direccion, tipo, estado, propietario, superficie, habitaciones, baños, gas, ubicacion);
    }
    
     //Inserta local pasandole los datos por parametros
    public boolean insertarLocal(int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, String licencia){
        return inm.insertarLocal(idAgencia, direccion, tipo, estado, propietario, superficie, licencia);
    }
    
    //Modifica piso pasandole datos por parametros
    public boolean modificarPiso(int idInmueble, int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, Integer habitaciones, Integer baños, String gas, String ubicacion){
        return inm.modificarPiso(idInmueble, idAgencia, direccion, tipo, estado, propietario, superficie, habitaciones, baños, gas, ubicacion);
    }
    
    //Modifica local pasandole datos por parametros
    public boolean modificarLocal(int idInmueble, int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, String licencia){
        return inm.modificarLocal(idInmueble, idAgencia, direccion, tipo, estado, propietario, superficie, licencia);
    }
    
    //Elimina Inmueble pasandole la id del vendedor
    public boolean eliminarInmueble(int idInmueble){
        return inm.eliminarInmueble(idInmueble);
    }
}
