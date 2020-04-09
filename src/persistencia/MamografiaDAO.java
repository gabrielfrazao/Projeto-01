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
import negocio.Mamografia;

/**
 *
 * @author Gabriel
 */
public class MamografiaDAO implements IMamografiaDAO{
    
       private final Connection connection;
    
    //Construtor
    public MamografiaDAO(){
        this.connection = new conFactory().getConnection();
            } 
    @Override
    public void adiciona(Mamografia mamografia){
        //criamos o comando sql para inserção de Dados na tabela Paciente
        String sql = "insert into usuario"+
        "Posicao,Imagem"+"values(?,?)";
        
      
            try {
                //Preparando statemente para inserção
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                //setando os valores
                stmt.setString(1,mamografia.getPosicao());
                stmt.setString(2,mamografia.getImage());
                              
                
                //executa
                stmt.execute();
                stmt.close();
                
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void altera(Mamografia mamografia) {
            throw new UnsupportedOperationException("Ainda não suportado !");
        
    }
         @Override
        public void remove (int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
    
}
          @Override
        public List<Mamografia> listarTodos(){
                throw new UnsupportedOperationException("Ainda não suportado !");
        }
          @Override
        public Mamografia getByID(int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
        }
}
    
    

