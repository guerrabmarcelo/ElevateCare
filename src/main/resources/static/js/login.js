function logar() {

    var login = document.getElementById('login').value; 
    var senha = document.getElementById('senha').value;

    if(login == "admin@irm.com" && senha == "senha"){
        location.href = "home2.html";
    } else {
        alert('Usuário ou senha incorretos');
    }
}