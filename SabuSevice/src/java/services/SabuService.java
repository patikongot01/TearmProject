/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author Capellix
 */
@WebService(serviceName = "SabuService")
public class SabuService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SabuSevicePU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findProvince")
    public Province findProvince(@WebParam(name = "id") int id) {
        EntityManager em = emf.createEntityManager();
        Province pnv = em.find(Province.class, id);
        return pnv;
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }








}
