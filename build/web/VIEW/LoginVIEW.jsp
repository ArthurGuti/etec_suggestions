<%-- 
    Document   : LoginVIEW
    Created on : 24/08/2023, 09:06:48
    Author     : Alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sugestao jsp</title>
    </head>
    <body>
         <form action="../LoginSERVLET" method="GET">
            
            E-Mail
            <input type="text" name="email">
            <br>
            Senha
            <input type="password" name="senha">
            <br>
            <input type="submit" name="btncadest" value="Login">
        </form>
    </body>
</html> -->
<head>
    <meta charset="UTF-8">
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../css/stylesLogin.css">
</head>
<body>
    <div class="modal" action="../LoginSERVLET" method="GET"> 
        <h1 class="titulo"> Login Etec</h1>
        <input
            class="textField" 
            type="email" 
            name="email"
            autocomplete="off" 
            placeholder="Email..."
            title="Campo para inserir o email de login do funcionário" 
        ></input> 
        <br>
        <input 
            class="textField" 
            type="password" 
            name="senha"
            autocomplete="off" 
            placeholder="Senha..."
            title="Campo para inserir a senha de login do funcionário" 
            required=""
        ></input> 
        <br>    
        <button 
            title="Botão de ação para cancelar" 
            class="botao" 
            id="cancelar" 
            onclick="trocarTela"
        >
            Cancelar
        </button>
        <button 
            title="Botão de ação para Logar" 
            class="botao" 
            id="salvar" 
            onclick=""
            type="submit" 
            name="btncadest" 
            value="Login"
        >
            Salvar
        </button>
    </div>
    <div class="imagem">
        <img title="Imagem ilustrativa indicando a criação do cadastro" src="../images/login.svg"/>
    </div>
    
    <script>
        let tituloElemento = document.getElementById("titulo2")

        tituloElemento.onclick = trocarTela
    </script> 
</body>
</html>