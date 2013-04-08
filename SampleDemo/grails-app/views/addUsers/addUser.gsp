<html>
<head>
 <h1> Adding Details </h1>
</head>

<body>
<form method="post" name="addUser" url="[action:'addUser',controller:'addUsers']">
 <table>
   <thead> adding </thead>
   <tr> 
   <td> user name</td>
   <td><g:textField name="userName" /> </td>
   </tr>
   <tr> 
   <td> password</td>
   <td> <g:passwordField name="password" /> </td> 
   </tr>
   <tr>
   <td> gender</td>
   <td>
   <lable><g:radio name="gender" value="1"/> male </lable>
   <label><g:radio name="gender" value="2" checked="true"/> Female </label>
   </td> 
   </tr>
   <tr>
   <td> age </td>
   <td> <g:textField name="age" /> </td>
   </tr>
   <tr>
   <g:submitButton name="update" value="add" />
   </tr>
   <tr>
   <td> organizations</td>
   <td>  <g:select optionKey="id" optionValue="organization"
          		name="orgid" from="${org1}" /></td>
   </tr>
 </table>

</form>

</body>
</html>