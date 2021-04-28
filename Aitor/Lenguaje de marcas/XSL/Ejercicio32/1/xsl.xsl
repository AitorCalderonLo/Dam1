<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:template match="/">
  <ciclos>
    <xsl:apply-templates/>
  </ciclos>
</xsl:template>

  <xsl:template match="ciclo">
    <ciclo>
     <xsl:value-of select="nombre"/>
    </ciclo>
  </xsl:template>

</xsl:stylesheet>