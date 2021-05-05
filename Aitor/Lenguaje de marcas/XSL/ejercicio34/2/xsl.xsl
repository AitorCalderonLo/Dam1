<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <title>Ejercicio 34</title>
      </head>
      <body>
        <h2>Ocupaciones en Hostal Dormir DELUXE</h2>
        <table border="1">
          <tr>
            <th>Nombre</th>
            <th>Fecha</th>
            <th>Dias</th>
          </tr>
          <xsl:for-each select="//ocupacion">
            <tr>
              <td>
                <xsl:value-of select="nombre"/>
              </td>
              <td>
                <xsl:value-of select="fechaInicio"/>
              </td>
              <td>
                <xsl:value-of select="diasEstancia"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>