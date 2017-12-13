/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.admin.remote.jpa.sessions;

import co.com.admin.remote.jpa.entities.Cliente;
import co.com.admin.remote.jpa.entities.Cliente_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Juan David Martinez
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "com.admin.remote.jpa_Administracion_Remota_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
<<<<<<< HEAD
    public Cliente findClienteByNumDocumento(String numDocumento) {

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
        Root<Cliente> usuario = cq.from(Cliente.class);
        cq.where(cb.equal(usuario.get(Cliente_.numDocumento), numDocumento));
        TypedQuery<Cliente> q = getEntityManager().createQuery(cq);
        try {
            return (Cliente) q.getSingleResult();
        } catch (NonUniqueResultException ex) {
            throw ex;
        } catch (NoResultException ex) {
            return null;
        }
    }
=======
    /**
     * buscar cliente por id
     * 
     * @param numDocumento
     * @return 
     */
    public Cliente findClienteByNumDocumento(String numDocumento){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
        Root<Cliente> tercero = cq.from(Cliente.class);
        
        cq.where(cb.equal(tercero.get(Cliente_.numDocumento), numDocumento));
        TypedQuery<Cliente> tq = getEntityManager().createQuery(cq);
        
        try {
            return (Cliente) tq.getSingleResult();
        } catch (NonUniqueResultException ex) {
            throw ex;
        } catch(NoResultException e){
            return null;
        }
    }  
>>>>>>> 10d81fb9412cc80c521ea846b07523c9a961b98f
}
