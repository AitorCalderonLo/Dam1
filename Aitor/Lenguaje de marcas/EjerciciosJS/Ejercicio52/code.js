function multiplicacion(){
  document.getElementById("ta").value = "";

  var x = document.getElementById("n1").value;

  for (var i = 0; i <= x; i++) {
    document.getElementById("ta").value += i + " * " + x + " = " + (i*x) + "\n";
  }

}

function division(){

  document.getElementById("ta").value = "";

  var x = document.getElementById("n1").value;

  for (var i = 1; i <= x; i++) {
    document.getElementById("ta").value += x + " / " + i + " = " + (x/i) + "\n";
  }

}
