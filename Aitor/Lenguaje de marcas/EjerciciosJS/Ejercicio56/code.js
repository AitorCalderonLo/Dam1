var celda = 3;

function reseteoColumnas(){
  columna = 1;
}

var crearTR = document.createElement("tr");
var crearTD = document.createElement("td");
var node = document.createTextNode("");

function insertar(){
  var tbody = document.getElementById("tbodytb1");

  var columna = 1;

  var crearTR = document.createElement("tr");
    var crearTD1 = document.createElement("td");
    var crearTD2 = document.createElement("td");
    var crearTD3 = document.createElement("td");
    crearTD1.appendChild(document.createTextNode(celda + ","+ columna + " celda"))
    columna++;
    crearTD2.appendChild(document.createTextNode(celda + ","+ columna + " celda"))
    columna++;
    crearTD3.appendChild(document.createTextNode(celda + ","+ columna + " celda"))
    columna++;

    tbody.appendChild(crearTR);
    crearTR.appendChild(crearTD1);
    crearTR.appendChild(crearTD2);
    crearTR.appendChild(crearTD3);

    celda++;
}

function eliminar(){
  var tbody = document.getElementById("tbodytb1");
  var arrTr = tbody.getElementsByTagName("tr");
  if(arrTr.length>0)
  {
    tbody.removeChild(arrTr[arrTr.length - 1]);
    celda--;
  }
  else
  {
    alert("No puedes borrar filas si no existen")
  }



}
