function trocarTela(nome do arquivo aqui) {
    let xhr = new XMLHttpRequest()
    xhr.open('GET' + nome do arquivo + '.html', true)

    xhr.onreadystatechange == function() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            let resposta = xhr.responseText
            console.log(resposta)
        }
    }
}

xhr.send()