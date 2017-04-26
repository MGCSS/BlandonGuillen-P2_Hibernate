/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Modelo.Experto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Horizon
 */
public class ManejaExperto {
    private Session sesion;
    private Transaction tx;

    public ManejaExperto() {
    }

    public void iniciaOperacion() throws HibernateException {
        System.out.println("Comenzando con Hibernate");
        sesion = HibernateUtil.getSessionFactory().openSession(); //iniciamos una sesion hibernate
        tx = sesion.beginTransaction(); // comienza la transaccion
    }

    public void finalizaOperacion() throws HibernateException {
        System.out.println("Finalizando con Hibernate");
        tx.commit();
        sesion.close();
    }

    public void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        System.out.println("Ocurrió un error en la capa de acceso a datos " + he.getMessage());
        System.exit(0);
    }

    public void guardaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.save(experto);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public void eliminaExperto(Experto experto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(experto);
            System.out.println("Experto ha sido eliminado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public void actualizaExperto(Experto experto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(experto);
            System.out.println("Experto ha sido actualizado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }        
    }
    
    public Experto obtenExperto(String idExperto) throws HibernateException {
        Experto experto= null;
        String hql= "from Experto e where e.codexperto = :idExperto";
        List <Experto> listaExperto;
        
        this.iniciaOperacion();
        
        Query query= sesion.createQuery(hql);
        query.setParameter("idExperto", idExperto);
        listaExperto= query.list();
        
        if (listaExperto.isEmpty() != true) {
            experto = listaExperto.get(0);
        }
        
        this.finalizaOperacion();
        
        return experto;
        
    }
}
