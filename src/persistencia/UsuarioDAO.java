/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import negocio.*;

/**
 *
 * @author Gabriel
 */
public class UsuarioDAO implements IUsuarioDAO{
    
        // A conexão com Banco de Dados
    private final Connection connection;
    
    //Construtor
    public UsuarioDAO(){
        this.connection = new conFactory().getConnection();
            } 
    @Override
    public void adiciona(Usuario usuario){
        //criamos o comando sql para inserção de Dados na tabela Paciente
        String sql = "insert into usuario"+
        "CrieUsuario,CrieSenha,Tipo"+"values(?,?,?,?)";
        
      
            try {
                //Preparando statemente para inserção
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                //setando os valores
                stmt.setString(1,usuario.getCrieUsuario());
                stmt.setString(2,usuario.getCrieSenha());
                stmt.setString(3,usuario.getTipo());
                stmt.setString(4,usuario.getRepitaSenha());
                              
                
                //executa
                stmt.execute();
                stmt.close();
                
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void altera(Usuario usuario) {
            throw new UnsupportedOperationException("Ainda não suportado !");
        
    }
         @Override
        public void remove (int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
    
}
          @Override
        public List<Usuario> listarTodos(){
                throw new UnsupportedOperationException("Ainda não suportado !");
        }
          @Override
        public Usuario getByID(int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
        }
}
    

