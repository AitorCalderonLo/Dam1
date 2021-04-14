function funciontext(){
  var alfabeto = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"];
  var cantidadLetra = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
  var valor = document.getElementById("texto").value;
  
  var ab = funcion1(valor);


  document.write("El texto " + ab + "<br>");

  var palabras = valor.split(" ");

  for (var i = 0; i < valor.length ; i++) {
    var x = valor[i].toLowerCase();
    for (var j = 0; j < alfabeto.length ; j++)
    {
      if(x == alfabeto[j])
      {
        cantidadLetra[j] = cantidadLetra[j]+1;
      }
    }
  }
  document.write("<h3>Cantidad de letras</h3>")
  for (var q = 0; q < alfabeto.length ; q++) {
    document.write(alfabeto[q] + ": " + cantidadLetra[q] + " | ");
  }

  var contadorpalabras = 0;
  var primera="";
  var ultima="";
  for (var h = 0; h < palabras.length ; h++) {
    contadorpalabras++;
    if(h==0)
    {
      primera = palabras[h];
    }
    if(h==(palabras.length-1))
    {
      ultima = palabras[h];
    }
  }

  document.write("<br><br>Cantidad de palabras: "+contadorpalabras);
  document.write("<br>Primera palabra: "+primera);
  document.write("<br>Ultima palabra: "+ultima);

  var palabrasreverse = palabras.reverse();

  document.write("<br><br>Palabras invertidas: " + palabrasreverse);

  var ordenado = palabras.sort((a, b) => {
   if(a.toLowerCase()> b.toLowerCase()) {
     return 1;
   } else if(a.toLowerCase() < b.toLowerCase()) {
     return -1;
   } else {
     return 0;
   }
  });

  document.write("<br><br>Palabras ordenadas: " + ordenado);

  var alreves = palabras.sort((a, b) => {
   if(a.toLowerCase()< b.toLowerCase()) {
     return 1;
   } else if(a.toLowerCase() > b.toLowerCase()) {
     return -1;
   } else {
     return 0;
   }
  });



  document.write("<br><br>Palabras al reves: " + alreves);


}

function funcion1(texto)
{

  var resultado="";
  if(texto == texto.toUpperCase()) {
    resultado += " está formada sólo por mayúsculas";
  }
  else if(texto == texto.toLowerCase()) {
    resultado += " está formada sólo por minúsculas";
  }
  else {
    resultado += " está formada por mayúsculas y minúsculas";
  }

  return resultado;
}
