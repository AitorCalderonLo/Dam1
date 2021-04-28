<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <title>Ejercicio 32 - 4</title>
        <style>
          table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
          }
        </style>
      </head>
      <body>
        <table>
          <xsl:apply-templates/>
        </table>
      </body>
    </html>
  </xsl:template>
  <xsl:template match="ciclo">
    <tr>
      <td>
        <xsl:value-of select="nombre"/>
      </td>
    </tr>
  </xsl:template>
</xsl:stylesheet>