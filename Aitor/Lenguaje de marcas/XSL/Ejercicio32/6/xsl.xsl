<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <title>Ejercicio 32 - 6</title>
        <style>
          table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
          }
        </style>
      </head>
      <h1>Centro formativo <xsl:value-of select="//centro/@nombre"/>
      </h1>
      <p>Pagina web: <a>
          <xsl:attribute name="href">
            <xsl:value-of select="//centro/@web"/>
          </xsl:attribute>
          <xsl:value-of select="//centro/@web"/>
        </a>
      </p>
      <table>
        <tr>
          <th>Nombre del ciclo</th>
          <th>Grado</th>
          <th>Anioo del título</th>
        </tr>
        <xsl:apply-templates/>
      </table>
    </html>
  </xsl:template>
  <xsl:template match="ciclo">
    <tr>
      <td>
        <xsl:value-of select="nombre"/>
      </td>
      <td>
        <xsl:value-of select="grado"/>
      </td>
      <td>
        <xsl:value-of select="decretoTitulo/@anio"/>
      </td>
    </tr>
  </xsl:template>
</xsl:stylesheet>