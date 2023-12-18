<%-- 
    Document   : SugestaoVIEW_Cadastrar
    Created on : 26/10/2023, 10:40:47
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
        <form action="../SugestaoSERVLET" method="GET">
            
            Nome Sugestao
            <input type="text" name="sugestao">
            <br>
            <input type="submit" name="btncadest" value="Salvar">
            
        </form>
    </body>
</html> -->
<head>
    <meta charset="UTF-8">
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sugestao</title>
    <link rel="stylesheet" href="../css/stylesLogin.css">
</head>
<body>
    <div 
        class="modal" 
        action="../SugestaoSERVLET" 
        method="GET"
    > 
        <h1 class="titulo"> Sugestão Etec</h1>
        <input
            class="textField" 
            type="text" 
            name="sugestao"
            autocomplete="off" 
            placeholder="Sugestão..."
            title="Campo para inserir a sugestão" 
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
            title="Botão de ação para Salvar" 
            class="botao" 
            id="salvar" 
            onclick=""
            type="submit" 
            name="btncadest" 
            value="Salvar"
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