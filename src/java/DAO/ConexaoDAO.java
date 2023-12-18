/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.SQLException;
/**
 *
 * @author Alunos
 */
public class ConexaoDAO {

 
public String status = "Estamos em manutenção...";
 
 
//MÃ©todo de ConexÃ£o//
 
public  Connection getConexaoMySQL() {
 
        Connection connection = null;          //atributo do tipo Connection
   
 
try {
 
// Carregando o JDBC Driver padrÃ£o
 
String driverName = "com.mysql.jdbc.Driver";                        
 
Class.forName(driverName);
 
  
 
// Configurando a nossa conexÃ£o com um banco de dados//
 
            String serverName = "localhost:3306";    //caminho do servidor do BD
 
            String mydatabase = "etecsugestao";        //nome do seu banco de dados
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
                        
            String username = "root";        //nome de um usuÃ¡rio de seu BD      
 
            String password = "";      //sua senha de acesso
 
            connection = DriverManager.getConnection(url, username, password);
 
  
 
            //Testa sua conexÃ£o//  
 
            if (connection != null) {
 
                status = ("STATUS--->Conectado com sucesso!");
 
            } else {
 
                status = ("STATUS--->NÃ£o foi possivel realizar conexÃ£o");
 
            }
 
  
 
            return connection;
 
  
 
        } catch (ClassNotFoundException e) {  //Driver nÃ£o encontrado
 
            System.out.println("O driver especificado nao foi encontrado.");

            return null;
 
        } catch (SQLException ex) {
 
//NÃ£o conseguindo se conectar ao banco
                                
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
 
  
 
    }
 
  
 
    //MÃ©todo que retorna o status da sua conexÃ£o//
 
    public String statusConection() {
 
        return status;
 
    }
 
}
