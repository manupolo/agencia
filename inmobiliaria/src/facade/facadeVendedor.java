/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import metodos.cliente;
import javax.swing.table.DefaultTableModel;
import metodos.ventas;

/**
 *
 * @author Manuel
 */
public class facadeVendedor {
    cliente cli = new cliente();
    ventas v = new ventas();
    
    //Crea la tabla cliente
    public DefaultTableModel tablaCliente(){
        return cli.tablaCliente();
    }
    
    //
    public boolean insertarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.insertarCliente(idCliente, nombre, apellidos, telefono);
    } 
    
    public boolean modificarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.modificarCliente(idCliente, nombre, apellidos, telefono);
    }
    
    public boolean eliminarCliente(String idCliente, String nombre, String apellidos, int telefono){
        return cli.eliminarCliente(idCliente, nombre, apellidos, telefono);
    }
    
    //Crea la tabla inmmuebles libres
    public DefaultTableModel tablaInmueblesLibres(int idAgencia){
        return v.tablaInmueblesLibres(idAgencia);
    }
    
    //Crea la tabla ventas que pertenecen al vendedor que ha iniciado la sesion
    public DefaultTableModel tablaVentas(String idVendedor){
        return v.tablaVentas(idVendedor);
    }
    //Inserta una venta
    public boolean insertarVenta(String idCliente, String idVendedor, int idInmueble, float señal, String fecha){
        return v.insertarVenta(idCliente, idVendedor, idInmueble, señal, fecha);
    }
    //Eliminar venta pasandole por parametros el id de inmueble
    public boolean eliminarVenta(int idInmueble){
        return v.eliminarVenta(idInmueble);
    }
    
    //Comprueba si el cliente existe o no
    public boolean comprobarCliente(String idCliente){
        return cli.comprobarCliente(idCliente);
    }
    //Cambia el estado del inmueble de libre a alquilado o comprado.
    public void cambiarEstado(int idInmueble, String estado){
        v.cambiarEstado(idInmueble, estado);
    }
}
