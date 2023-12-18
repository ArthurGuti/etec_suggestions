/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.LoginDAO;
import MODEL.LoginMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Alunos
 */
public class LoginCTR {
 
       
    public ResultSet realizarLogin(String email, String senha)
    {
        ResultSet verificar; 
        
        //Criar objetos das classes
        LoginMODEL objlogin = new LoginMODEL();
        LoginDAO objlogindao = new LoginDAO();
        
        objlogin.setEmail(email);
        objlogin.setSenha(senha);
        
        verificar = objlogindao.LoginDAO(objlogin);
        return verificar;
    }   
}
