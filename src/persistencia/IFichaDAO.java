/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.*;

/**
 *
 * @author Gabriel
 */
public interface IFichaDAO {
    
     public void adiciona(Ficha ficha);
        public void altera(Ficha ficha);
        public void remove(int id);
        public List<Ficha> listarTodos();
        public Ficha getByID(int id);
   
    
}
