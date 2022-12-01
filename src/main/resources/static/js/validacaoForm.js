function cadastrarPaciente() {
    var fullName = document.getElementById('fullName');
    var cpf = document.getElementById('cpf');
    var dtNasc = document.getElementById('dtNasc');
    var rg = document.getElementById('rg');
    var orgExp = document.getElementById('orgExp');
    var ufRg = document.getElementById('ufRg');
    var endereco = document.getElementById('endereco');
    var numEndereco = document.getElementById('numEndereco');
    var bairro = document.getElementById('bairro');
    var municipio = document.getElementById('municipio');
    var uf = document.getElementById('uf'); 
    var cep = document.getElementById('cep'); 
    var telefone = document.getElementById('telefone');     


    if(fullName.value === "") {
        document.getElementById("fullName").style.borderColor = "red";
        document.getElementById("fullNameSmall").style.visibility = "visible";
            return false;
    }

    if(cpf.value === "") {
        document.getElementById("cpf").style.borderColor = "red";
        document.getElementById("cpfSmall").style.visibility = "visible";
            return false;
    }

    if(dtNasc.value === "") {
        document.getElementById("dtNasc").style.borderColor = "red";
        document.getElementById("dtNascSmall").style.visibility = "visible";
            return false;
    }


    if(rg.value === "") {
        document.getElementById("rg").style.borderColor = "red";
        document.getElementById("rgSmall").style.visibility = "visible";
            return false;
    }

    if(orgExp.value === "") {
        document.getElementById("orgExp").style.borderColor = "red";
        document.getElementById("orgExpSmall").style.visibility = "visible";
            return false;
    }

    if ((ufRg.value == "")||(ufRg.value == null)) {
        document.getElementById("ufRg").style.borderColor = "red";
        document.getElementById("ufRgSmall").style.visibility = "visible";
            return false;
    }


    if(endereco.value === "") {
        document.getElementById("endereco").style.borderColor = "red";
        document.getElementById("enderecoSmall").style.visibility = "visible";
            return false;
    }

    if(numEndereco.value === "") {
        document.getElementById("numEndereco").style.borderColor = "red";
        document.getElementById("numEnderecoSmall").style.visibility = "visible";
            return false;
    }

    if(bairro.value === "") {
        document.getElementById("bairro").style.borderColor = "red";
        document.getElementById("bairroSmall").style.visibility = "visible";
            return false;
    }

    if(municipio.value === "") {
        document.getElementById("municipio").style.borderColor = "red";
        document.getElementById("municipioSmall").style.visibility = "visible";
            return false;
    }

    if ((uf.value == "")||(uf.value == null)) {
        document.getElementById("uf").style.borderColor = "red";
        document.getElementById("ufSmall").style.visibility = "visible";
            return false;
    }

    if(cep.value === "") {
        document.getElementById("cep").style.borderColor = "red";
        document.getElementById("cepSmall").style.visibility = "visible";
            return false;
    }

    if(telefone.value === "") {
        document.getElementById("telefone").style.borderColor = "red";
        document.getElementById("telefoneSmall").style.visibility = "visible";
            return false;
    } 
    
    alert("Paciente cadastrado com sucesso!");
        
    return true;

    

}

function validarEmail(){
    var emailInfo = document.querySelector('#emailInfo');
    var error = document.querySelector('#error-email');

    if(!emailInfo.checkvValidity()){
        error.innerHTML = "Email Inválido";
    }
}


  



// const form = document.getElementById('form');
// const fullName = document.getElementById('fullName');
// const cpf = document.getElementById('cpf');
// const dtNasc = document.getElementById('dtNasc');
// const get



