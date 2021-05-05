<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" omit-xml-declaration="yes"/>
  <xsl:template match="/">
    <contenidoRelleno>
      <xsl:attribute name="descripcion">
        <xsl:value-of select="//contenidoRelleno/@descripcion"/>
      </xsl:attribute>
      <elementos>
        <xsl:for-each select="//elementos/elemento">
          <elemento>
            <xsl:value-of select="."/>
          </elemento>
      </elementos>
    </contenidoRelleno>
    <xsl:for-each select="//elementos/elemento">

  

    <museo>
      <xsl:attribute name="ubicacion"><xsl:value-of select="@ciudad" /> (<xsl:value-of select="@pais" />)</xsl:attribute>
      <xsl:value-of select="@nombre" />
    </museo>
  </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>