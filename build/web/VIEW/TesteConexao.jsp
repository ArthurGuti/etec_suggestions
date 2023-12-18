<%-- 
    Document   : TesteConexao
    Created on : 24/08/2023, 09:09:17
    Author     : Alunos
--%>

<%@page import="DAO.ConexaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sugestao jsp</title>
    </head>
    <body>
        SE CONECTAR
        <br>
        <%
            ConexaoDAO Conexao = new ConexaoDAO();
            Conexao.getConexaoMySQL();
            out.println(Conexao.statusConection());
        %>
    </body>
    </>
