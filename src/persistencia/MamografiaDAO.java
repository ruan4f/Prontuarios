/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import negocio.Mamografia;

/**
 *
 * @author Ramon
 */
public class MamografiaDAO implements IMamografiaDAO{
    
    //a conexão com o banco de dados
    private Connection connection;
    
    //Construtor

    /**
     *
     */
        public MamografiaDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Mamografia mamografia) {
        //Criamos o comando sql para inserção de dados na tabela paciente
        String sql = "INSERT INTO mamografia " + 
                "(idficha, posicao, imagem) " +
                "values(?,?,?)";
        
        try{
            //Prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta os valores
            stmt.setString(1,mamografia.getIdFicha().toString());
            stmt.setString(2,mamografia.getPosicao());
            stmt.setString(3,mamografia.getImagem());
                        
            //Executa
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public void altera(Mamografia mamografia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mamografia> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mamografia getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
