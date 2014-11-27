/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;//Conexão SQL para java
import java.sql.DriverManager;//driver de conexão SQL para java
import java.sql.SQLException;//classe para tratamento e excessões

/**
 *
 * @author Ramon
 */
public class ConFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/dbprontuarios","root","");
        } catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
