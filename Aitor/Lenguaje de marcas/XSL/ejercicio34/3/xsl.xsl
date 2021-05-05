<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="habitaciones">
    <habitaciones>
      <xsl:for-each select="habitacion">
        <habitacion>
          <xsl:attribute name="codigo"/>
          <xsl select="./@codigo" />
        </habitacion>
      </xsl:for-each>
    </habitaciones>
  </xsl:template>
</xsl:stylesheet>