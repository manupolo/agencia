/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeVendedor;

import metodos.cliente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel
 */
public class facadeVendedor {
    cliente cli = new cliente();
    
    //Crea la tabla cliente
    public DefaultTableModel tablaCliente(){
        return cli.tablaCliente();
    }
    
    public boolean insertarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.insertarCliente(idCliente, nombre, apellidos, telefono);
    } 
    
    public boolean modificarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.modificarCliente(idCliente, nombre, apellidos, telefono);
    }
    
    public boolean eliminarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.eliminarCliente(idCliente, nombre, apellidos, telefono);
    }
}
