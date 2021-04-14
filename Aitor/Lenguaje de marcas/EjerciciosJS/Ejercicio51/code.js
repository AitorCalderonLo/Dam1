function calcular() {

  var x = document.getElementsByName("rad")[0];

  if (isNaN(document.getElementById("n1").value)) {
    alert("El dato introducido no es un numero.")
  } else {

    if (x.checked) {

      document.getElementById("result").value = factorial(document.getElementById("n1").value);
    } else {
      document.getElementById("result").value = Math.log(document.getElementById("n1").value);
    }
  }
}

function factorial(n) {
  var total = 1;
  for (i = 1; i <= n; i++) {
    total = total * i;
  }
  return total;
}
