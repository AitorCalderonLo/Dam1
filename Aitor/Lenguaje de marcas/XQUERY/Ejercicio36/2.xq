for $carreras in doc('carreras.xml')//universidad/carreras/carrera
return 
<carrera id="{data($carreras/@id)}">
  <creditos>{data($carreras/creditos)}</creditos>
  <creditos_teoricos>
    {
      sum(
        for $asignatura in doc("carreras.xml")//universidad/asignaturas/asignatura[@titulacion=data($carreras/@id)]
          return $asignatura/creditos_teoricos
        )
    }
  </creditos_teoricos>
  <creditos_practicos>
   {
      sum(
        for $asignatura in doc("carreras.xml")//universidad/asignaturas/asignatura[@titulacion=data($carreras/@id)]
          return $asignatura/creditos_practicos
        )
    }
  </creditos_practicos>
</carrera>

