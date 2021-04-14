var numero1 = 5;
var numero2 = 8;


  if (numero1<numero2){
     alert ("el número 1 no es mayor que número 2");
  }
  if (numero2>0){
     alert ("el número 2 es positivo");
  }
  if (numero1<=0){
     alert ("el número 1 es negativo o cero ");
  }
  if (numero1>=numero2){
     alert ("aumento en número 1 no igual o mayor que número 2");
  }

for(i = 1; i <= 100; i++)
{

  x = 0;
  primo = "Es primo";
  for(j = 1; i >= j; j++)
    {
      if(i%j==0)
      {
        x++;
      }

    }

    if(x>2)
    {
      primo = "No es primo";
    }

    document.write("Numero " + i + " " + primo +"<br>");

}
