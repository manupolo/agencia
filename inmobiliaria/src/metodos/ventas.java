
package metodos;

import hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Agencia;
import pojo.Cliente;
import pojo.Inmueble;
import pojo.Vendedor;
import pojo.VentaInmueble;
import pojo.VentaInmuebleId;

public class ventas {
    
    public DefaultTableModel tablaVentas(String idVendedor) {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"DNI Cliente", "Nombre", "Apellidos", "Telefono", "idInmueble", "Direccion", "Tipo", "Estado", "Propietario", "Superficie", "Fecha", "Señal"}; 
        Query createQuery = session.createQuery("select count(idInmueble) from VentaInmueble where idVendedor like '" +idVendedor+"'"); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from VentaInmueble where idVendedor like '" +idVendedor+ "'");
        
        Object data[][] = new Object[c][12];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            VentaInmueble vin = (VentaInmueble) it.next(); 
            
            Inmueble in = vin.getInmueble();
            Cliente cli = vin.getCliente();
            
            data[i][0] = cli.getIdCliente();
            data[i][1] = cli.getNombre();
            data[i][2] = cli.getApellidos();
            data[i][3] = cli.getTelefono();
            data[i][4] = in.getIdInmueble();
            data[i][5] = in.getDireccion();
            data[i][6] = in.getTipo();
            data[i][7] = in.getEstado();
            data[i][8] = in.getPropietario();
            data[i][9] = in.getSuperficie();
            data[i][10] = vin.getFecha();
            data[i][11] = vin.getSeñal();
            
            
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }
    
    
    
    public boolean insertarVenta(String idCliente, String idVendedor, int idInmueble, float señal, String fecha){
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        VentaInmueble vi = new VentaInmueble();
        
        VentaInmuebleId viid = new VentaInmuebleId(idInmueble, idCliente, idVendedor);
        Cliente c = new Cliente();
        Vendedor v = new Vendedor();
        Inmueble i = new Inmueble();
        
        c = (Cliente) session.load(Cliente.class, idCliente);
        v = (Vendedor) session.load(Vendedor.class, idVendedor);
        i = (Inmueble) session.load(Inmueble.class, idInmueble);
        
        vi.setId(viid);
        vi.setCliente(c);
        vi.setInmueble(i);
        vi.setVendedor(v);
        vi.setSeñal(señal);
        vi.setFecha(fecha);
        
        session.save(vi);
        tx.commit();
        session.close();
        
        return true;
    }
    
    public boolean modificarVenta(String idCliente, String idVendedor, int idInmueble, float señal, String fecha){
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        VentaInmueble vi = new VentaInmueble();
        
        VentaInmuebleId viid = new VentaInmuebleId(idInmueble, idCliente, idVendedor);
        Cliente c = new Cliente();
        Vendedor v = new Vendedor();
        Inmueble i = new Inmueble();
        
        c = (Cliente) session.load(Cliente.class, idCliente);
        v = (Vendedor) session.load(Vendedor.class, idVendedor);
        i = (Inmueble) session.load(Inmueble.class, idInmueble);
        
        vi.setId(viid);
        vi.setCliente(c);
        vi.setInmueble(i);
        vi.setVendedor(v);
        vi.setSeñal(señal);
        vi.setFecha(fecha);
        
        session.update(vi);
        tx.commit();
        session.close();
        
        return true;
    }
    
    public boolean eliminarVenta(int idInmueble, String idCliente, String idVendedor){
            Transaction tx=null;
            Session session= HibernateUtil.getSessionFactory().openSession();
            tx=session.beginTransaction(); //Crea una transacción
            VentaInmuebleId vinid = new VentaInmuebleId();
            vinid.setIdInmueble(idInmueble);
            vinid.setIdCliente(idCliente);
            vinid.setIdVendedor(idVendedor);
            
            VentaInmueble vi = (VentaInmueble) session.load(VentaInmueble.class, vinid);
            
            session.delete(vi);
            tx.commit();
            session.close();
        return true;
    }
    
    public void cambiarEstado(int idInmueble, String estado){
        
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Inmueble inm = (Inmueble) session.load(Inmueble.class, idInmueble);
        
        inm.setEstado(estado);
        
        session.update(inm); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
          
    }
    
    public DefaultTableModel tablaInmueblesLibres(int idAgencia){
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"idInmueble", "Direcccion", "Tipo", "Estado", "Propietario", "m2", "Habitaciones", "Baños", "T. Gas", "Ubicacion", "Licencia"}; 
        Query createQuery = session.createQuery("select count(idInmueble) from Inmueble where estado = 'libre' and idAgencia like " +idAgencia); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Inmueble where estado = 'libre' and idAgencia like " +idAgencia);
        
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
}
