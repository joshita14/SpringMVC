<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First MVC Application</title>
</head>
<body>
   <h1>Spring MVC Http Method Example</h1>
   <h2>${obj1}</h2>
   <form action="/SpringMVC/studentdetails3.html" method="post">
      <p>
           Student Name : <input type ="text" name="studentname"/>
           
      </p>
      <p>
           Student Hobby : <input type ="text" name="studentvalue"/>
           
      </p>
      
       <p>
           Student Mobile No : <input type ="text" name="studentMobileNo"/>
           
      </p>
      
       <p>
           Date : <input type ="text" name="date"/>
           
      </p>
      
       <p>
           Student Skills : <select name="studentSkills" multiple>
                            <option value ="JAVA Skills">Java Skills</option>
                            <option value ="C Skills">C Skills</option>
                            <option value ="C++ Skills">C++ Skills</option>
                            </select>
           
      </p>
      <input type="submit" value="Click here"/>
   </form>   
</body>
</html>