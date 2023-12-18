/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.LoginMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class LoginDAO {

    Connection con; // Cria um objeto de conexão
    PreparedStatement pgst; // Objeto de Preparação para o BD
    Statement st;   // Objeto de Configuração para os Dados
    ResultSet verificacao;

    ConexaoDAO cb = new ConexaoDAO();  // Criar um objeto do tipo ConexãoDAO 

    public ResultSet LoginDAO(LoginMODEL login) {
        con = cb.getConexaoMySQL(); //Realiza a conexão com o BD

        String sql = "select * from login where email = ? and senha =?";

        try {
            pgst = con.prepareStatement(sql);
            pgst.setString(1, login.getEmail());
            pgst.setString(2, login.getSenha());
            verificacao = pgst.executeQuery(); //executeQuery
            //ExecuteQuery -> Ele realiza uma pesquisa, porém não faz alterações
            //ExecuteUpdate -> ele realiza alterações no BD
            if (verificacao.next()) {
                return verificacao;
            }
            else 
            {
                verificacao = null;
            }
            
//            System.out.println("Login Cadastrado!");
            return verificacao;
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void CadastrarLoginDAO(LoginMODEL objlogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
