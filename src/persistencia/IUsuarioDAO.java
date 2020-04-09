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
public interface IUsuarioDAO {
        
    public void adiciona(Usuario usuario);
    public void altera (Usuario usuario);
    public void remove (int id);
    public List<Usuario> listarTodos();
    public Usuario getByID(int id);
    
}
