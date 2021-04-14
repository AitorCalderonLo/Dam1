var valores = [true, 3, false, "infor", "java", 7];

var a = 10;
var b = 15;

if (valores[3].length > valores[4].length) {
  alert("La cadena mas larga es: " + valores[3]);
} else if (valores[3].length < valores[4].length) {
  alert("La cadena mas larga es: " + valores[4]);
} else if (valores[3].length == valores[4].length) {
  alert("Las cadenas: " + valores[3] + " y " + valores[4] + " son igual de largas");
} else {
  alert("Error: No son Strings");
}

alert("A = " + a + "\nB = " + b + "\n\nLa suma de A + B = " + (a + b) +
  "\nLa resta de A - B = " + (a - b) + "\nla multiplicacion de a*b = " + (a * b) + "\nla division de a/b = " + (a / b));

var miarray = [33, 2, 36, 55, 4, 1];

var pequegrande = miarray.slice();

alert("Sort: " + pequegrande.sort(function(a, b){return a-b}) + "\n\nSort al reves: "+ pequegrande.sort(function(a, b){return b-a}));


pequegrande = pequegrande.sort(function(a, b){return a-b});
alert("Pequegrande: "+pequegrande);

var grande = miarray.slice();
grande = grande.sort(function(a, b){return b-a});
alert("Grande: "+grande);

alert("Array inicial: " + miarray + "\nPequegrande: "+pequegrande + "\nGrande: "+grande);

var arrayalf = ['Mota', 'sofa', 'Abalorio', 'anti', 'Sabadell', 'nova', 'billete', 'Zombie'];

arrayalf=arrayalf.sort((a, b) => {
 if(a.toLowerCase()> b.toLowerCase()) {
   return 1;
 } else if(a.toLowerCase() < b.toLowerCase()) {
   return -1;
 } else {
   return 0;
 }
});
alert("Array ordenado alfabeticamente: " + arrayordenado);
