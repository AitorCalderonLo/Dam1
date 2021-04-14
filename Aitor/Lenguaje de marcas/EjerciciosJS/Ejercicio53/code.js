window.onload = iniciarTicket;
var i = 1;
var arrNumCompra =  new Array();
var arrProducto =  new Array();
var arrCant =  new Array();
var arrPrecio =  new Array();
var arrTotal =  new Array();

function iniciarTicket(){

  document.getElementById("ticket").value = "Numero\t\tProducto\t\tCantidad\t\tPrecio\t\tTotal\t\t";
  document.getElementById("numcompra").value = 1;
  document.getElementById("producto").value = "";
}

function pulsadoGuardar(){

  var j = parseInt(document.getElementById("numcompra").value);

  arrNumCompra[j] = parseInt(document.getElementById("numcompra").value);
  arrProducto[j] = document.getElementById("producto").value;
  arrCant[j] = parseInt(document.getElementById("cant").value);
  arrPrecio[j] = calcularPrecio(document.getElementById("producto").value);
  arrTotal[j] = calcularTotal(document.getElementById("producto").value);

  document.getElementById("ticket").value += "\n"
  + document.getElementById("numcompra").value
  + "\t\t"+ document.getElementById("producto").value
  +"\t\t" + document.getElementById("cant").value
  +"\t\t\t"+ calcularPrecio(document.getElementById("producto").value)
  + "\t\t"+calcularTotal(document.getElementById("producto").value) +"\t\t";

  var comodin = parseInt(document.getElementById("numcompra").value) + 1;

  document.getElementById("numcompra").value = comodin;
  document.getElementById("producto").value = "";
  document.getElementById("iva").value = "";
  document.getElementById("cant").value = "";

}

function generarFact(){
  alert("hola")
  document.getElementById("cambiar").innerHTML = "a";
  document.getElementById("cambiar").innerHTML = '<table border="1">';
  document.getElementById("cambiar").innerHTML = '<tr>';
    document.getElementById("cambiar").innerHTML = "<td>";
      document.getElementById("cambiar").innerHTML = "Numero";
    document.getElementById("cambiar").innerHTML = "</td>";
    document.getElementById("cambiar").innerHTML = "<td>";
      document.getElementById("cambiar").innerHTML = "Producto";
    document.getElementById("cambiar").innerHTML = "</td>";
    document.getElementById("cambiar").innerHTML = "<td>";
      document.getElementById("cambiar").innerHTML = "Cantidad";
    document.getElementById("cambiar").innerHTML = "</td>";
    document.getElementById("cambiar").innerHTML = "<td>";
      document.getElementById("cambiar").innerHTML = "Precio";
    document.getElementById("cambiar").innerHTML = "</td>";
    document.getElementById("cambiar").innerHTML = "<td>";
      document.getElementById("cambiar").innerHTML = "Total";
    document.getElementById("cambiar").innerHTML = "</td>";


  document.getElementById("cambiar").innerHTML = "</tr>";
  for (var i = 0; i < arrNumCompra.length -1; i++) {
    document.getElementById("cambiar").innerHTML = "<tr>";
      document.getElementById("cambiar").innerHTML = "<td>";
          document.getElementById("cambiar").innerHTML = arrNumCompra[i];
      document.getElementById("cambiar").innerHTML = "</td>";
      document.getElementById("cambiar").innerHTML = "<td>";
          document.getElementById("cambiar").innerHTML = arrProducto[i];
      document.getElementById("cambiar").innerHTML = "</td>";
      document.getElementById("cambiar").innerHTML = "<td>";
          document.getElementById("cambiar").innerHTML = arrCant[i];
      document.getElementById("cambiar").innerHTML = "</td>";
      document.getElementById("cambiar").innerHTML = "<td>";
          document.getElementById("cambiar").innerHTML = arrPrecio[i];
      document.getElementById("cambiar").innerHTML = "</td>";
      document.getElementById("cambiar").innerHTML = "<td>";
          document.getElementById("cambiar").innerHTML = arrTotal[i];
      document.getElementById("cambiar").innerHTML = "</td>";
    document.getElementById("cambiar").innerHTML = "</tr>";
  }
  document.getElementById("cambiar").innerHTML = "</table>";
}

function calcularPrecio(x){

  if(x=="chaqueta")
  {
    return 20.90;
  }
  else if (x=="falda") {
    return 5.45;
  }
  else if (x=="zapatos") {
    return 25.80;
  }
  else if (x=="calcetines") {
    return 5.40;
  }
  else if (x=="camiseta") {
    return 15.30;
  }
  else if (x=="abrigo") {
    return 35.30;
  }

}

function calcularTotal(input){

  var x = parseFloat(calcularPrecio(input));
  var y = parseInt(document.getElementById("cant").value);

  return x * y;

}
