function checkEmail() {
     var input = document.getElementsByName("email")[0];
    var button = document.getElementById("submitButton");
    var check = /^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    var esito;
    if (!input.value.match(check)) {
        $('#email').css("border-bottom", "1px solid #BB0000");
        $('#rsEmail').css("display", "inline");
        $('#rsEmail').css("color", "#BB0000").html('Email non valida');
        $('#email').css("color", "#BB0000");
        button.setAttribute("type", "button");
        esito = false;
    } else if (input.value.match(check)) {
        $('#email').css("border-bottom", "2px solid green");
        $('#rsEmail').css("display", "none");
        $('#email').css("color", "#1E1E24");
        esito = true;
    }
    return esito;
}

function checkPassword(event) {
    var input = document.getElementsByName("password")[0];
    var button = document.getElementById("submitButton");
    var errorMessage = document.getElementById("errorMessage");
    var esito;

    // Verifica se la password non rispetta le caratteristiche richieste
    if (input.value.length < 8 || input.value.length > 16 ||
        !/[A-Z]/.test(input.value) ||
        !/[0-9]/.test(input.value) ||
        !/[!@#$%^&*]/.test(input.value)) {

        // Mostra il messaggio di errore
        $('#password').css("border-bottom", "2px solid #BB0000");
        errorMessage.textContent = 'La password non rispetta le caratteristiche richieste';
        button.setAttribute("type", "button");
        esito = false;
    } else {
        // La password rispetta tutte le regole
        $('#password').css("border-bottom", "2px solid green");
        errorMessage.textContent = '';
        esito = true;
    }

    if (event.keyCode === 13) {
        if (!esito) {
            event.preventDefault();
        }
    }

    return esito;
}



function checkNome() {
    var input = document.getElementsByName("nome")[0];
    var button = document.getElementById("submitButton");
    var check = /^[A-Za-z]{2,32}$/;
    var esito;
    if (!input.value.match(check)) {
        $('#nome').css("border-bottom", "2px solid #BB0000");
        $('#rsNome').css("display", "inline");
        $('#rsNome').css("color", "#BB0000").html('Nome non valido');
        $('#nome').css("color", "#BB0000");
        button.setAttribute("type", "button");
        esito = false;
    } else if (input.value.match(check)) {
        $('#nome').css("border-bottom", "2px solid green");
        $('#rsNome').css("display", "none");
        $('#nome').css("color", "#1E1E24");
        esito = true;
    }
    return esito;
}

function checkCognome() {
    var input = document.getElementsByName("cognome")[0];
    var button = document.getElementById("submitButton");
    var check = /^[A-Za-z]{2,32}$/;
    var esito;
    if (!input.value.match(check)) {
        $('#cognome').css("border-bottom", "2px solid #BB0000");
        $('#rsCognome').css("display", "inline");
        $('#rsCognome').css("color", "#BB0000").html('Cognome non valido');
        $('#cognome').css("color", "#BB0000");
        button.setAttribute("type", "button");
        esito = false;
    } else if (input.value.match(check)) {
        $('#cognome').css("border-bottom", "2px solid green");
        $('#rsCognome').css("display", "none");
        $('#cognome').css("color", "#1E1E24");
        esito = true;
    }
    return esito;
}

function checkRegistrationSubmit() {
    var button = document.getElementById("submitButton");
    if (checkEmail() && checkPassword() && checkNome() && checkCognome()) {
        button.setAttribute("type", "submit");
    }
}
