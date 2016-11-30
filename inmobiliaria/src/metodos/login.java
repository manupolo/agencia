/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Agencia;
import pojo.Vendedor;

/**
 *
 * @author Manuel
 */
public class login {
    
    public int logueo(String id){
        int titular = 2;
        System.out.println("pulsando consultas");
        String c="select v from Vendedor v where idVendedor like '" +id+ "'";
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Query q=session.createQuery(c);
        
        List results=q.list();
        Iterator albumesiterator=results.iterator();
        
        while(albumesiterator.hasNext()){
            
        Vendedor vnd=(Vendedor)albumesiterator.next();
            titular = vnd.getTitular();
        }
        session.close();
        
        return titular;
    }
    
    public int codAgencia(String id){
        int agencia = 0;
            System.out.println("pulsando codAgencia");
            
            String c="select v from Vendedor v where idVendedor like '" +id+ "'";

            Session session=HibernateUtil.getSessionFactory().openSession();
            Query q=session.createQuery(c);

            List results=q.list();
            Iterator albumesiterator=results.iterator();

            while(albumesiterator.hasNext()){

            Vendedor vnd=(Vendedor)albumesiterator.next();
                Agencia a = vnd.getAgencia();
                agencia = a.getIdAgencia();
            }
            session.close();
        return agencia;
    }
}
