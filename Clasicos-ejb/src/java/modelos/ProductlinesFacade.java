/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Productlines;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Daniel
 */
@Stateless
public class ProductlinesFacade extends AbstractFacade<Productlines> implements ProductlinesFacadeLocal {

    @PersistenceContext(unitName = "Clasicos-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductlinesFacade() {
        super(Productlines.class);
    }
    
}
