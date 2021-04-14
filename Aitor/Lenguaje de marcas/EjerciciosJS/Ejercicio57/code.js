function muestra() {

  var texto = document.getElementById("adicional");
  var enlace = document.getElementById("enlace");
  
  if(enlace.textContent == "Seguir leyendo")
  {
    texto.setAttribute("class","visible");
    enlace.innerHTML = "Mostrar";
  }
  else
  {
    texto.setAttribute("class","oculto");
    enlace.innerHTML = "Seguir leyendo";
  }

}
