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
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Paciente;

/**
 *
 * @author Gabriel
 */
public abstract class PacienteDAO implements IPacienteDAO {
    
    // A conexão com Banco de Dados
    private  Connection connection;
    
    //Construtor
    public PacienteDAO(){
        this.connection = new conFactory().getConnection();
            } 
    @Override
    public void adiciona(Paciente paciente){
        //criamos o comando sql para inserção de Dados na tabela Paciente
        String sql = "insert into paciente"+
        "(prontuario,nome,nome_mae,endereco,data_nascimento,estado_civil,cor,telefone,fotografia)"+
        "values(?,?,?,?,?,?,?,?,?)";
        
      
            try {
                //Preparando statemente para inserção
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                //setando os valores
                stmt.setString(1,paciente.getProntuario());
                stmt.setString(2,paciente.getNome());
                stmt.setString(3,paciente.getNome_mae());
                stmt.setDate(4,new Date(paciente.getData_nascimento().getTimeInMillis()));
                stmt.setString(5,paciente.getEstado_Civil());
                stmt.setString(6,paciente.getCor());
                stmt.setString(7,paciente.getTelefone());
                stmt.setString(8,paciente.getFotografia());
                
                
                //executa
                stmt.execute();
                stmt.close();
                
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
    
        public List<Paciente> listarTodos(){
    
            try{
                    List<Paciente> pacientes = new ArrayList<Paciente>();
                    PreparedStatement stmt = this.connection.prepareStatement("select * from paciente");
                    ResultSet rs = stmt.executeQuery();
                    
                    while(rs.next()){
                        //criando objeto de Contato
                        Paciente paciente = new Paciente();
                        paciente.setId(rs.getLong("id"));
                        paciente.setNome(rs.getString("nome"));
                        paciente.setNome_mae(rs.getString("nome_mae"));;
                        
                        //Mostrando a Data Através do Calendar
                        Calendar data = Calendar.getInstance();
                        data.setTime(rs.getDate("data_nascimento"));
                        paciente.setData_nascimento(data);
                        
                        paciente.setEstado_Civil(rs.getString("cor"));
                        paciente.setTelefone(rs.getString("telefone"));
                        paciente.setFotografia(rs.getString("fotografia"));
                         
                        //adicionando o objeto à lista
                        pacientes.add(paciente);
             }
                    rs.close();
                    stmt.close();
                    return pacientes;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
}
    
    
    
    
        @Override
        public void altera(Paciente paciente) {
            throw new UnsupportedOperationException("Ainda não suportado !");
        
    }
         @Override
        public void remove (int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
    
}
        
          @Override
        public Paciente getByID(int id){
            throw new UnsupportedOperationException("Ainda não suportado !");
        }
}
