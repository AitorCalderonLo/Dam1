var meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
alert(meses[0]);
alert(meses[1]);
alert(meses[2]);
alert(meses[3]);
alert(meses[4]);
alert(meses[5]);
alert(meses[6]);
alert(meses[7]);
alert(meses[8]);
alert(meses[9]);
alert(meses[10]);
alert(meses[11]);

function random(min, max) {
    return Math.floor((Math.random() * (max - min + 1)) + min);
}

var numeros = [random(1,100),random(1,100),random(1,100),random(1,100),random(1,100),random(1,100),random(1,100),random(1,100),random(1,100),random(1,100)]
alert("El numero maximo es: "+Math.max(
  numeros[0],
  numeros[1],
  numeros[2],
  numeros[3],
  numeros[4],
  numeros[5],
  numeros[6],
  numeros[7],
  numeros[8],
  numeros[9]
));

alert("El numero minimo es: "+Math.min(
  numeros[0],
  numeros[1],
  numeros[2],
  numeros[3],
  numeros[4],
  numeros[5],
  numeros[6],
  numeros[7],
  numeros[8],
  numeros[9]
));
