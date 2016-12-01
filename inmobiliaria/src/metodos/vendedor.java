
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
import pojo.Vendedor;

public class vendedor {
    
    public DefaultTableModel tablaVendedor(int idAgencia) {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"idVendedor", "Nombre", "Apellidos", "Telefono", "Correo"}; 
        Query createQuery = session.createQuery("select count(idVendedor) from Vendedor where titular like 0 and idAgencia like " +idAgencia); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Vendedor where titular like 0 and idAgencia like " +idAgencia);
        
        Object data[][] = new Object[c][5];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Vendedor ven = (Vendedor) it.next(); 
            data[i][0] = ven.getIdVendedor();
            data[i][1] = ven.getNombre();
            data[i][2] = ven.getApellidos();
            data[i][3] = ven.getTelefono();
            data[i][4] = ven.getCorreo();
            
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }
    
    public boolean insertarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Vendedor vn = new Vendedor();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        vn.setIdVendedor(idVendedor);
        vn.setNombre(nombr);
        vn.setAgencia(ag);
        vn.setApellidos(apellidos);
        vn.setTitular(0);
        vn.setTelefono(telefono);
        vn.setCorreo(correo);
        
        session.save(vn); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean modificarVendedor(String idVendedor, int idAgencia, String nombr, String apellidos, int telefono, String correo){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Vendedor vn = new Vendedor();
        
        Agencia ag = new Agencia();
        ag = (Agencia) session.load(Agencia.class, idAgencia);
        vn.setIdVendedor(idVendedor);
        vn.setNombre(nombr);
        vn.setAgencia(ag);
        vn.setApellidos(apellidos);
        vn.setTitular(0);
        vn.setTelefono(telefono);
        vn.setCorreo(correo);
        
        session.update(vn); //Guarda el objeto creado en sa BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
        
        return true;
    }
    
    public boolean eliminarVendedor(String idVendedor){
        Transaction tx=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction(); //Crea una transacción
        Vendedor vn = new Vendedor();
        
        vn = (Vendedor) session.load(Vendedor.class, idVendedor);
        
        session.delete(vn);
        tx.commit();
        session.close();
        
        return true;
    }
}
