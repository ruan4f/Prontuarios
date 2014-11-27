/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

/**
 *
 * @author Ramon
 */
public class PacienteDAO implements IPacienteDAO{
    
    //a conexão com o banco de dados
    private Connection connection;
    
    //Construtor
    public PacienteDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Paciente paciente) {
        //Criamos o comando sql para inserção de dados na tabela paciente
        String sql = "insert into paciente " + 
                "(prontuario, nome, nome_mae, data_nascimento, estado_civil, cor, telefone, fotografia) " +
                "values(?,?,?,?)";
        
        try{
            //Prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta os valores
            stmt.setString(1,paciente.getProntuario());
            stmt.setString(2,paciente.getNome());
            stmt.setString(3,paciente.getNomeMae());
            stmt.setDate(4, new Date(paciente.getDataNascimento().getTimeInMillis()));
            stmt.setString(5,paciente.getEstadoCivil());
            stmt.setString(6,paciente.getCor());
            stmt.setString(7,paciente.getTelefone());
            stmt.setString(8,paciente.getFotografia());
            
            //Executa
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public void altera(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
