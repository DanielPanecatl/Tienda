/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Payments;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel
 */
@Local
public interface PaymentsFacadeLocal {

    void create(Payments payments);

    void edit(Payments payments);

    void remove(Payments payments);

    Payments find(Object id);

    List<Payments> findAll();

    List<Payments> findRange(int[] range);

    int count();
    
}
