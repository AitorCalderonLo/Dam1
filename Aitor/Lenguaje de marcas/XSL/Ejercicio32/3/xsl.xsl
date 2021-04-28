<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <title>Ejercicio 32 - 3</title>
      </head>
      <body>
        <ul>
          <xsl:apply-templates/>
        </ul>
      </body>
    </html>
  </xsl:template>
  <xsl:template match="ciclo">
    <li>
      <xsl:value-of select="nombre"/>
    </li>
  </xsl:template>
</xsl:stylesheet>