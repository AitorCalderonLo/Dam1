function espar() {

  var error = true;
  while (error == true) {

    try {
      error = false;
      if (isNaN(num) || num == 0) {
        error = true;
        throw "No has colocado un numero o has insertado 0";
      } else {
        if (num % 2 == 0) {
          alert("El numero " + num + " es un numero par");

        } else {
          alert("El numero " + num + " NO es un numero par");

        }

      }
    } catch (error) {
      alert("Error: " + error);
      num = Number(prompt("Inserta un numero para la comprobacion de pares:"));
    }
  }
}

function mifuncion1() {
  var error = true;
  while (error == true) {

    try {
      error = false;
      if (isNaN(preg1) || preg1 < 10000000) {
        error = true;
        throw "Has colocado un numero erroneo";

      }
      else{
          var preg1string =  preg1.toString();
          var resultado = preg1string.substr(0,3)
          alert(resultado);
      }

    } catch (error) {
      alert("Error: " + error);
      preg1 = Number(prompt("Por favor introduzca un número igual o mayor a 10000000"));
    }
  }

}

function validateDecimal(valor) {
    var RE = /^[-+]?[0-9]+\.[0-9]+$/;;
    if (RE.test(valor)) {
        return true;
    } else {
        return false;
    }
}

function mifuncion2() {
  var error = true;
  while (error == true) {

    try{
      error=false;

    var booleana = validateDecimal(numdec);
    if(booleana == false)
    {
      error=true;
      alert("Has introducido un numero incorrecto")
      numdec = parseFloat(prompt("Por favor introduzca ahora un número con  decimales, ejemplo : 3.2416"));
    }
    else
    {
      alert("Numero con dos decimales: " + numdec.toFixed(2));
    }



    } catch (error) {
      alert("Error: " + error);
      numdec = parseFloat(prompt("Por favor introduzca ahora un número con  decimales, ejemplo : 3.2416"));
    }
  }

}

var num = Number(prompt("Inserta un numero para la comprobacion de pares:"));

espar(num);

var preg1 = Number(prompt("Por favor introduzca un número igual o mayor a 10000000"));

mifuncion1(preg1);

var numdec = parseFloat(prompt("Por favor introduzca ahora un número con  decimales, ejemplo : 3.2416"));

mifuncion2(numdec);
