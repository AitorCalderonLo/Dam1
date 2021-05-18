replace value of node doc("carreras.xml")//universidad/carreras/carrera[@id=c02]/@id
with "EMPR",

for $asig in db:open("carreras", "carreras.xml")/universidad/asignaturas/asignatura[@titulacion="c02"]
return
  replace value of node ($asig/@codigo)/@id with "EMPR",
 
 for $alum in db:open("carreras", "carreras.xml")/universidad/alumnos/alumno/estudios/carrera[@codigo="c02"]
return
  replace value of node ($alum/@codigo) with "EMPR"