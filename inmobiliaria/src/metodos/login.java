
package metodos;

import accesoHibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojos.Agencia;
import pojos.Vendedor;

public class login {
    Session s;
    SessionFactory sf;
    
//    public DefaultTableModel TablaAgencia() {
//        
//        DefaultTableModel list = new DefaultTableModel() {
//            
//        @Override
//        public boolean isCellEditable(int column, int row) {
//            return false;
//        }
//        };
//        
//        s= sf.openSession();
//        
//        String[] columns = {"id_agencia", "nombre", "Tlfno1", "Tlfno2","fax","titular","direccion","zona_act"}; //nombre de las columnas
//        
//        String p = "select count(id_agencia) from Agencia"; //numero de tuplas
//        Query q = s.createQuery(p);
//        int c =  Integer.parseInt(q.uniqueResult().toString());
//        p = "from Agencia";//devuelve todos los objetos agencia
//        q = s.createQuery(p);
//        Object data[][] = new Object[c][8];
//        List rs = q.list();
//        Iterator it = rs.iterator();
//        int i = 0;
//        while (it.hasNext()) { //recorres el iterador
//            Agencia a = (Agencia) it.next(); //pon siempre toString o siempre lo pasas a string
//            data[i][0] = a.getIdAgencia();
//            data[i][1] = a.getNombre();
//            data[i][2] = a.getTlfno1();
//            data[i][3] = a.getTlfno2();
//            data[i][4] = a.getFax();
//            data[i][5] = a.getTitular();
//            data[i][6] = a.getDireccion();
//            data[i][7] = a.getZonaActuacion();
//            i++;
//        }
//        list.setDataVector(data, columns);
//        s.close();
//        return list;
//    }
    
    public int login (){
        int result = 0;
               
        String p = "select nombre from Vendedor";//devuelve todos los objetos agencia
        Session session=HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(p);
        
        List rs = q.list();
        
        Iterator it = rs.iterator();
        
        
        while (it.hasNext()) { //recorres el iterador
            Vendedor v = (Vendedor) it.next(); 
            
            System.out.println("El nombre del vendedor es: " +v.getNombre());

        }
        
        session.close();
        
        return result;
    }
}
