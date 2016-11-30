
package metodos;

import hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Cliente;
import pojo.Vendedor;

public class vendedor {
    
    public DefaultTableModel tablaVendedor() {
        Session session = null;
        DefaultTableModel m = new DefaultTableModel() {
           
            public boolean isCellEditable(int column, int row) {
                return false;
            }
        };
        session = HibernateUtil.getSessionFactory().openSession();
        String[] columns = {"idVendedor", "Nombre", "Apellidos","Titular", "Telefono", "Correo"}; 
        Query createQuery = session.createQuery("select count(idVendedor) from Vendedor"); 
        
        int c =  Integer.parseInt(createQuery.uniqueResult().toString());
        Query createQuery2 = session.createQuery("from Vendedor");
        
        Object data[][] = new Object[c][6];
        List rs = createQuery2.list();
        Iterator it = rs.iterator();
        int i = 0;
        while (it.hasNext()) { 
            Vendedor ven = (Vendedor) it.next(); 
            data[i][0] = ven.getIdVendedor();
            data[i][1] = ven.getNombre();
            data[i][2] = ven.getApellidos();
            data[i][3] = ven.getTitular();
            data[i][4] = ven.getTelefono();
            data[i][5] = ven.getCorreo();
            
           i++;
        }
        m.setDataVector(data, columns);
        session.close();
        return m;
    }
}
