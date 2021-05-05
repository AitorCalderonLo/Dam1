<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <xsl:for-each select="pension/habitaciones/habitacion">
      <xsl:value-of select="nombre"/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>