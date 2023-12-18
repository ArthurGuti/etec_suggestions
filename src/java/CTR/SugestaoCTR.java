/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.SugestaoDAO;
import MODEL.SugestaoMODEL;

/**
 *
 * @author Codinhoto
 */
public class SugestaoCTR {
    
    //A CTR faz a ligação entre a MODEL e a DAO
    
    public void setCadastrarSugestao(String sugestao)
    {
        //Criar objetos das classes
        SugestaoMODEL objsugestao = new SugestaoMODEL();
        SugestaoDAO objsugestaodao = new SugestaoDAO();
        
        objsugestao.setSugestao(sugestao);
        
        objsugestaodao.CadastrarSugestaoDAO(objsugestao);
        
        
    }
    
    
    
}
