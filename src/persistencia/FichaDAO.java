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
import negocio.Ficha;

/**
 *
 * @author Ramon
 */
public class FichaDAO implements IFichaDAO{

    //a conexão com o banco de dados
    private Connection connection;
    
    //Construtor
    public FichaDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Ficha ficha) {
        //Criamos o comando sql para inserção de dados na tabela paciente
        String sql = "INSERT INTO ficha " + 
                "(idpaciente, data, queixas, sintomas, habitos_alimentares, cancer_familia, mamografia, protese, alteracao_mamilo, informacoes) " +
                "values(?,?,?,?,?,?,?,?,?,?)";
        
        try{
            //Prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta os valores
            stmt.setInt(1,Integer.valueOf(ficha.getIdPaciente().toString()));
            stmt.setDate(2, new Date(ficha.getData().getTimeInMillis()));
            stmt.setString(3,ficha.getQueixas());
            stmt.setString(4,ficha.getSintomas());
            stmt.setString(5,ficha.getHabitosAlimentares());
            stmt.setString(6,ficha.getCancerFamilia());
            stmt.setBoolean(7,ficha.isMamografia());
            stmt.setString(8,ficha.getProtese());
            stmt.setString(9,ficha.getAlteracaoMamilo());
            stmt.setString(9,ficha.getInformacoes());
            
            //Executa
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public void altera(Ficha ficha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ficha> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ficha getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
