<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action = "saveStudent" method="post" modelAttribute="reg">
<table>

<tr>
<td>NAME</td>
<td> <form:input path="name"/> </td>
</tr> 

<tr>
<td>USERNAME</td>
<td> <form:input path="uname"/> </td>
</tr>

<tr>
<td>PWD</td>
<td> <form:input path="pwd"/> </td>
</tr>

<tr>
<td>CITY</td>
<td> <form:input path="city"/> </td>
</tr>
<tr>
<td>MARKS</td>
<td> <form:input path="marks"/> </td>
</tr>

<tr>
<td>GENDER</td>
<td>
 <form:radiobuttons path="gender" items="${g}"/> 
 </td>
</tr>

<tr>
<td>COURSE</td>
<td>
     <form:select path="course">
      <form:options items="${c}"/>
     </form:select>
</td>
</tr>

<tr>
<td>TIMING</td>
<td> <form:checkboxes items="${t}" path="timing"/> </td>
</tr>

<tr>
<td> <input type="submit" value="ok"> </td>
</tr>
</table>
</form:form>
</body>
</html>