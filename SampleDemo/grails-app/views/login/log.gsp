<html>
<head> 
<h1>
valid user
</h1> 
</head>

<body>
<g:form method= "post" url="[action:'logindetails',controller:'login']">
<tr>
<th> <g:textField name="userName" />USERNAME </th>
</tr>
<tr>
 <th> <g:passwordField name="password" />password  </th>
 </tr>
 <tr>
 <th> <g:submitButton name="submit" value="submit" /></th>
 </tr>
 </g:form>


</body>
</html>