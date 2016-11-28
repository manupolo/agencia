/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import accesoHibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojos.Agencia;
import pojos.Vendedor;

/**
 *
 * @author Manuel
 */
public class vendedor {
    
    Session s;
    SessionFactory sf;
    
    public DefaultTableModel tablaVendedor() {
        DefaultTableModel list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        s= sf.openSession();
        
        String[] columns = {"idVendedor", "Nombre", "Apellidos","Titular","Telefono","Correo"}; //nombre de las columnas
        String p = "select count(idVendedor) from Vendedor"; //numero de tuplax
        Query q = s.createQuery(p);
        int c =  Integer.parseInt(q.uniqueResult().toString());
        p = "from Vendedor";//devuelve todos los objetos agencia
        q = s.createQuery(p);
        Object data[][] = new Object[c][6];
        List rs = q.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { //recorres el iterador
            Vendedor v = (Vendedor) it.next(); //pon siempre toString o siempre lo pasas a string
            data[i][0] = v.getIdVendedor();
            data[i][1] = v.getNombre();
            data[i][2] = v.getApellidos();
            data[i][3] = v.getTitular();
            data[i][4] = v.getTelefono();
            data[i][5] = v.getCorreo();
                        
            i++;
        }
        list.setDataVector(data, columns);
        s.close();
        return list;
    }
    
    public void insertarVendedor(String idVendedor, Agencia agencia, String nombre, String apellidos, int titular, int telefono, String correo){
        titular = 0;
        
        
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        
        Vendedor v = new Vendedor(idVendedor, agencia, nombre, apellidos, titular);
        v.setTelefono(telefono);
        v.setCorreo(correo);
        session.save(v); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();

    }
    
    public void modificarVendedor(String idVendedor, Agencia agencia, String nombre, String apellidos, int titular, int telefono, String correo){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        
        Vendedor v = new Vendedor();
        v.setNombre(nombre);
        v.setApellidos(apellidos);
        v.setTitular(titular);
        v.setTelefono(telefono);
        v.setCorreo(correo);
        
        session.save(v); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();

    }
    
    public void eliminarVendedor(String idVend){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Vendedor v = new Vendedor();
        session.delete(v);
        System.out.println("Objeto borrado");
        tx.commit(); //Materializa la transacción
        session.close();
    }
}
