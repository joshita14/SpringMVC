<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC Application</title>
</head>
<body>
   <h1>Wooh the http request is fullfilled	</h1>
   <h2>${obj1}</h2>  
   <table>
	   <tr>
	       <td>Student Name : </td>
		   <td>
		      ${obj1.studentname}
		   </td>
		   
		   <td>Student Hobby : </td>
		   <td>
		      ${obj1.studentvalue}
		   </td>
		   
		   <td>Date : </td>
		   <td>
		      ${obj1.date}
		   </td>
		   
		   <td>Student Mobile No : </td>
		   <td>
		      ${obj1.studentMobileNo}
		   </td>
		   
		   <td>Student Skills : </td>
		   <td>
		      ${obj1.studentSkills}
		   </td>
	   </tr>
   </table>
</body>
</html>