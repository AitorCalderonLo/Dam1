let $doc := <html lang="es">


<head>
    <title>Restaurantes Euskadi</title>
    <meta charset="utf-8" />
    <script src="js/javascriptcode.js">&#32;</script>

    <link rel="stylesheet" href="css/estilo.css" />

</head>

<body>

    <div class="topnav">
        <a href="index.html">Home</a>
        <a href="bilbao.html">Restaurantes Bilbao</a>
        <a class="active" href="#">Restaurantes Mas Grandes</a>
    </div>

    <section>
        <h2>Restaurantes y asadores</h2>
        <article>
            <h4>Top 10 más grandes</h4>
            <br/>
        <p>
          <a id="btnMostrar" href="javascript:mostrarOcultar();">Mostrar Resultados</a>
        </p>
        <br/>
            
            <table id="tablaRest">
            <tr>
              <th>Nombre</th>
              <th>Provincia</th>
              <th>Municipio</th>
              <th>Email</th>
              <th>Capacidad</th>
            </tr>
                      
            {
              let $restOrdenados :=
   for $restaurantesOrd in doc('xml/restaurantes.xml')//rows/row
    order by $restaurantesOrd/capacity descending
   return $restaurantesOrd
              
               for $restaurantesOrd in subsequence($restOrdenados, 1,10)
                return
                <tr>
                  <td>{data($restaurantesOrd/documentName)}&#32;</td>
                  <td>{data($restaurantesOrd/territory)}&#32;</td>
                  <td>{data($restaurantesOrd/municipality)}&#32;</td>
                  <td>{data($restaurantesOrd/tourismEmail)}&#32;</td>
                  <td>{data($restaurantesOrd/capacity)}&#32;</td>
                </tr>
              
                }
           </table>
            
            
        </article>
    </section>

    <footer>
        Creado por Aitor Calderon en 2021
    </footer>
</body>

</html>

return(
 "<!DOCTYPE html>",
 document{$doc} 
)