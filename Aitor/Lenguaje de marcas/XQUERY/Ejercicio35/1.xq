for $baile in doc('bailes.xml')//bailes/baile
where $baile/sala=1
return $baile/nombre/text()

