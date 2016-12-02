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
import org.hibernate.Transaction;
import pojo.Agencia;
import pojo.Inmueble;
import pojo.Vendedor;

/**
 *
 * @author Manuel
 */
public class inmueble {
    
    public DefaultTableModel tablaInmueble(int idAgencia) {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"idInmueble", "Direcccion", "Tipo", "Estado", "Propietario", "m2", "Habitaciones", "Baños", "T. Gas", "Ubicacion", "Licencia"}; 
        Query createQuery = session.createQuery("select count(idInmueble) from Inmueble where idAgencia like " +idAgencia); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Inmueble where idAgencia like " +idAgencia);
        
        Object data[][] = new Object[c][11];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Inmueble inm = (Inmueble) it.next(); 
            data[i][0] = inm.getIdInmueble();
            data[i][1] = inm.getDireccion();
            data[i][2] = inm.getTipo();
            data[i][3] = inm.getEstado();
            data[i][4] = inm.getPropietario();
            data[i][5] = inm.getSuperficie();
            data[i][6] = inm.getHabitacionesP();
            data[i][7] = inm.getBañosP();
            data[i][8] = inm.getTipoGasP();
            data[i][9] = inm.getUbicacionP();
            data[i][10] = inm.getLicenciaLocal();
            
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }
    
    public boolean insertarPiso(int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, Integer habitaciones, Integer baños, String gas, String ubicacion){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = new Inmueble();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        
        inm.setAgencia(ag);
        inm.setDireccion(direccion);
        inm.setTipo(tipo);
        inm.setEstado(estado);
        inm.setPropietario(propietario);
        inm.setSuperficie(superficie);
        inm.setHabitacionesP(habitaciones);
        inm.setBañosP(baños);
        inm.setTipoGasP(gas);
        inm.setUbicacionP(ubicacion);
        
        session.save(inm); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean insertarLocal(int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, String licencia){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = new Inmueble();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        inm.setIdInmueble(null);
        inm.setAgencia(ag);
        inm.setDireccion(direccion);
        inm.setTipo(tipo);
        inm.setEstado(estado);
        inm.setPropietario(propietario);
        inm.setSuperficie(superficie);
        inm.setLicenciaLocal(licencia);
        
        session.save(inm); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean modificarPiso(Integer idInmueble, int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, Integer habitaciones, Integer baños, String gas, String ubicacion){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = new Inmueble();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        inm.setIdInmueble(idInmueble);
        inm.setAgencia(ag);
        inm.setDireccion(direccion);
        inm.setTipo(tipo);
        inm.setEstado(estado);
        inm.setPropietario(propietario);
        inm.setSuperficie(superficie);
        inm.setHabitacionesP(habitaciones);
        inm.setBañosP(baños);
        inm.setTipoGasP(gas);
        inm.setUbicacionP(ubicacion);
        
        session.update(inm); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean modificarLocal(Integer idInmueble, int idAgencia, String direccion, String tipo, String estado, String propietario, int superficie, String licencia){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = new Inmueble();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        inm.setIdInmueble(idInmueble);
        inm.setAgencia(ag);
        inm.setDireccion(direccion);
        inm.setTipo(tipo);
        inm.setEstado(estado);
        inm.setPropietario(propietario);
        inm.setSuperficie(superficie);
        inm.setLicenciaLocal(licencia);
        
        session.update(inm); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean eliminarInmueble(Integer idInmueble){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = new Inmueble();
        
        inm = (Inmueble) session.load(Inmueble.class, idInmueble);
        
        session.delete(inm);
        tx.commit();
        session.close();
        
        return true;
    }
}
