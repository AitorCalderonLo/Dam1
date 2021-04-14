//ejecuta siempre
document.onclick = accion;
document.onmousemove = accion;
document.onkeypress = accion;

function accion(input) {
    // a la variable evento se le asigna event o si esta es undefined le metemos window.event asi funcionara en Internet explorer tmb
    // es como un if else
    var evento = input || window.event;
    switch (evento.type) {
        case 'mousemove':
            document.getElementById('info').style.backgroundColor = '#FFFFFF';

            var xPagina;
            var yPagina;
            var xNavegador;
            var yNavegador;

            xPagina = evento.pageX;
            yPagina = evento.pageY;
            xNavegador = evento.clientX;
            yNavegador = evento.clientY;
            muestraInformacion(['Rat&oacute;n', 'Navegador [' + xPagina + ', ' + yPagina + ']', 'P&aacute;gina [' + xNavegador + ', ' + yNavegador + ']']);
            break;

        case 'keypress':
            document.getElementById('info').style.backgroundColor = '#CCE6FF';

            var letra = String.fromCharCode(evento.charCode);
            var codcharcode = letra.charCodeAt(0);

            muestraInformacion(['Teclado', 'Car&aacute;cter [' + letra + ']', 'Código [' + codcharcode + ']']);
            break;

        case 'click':
            document.getElementById('info').style.backgroundColor = '#FFFFCC';
            break;
    }
}


function muestraInformacion(mensaje) {
    document.getElementById("info").innerHTML = '<h1>' + mensaje[0] + '</h1>';
    for (var i = 1; i < mensaje.length; i++) {
        document.getElementById("info").innerHTML += '<p>' + mensaje[i] + '</p>';
    }
}