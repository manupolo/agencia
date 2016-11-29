/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Cliente;


/**
 *
 * @author Manuel
 */
public class cliente {
    
    public DefaultTableModel tablaCliente() {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"DNI", "Nombre", "Apellidos", "Telefono"}; 
        Query createQuery = session.createQuery("select count(idCliente) from Cliente"); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Cliente");
        
        Object data[][] = new Object[c][4];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Cliente cli = (Cliente) it.next(); 
            data[i][0] = cli.getIdCliente();
            data[i][1] = cli.getNombre();
            data[i][2] = cli.getApellidos();
            data[i][3] = cli.getTelefono();
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }
    
    public boolean insertarCliente(String idCliente, String nombre, String apellidos, int telefono){
        boolean res = true;
            
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        
        Cliente c = new Cliente(idCliente, nombre, apellidos, telefono);
        
        session.save(c); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return res;
    }
    
    public boolean modificarCliente(String idCliente, String nombre, String apellidos, int telefono){
        boolean res = true;
            
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        
        Cliente c = new Cliente(idCliente, nombre, apellidos, telefono);
        
        session.update(c); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return res;
    }
    
    public boolean eliminarCliente(String idCliente, String nombre, String apellidos, int telefono){
        boolean res = true;
        
            Transaction tx=null;
            Session session= HibernateUtil.getSessionFactory().openSession();
            tx=session.beginTransaction(); //Crea una transacción
            Cliente c = new Cliente(idCliente, nombre, apellidos, telefono);
            session.delete(c);
            tx.commit(); //Materializa la transacción
            session.close();
        
        return res;
    }
}
