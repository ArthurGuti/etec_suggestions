/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.SugestaoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alunos
 */
public class SugestaoDAO  {
    
    Connection con; // Cria um objeto de conexão
    PreparedStatement pgst; // Objeto de Preparação para o BD
    Statement st;   // Objeto de Configuração para os Dados
    
    ConexaoDAO cb = new ConexaoDAO();  // Criar um objeto do tipo ConexãoDAO 
    
   
    public void CadastrarSugestaoDAO(SugestaoMODEL sugestao)
    {
        con = cb.getConexaoMySQL(); //Realiza a conexão com o BD
        
        String sql = "insert into sugestao(sugestao)values(?,?)";
        
        try {
            pgst = con.prepareStatement (sql);
            pgst.setString(1,sugestao.getSugestao() );
            pgst.executeUpdate(); //executeQuery
            
            System.out.println("Sugestão cadastrada e enviada com sucesso!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SugestaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    
    
}
