<table border="1">
<tr>
  <th>Baile</th>
  <th>Plazas disp</th>
  <th>Profesor</th>
</tr>
{
for $baile in doc('bailes.xml')//bailes/baile
where $baile/precio/@cuota="mensual"
order by  $baile/plazas
return 
<tr>
  <td>{$baile/nombre/text()}</td>
  <td>{$baile/plazas/text()}</td>
  <td>{$baile/profesor/text()}</td>
</tr>
}
</table>
