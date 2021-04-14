function calc() {

  var cantidad = document.getElementById("cantidad").value;
  var divisa1 = document.getElementById("divisa1").value;
  var divisa2 = document.getElementById("divisa2").value;
  var resultado = document.getElementById("resul").value;

  /* PASAR DIVISA A Euros*/
  var divisaEnEuros = cantidad;

  if (divisa1 == 'usd') {
    divisaEnEuros = parseInt(cantidad) / 1.205;
  }
  if (divisa1 == 'yen') {
    divisaEnEuros = parseInt(cantidad) / 131.8925;
  }
  if (divisa1 == 'frsuizo') {
    divisaEnEuros = parseInt(cantidad) / 1.1514;
  }

  /* PASAR Euros a su divisa correspondiente*/

  if (divisa2 == 'usd') {
    divisaEnEuros = parseInt(divisaEnEuros) * 1.205;
  }
  if (divisa1 == 'yen') {
    divisaEnEuros = parseInt(divisaEnEuros) * 131.8925;
  }
  if (divisa1 == 'frsuizo') {
    divisaEnEuros = parseInt(divisaEnEuros) * 1.1514;
  }

  if(divisa1 == divisa2)
  {
    document.getElementById("resul").value = cantidad;
  }
  else
  {
    document.getElementById("resul").value = divisaEnEuros;
  }




}
