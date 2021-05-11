<carreras>
{
for $carreras in doc('carreras.xml')//universidad/carreras/carrera
return 

<carrera>
  <nombre>{$carreras/nombre/text()}</nombre>
  
  <alumnos>
  {
     for $alumnos in doc('carreras.xml')//universidad/alumnos/alumno
     where data($alumnos/estudios/carrera/@codigo)=data($carreras/@id)
     return 
    <alumno>{$alumnos/nombre/text()}&#160;{$alumnos/apellido1/text()}&#32;{$alumnos/apellido2/text()}</alumno>
   }
  </alumnos>
</carrera>
}
</carreras>