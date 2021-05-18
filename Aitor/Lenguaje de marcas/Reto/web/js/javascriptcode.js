function mostrarOcultar() {

    tabla = document.getElementById('tablaRest');
    boton = document.getElementById('btnMostrar');


    if (tabla.style.display == 'block') {
        tabla.style.display = 'none';
        boton.innerHTML = 'Mostrar Resultados';
    } else {
        tabla.style.display = 'block';
        boton.innerHTML = 'Ocultar Resultados';
    }

}