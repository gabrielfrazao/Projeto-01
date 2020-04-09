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
public interface IMamografiaDAO {
    
        public void adiciona(Mamografia mamografia);
        public void altera(Mamografia mamografia);
        public void remove(int id);
        public List<Mamografia> listarTodos();
        public Mamografia getByID(int id);
    
    
    
}
