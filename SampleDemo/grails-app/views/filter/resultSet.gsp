<html>
<head> display </head>
</html>
<body>
<table>
<tr>
<th> name</th>
<th> password </th>
<th> age</th>
<th> id </th>
<th> gender</th>
<th> organization</th>
<tr>

</tr>
</tr>

<g:each in = "${r}">
<tr>
 <td> ${it.userName} </td>
<td> ${it.password} </td>
<td> ${it.age} </td>
<td> ${it.id} </td>
<td> ${it.gender} </td>
<td> ${it.organization.organization} </td>

</tr>
</g:each>
</table>
</body>