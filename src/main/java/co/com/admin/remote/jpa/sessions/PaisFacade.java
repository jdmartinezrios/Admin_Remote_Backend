/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.admin.remote.jpa.sessions;

import co.com.admin.remote.jpa.entities.Pais;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juan David Martinez
 */
@Stateless
public class PaisFacade extends AbstractFacade<Pais> {

    @PersistenceContext(unitName = "com.admin.remote.jpa_Administracion_Remota_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisFacade() {
        super(Pais.class);
    }
    
}
