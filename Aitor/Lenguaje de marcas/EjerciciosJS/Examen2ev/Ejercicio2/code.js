function calc(){

  var num1 = document.getElementById("num1").value;
  var num2 = document.getElementById("num2").value;
  var num3 = document.getElementById("num3").value;

  var mayor = Math.max(num1,num2,num3);
  var menor = Math.min(num1,num2,num3);
  var texto = "";
  if(num1 == num2 && num1 == num3)
  {
    texto = "Todos los numeros son iguales"
  }


  var texto = document.getElementById("demo").innerHTML = "Numeros = " +num1+ ", " + num2 + ", " + num3 + "<br>Mayor: " +
  mayor + "<br>Menor: " +menor+ "<br>" +texto+"<br>"+ num1 + "<br>" + num2 + "<br>" + num3;





}
