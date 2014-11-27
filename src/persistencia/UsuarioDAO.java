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
import negocio.Usuario;

/**
 *
 * @author Ramon
 */
public class UsuarioDAO implements IUsuarioDAO{
    
    //a conexão com o banco de dados
    private Connection connection;
    
    //Construtor

    /**
     *
     */
        public UsuarioDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Usuario usuario) {
        //Criamos o comando sql para inserção de dados na tabela paciente
        String sql = "INSERT INTO usuario " + 
                "(usuario, senha, tipo) " +
                "values(?,?,?)";
        
        try{
            //Prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta os valores
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getSenha());
            stmt.setString(3,usuario.getTipo());
            
            //Executa
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
