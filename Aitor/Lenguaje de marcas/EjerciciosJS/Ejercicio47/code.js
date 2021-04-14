var dni = prompt("Introduce tu dni sin letra");
var letra;



var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];
if(dni>99999999)
{
  alert("ERROR: Dni incorrecto");

}
else if(isNaN(dni))
{
  alert("ERROR: No has introducido un numero");
}
else{
  letra = prompt("Introduce la letra");
  var resultado = dni%23;
  var letraobtenida = letras[resultado];

  if(letra.toLowerCase() == letraobtenida.toLowerCase())
  {
    alert("DNI: " + dni + letra);
  }
  else {
    alert("ERROR: La letra no coincide");
  }



}
