for $baile in doc('bailes.xml')//bailes/baile
where $baile/sala=2
and $baile/precio<35
return $baile/nombre/text()

