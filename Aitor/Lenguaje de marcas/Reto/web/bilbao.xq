let $doc := <html lang="es">

<head>
    <title>Restaurantes Euskadi</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css/estilo.css" />

</head>

<body>

    <div class="topnav">
        <a href="index.html">Home</a>
        <a class="active" href="#">Restaurantes Bilbao</a>
        <a href="grandes.html">Restaurantes Mas Grandes</a>
    </div>

    <section>
        <h2>Restaurantes y asadores</h2>
        <article>
            <h4>Ubicacion: Bilbao</h4>
            <br/>
            <ul class="estiloUl">{ for $restaurante in doc('xml/restaurantes.xml')//rows/row where $restaurante/municipality = 'Bilbao' return
                <li class="nombreRes"><a class="estilolink" href="{data($restaurante/web)}">{data($restaurante/documentName)}</a></li>
                }
            </ul>
        </article>
    </section>
    <br/>

    <footer>
        Creado por Aitor Calderon en 2021
    </footer>
</body>

</html>

return(
 "<!DOCTYPE html>",
 document{$doc} 
)