var estoydato1 = false;
var estoydato2 = false;

function dato1(){


  document.getElementById("d1").value = "";

  estoydato1 = true;
  estoydato2 = false;


}

function dato2(){

  document.getElementById("d2").value = "";

  estoydato2 = true;
  estoydato1 = false;


}


function add(key) {
    if(estoydato1)
    {
        document.getElementById("d1").value += key;
    }

    if(estoydato2)
    {
        document.getElementById("d2").value += key;
    }

  }

function sumar(){
  var x = parseFloat(document.getElementById("d1").value);
  var y = parseFloat(document.getElementById("d2").value);
  var suma = x+y;

  document.getElementById("result").value = suma;

}
