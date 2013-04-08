<html>
<h1> flitering </h1>
</html>
<body>
<form action="resultSet">
<table>
<tr>
<td> age</td>
<td>
<g:textField name="fromAge" /> <g:textField name="toAge" />
</td>
</tr>
<tr>
<td> gender</td>
<td>
<lable><g:radio name="gender" value="1"/> male </lable>
   <label><g:radio name="gender" value="2" checked="true"/> Female </label></td>
</tr>
<tr>
<td> organization</td>
<td> <g:select optionKey="id" optionValue="organization"
          		name="orgid" from="${org}" /></td>
</tr><g:submitButton name="submit" value="submit" />
<tr>
<td>  <g:submitButton name="submit" value="submit" /></td></tr>

</table>
</form>

</body>