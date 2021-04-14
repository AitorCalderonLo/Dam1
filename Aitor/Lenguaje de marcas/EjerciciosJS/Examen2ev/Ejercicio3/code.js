function permite(){
    var campo = document.getElementById("nombre").value; //Se llama campo porque asi no tengo que estar haciendo una variable nueva por cada campo
    if(campo == null || campo == ""){
      document.getElementById("nombre").style.background = 'red';
    }
    campo = document.getElementById("ape1").value;
    if(campo == null || campo == ""){
        document.getElementById("ape1").style.background = 'red';
    }
    campo = document.getElementById("apel2").value;
    if(campo == null || campo == ""){
        document.getElementById("apel2").style.background = 'red';
    }
    campo = document.getElementById("dire").value;
    if(campo == null || campo == "" || campo.length < 10){
        document.getElementById("dire").style.background = 'red';
    }



    campo = document.getElementById("correo").value;
    if(campo == null || campo == ""){
        document.getElementById("correo").style.background = 'red';
    }
    else{
        if(!comprobarCodigo(campo)){

        }
    }
    campo = document.getElementById("municipio").value;
    if(campo == null || campo == ""){
        document.getElementById("municipio").style.background = 'red';
    }

    campo = document.getElementById("dias").value;
    if(parseInt(campo)>=1 && parseInt(campo)<=15 ){

    }
    else
    {
      document.getElementById("dias").style.background = 'red';
      document.getElementById("dias").value = 1;
    }

    campo = document.getElementById("municipio").value;
    if(campo == null || campo == ""){
        document.getElementById("municipio").style.background = 'red';
    }

    campo = document.getElementById("numpers").value;
    if(parseInt(campo)>=1 && parseInt(campo)<=5 ){

    }
    else
    {
      document.getElementById("numpers").style.background = 'red';
      document.getElementById("numpers").value = 1;
    }

    campo = document.getElementById("numnin").value;
    if(parseInt(campo)>=0 && parseInt(campo)<=4 ){

    }
    else
    {
      document.getElementById("numnin").style.background = 'red';
    }

    var lista = document.getElementById("zona");
    var textoSeleccionado = lista.options[lista.selectedIndex].text;
    if(textoSeleccionado == null || textoSeleccionado == ""){
        document.getElementById("zona").style.background = 'red';
    }
    lista = document.getElementById("estado");
    textoSeleccionado = document.getElementById("estado").options[lista.selectedIndex].text;
    if(textoSeleccionado == null || textoSeleccionado == "" || textoSeleccionado == "..."){
        document.getElementById("estado").style.background = 'red';
    }
    campo = document.getElementById("correoe").value;
    if(!comprobarEmail(campo)){}

    campo = document.getElementById("telefonoF").value;
    if(campo == null || campo == ""){
        if(!comprobarTelefono(campo)){
          document.getElementById("telefonoF").style.background = 'red';
        }
    }
    campo = document.getElementById("Movil").value;
    if(campo == null || campo == ""){
        if(!comprobarTelefono(campo)){
            document.getElementById("Movil").style.background = 'red';
        }
    }
}

function comprobarCodigo(codigo){
    if(codigo.length == 5 && !isNaN(codigo)){
        return true;
    }
    else{
        return false;
    }
}

function comprobarTelefono(tlfn){
    if(tlfn.length == 9 && !isNaN(tlfn)){
        return true;
    }
    else{
        return false;
    }
}

function comprobarEmail(email){
    if(email.search(/.*@*\.*./i) == -1){
        document.getElementById("correoe").style.background = 'red';
    }
}
