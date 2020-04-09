/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import negocio.Ficha;

/**
 *
 * @author Gabriel
 */
public class FichaDAO implements IFichaDAO {
    
      // A conexão com Banco de Dados
    private final Connection connection;
    
    //Construtor
    public FichaDAO(){
        this.connection = new conFactory().getConnection();
            } 
    @Override
    public void adiciona(Ficha ficha){
        //criamos o comando sql para inserção de Dados na tabela Paciente
        String sql = "insert into ficha"+
        "paciente,data,queixas,sintomas,habitos_alimentares,mamografia,protese,alteracoes_mamilos,outras_informacoes"+
        "values(?,?,?,?,?,?,?,?,?)";
        
      
            try {
                //Preparando statemente para inserção
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                //setando os valores
                stmt.setString(1,ficha.getPaciente());
                stmt.setDate(2,new Date(ficha.getData().getTimeInMillis()));
                stmt.setString(3,ficha.getQueixas());
                stmt.setString(4,ficha.getSintomas());
                stmt.setString(5,ficha.getHabitos_alimentares());
                stmt.setString(6,ficha.getMamografia());
                stmt.setString(7,ficha.getProtese());
                stmt.setString(8,ficha.getAlteracoes_mamilos());
                stmt.setString(8,ficha.getOutras_informacoes());
                
                
                
                
                //executa
                stmt.execute();
                stmt.close();
                
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void altera(Ficha ficha) {
            throw new UnsupportedOperationException("Ainda não suportado !");
        
    }
         @Override
        public void remove (int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
    
}
          @Override
        public List<Ficha> listarTodos(){
                throw new UnsupportedOperationException("Ainda não suportado !");
        }
          @Override
        public Ficha getByID(int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
        }
}
    

