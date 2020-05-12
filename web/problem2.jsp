<%-- 
    Document   : problem2
    Created on : Mar 25, 2020, 7:54:57 PM
    Author     : Parash Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Problem 2</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
    </head>
    <body>
        

        <p>2.) Write a Servlet with doGet method and extract all the request information along with the
inputs given by the user in text field, radio button, checkbox and drop down menu.</p>
<div class="container">
<br>  <p class="text-center">More bootstrap 4 components on</p>
<hr>


<div class="row justify-content-center">
<div class="col-md-6">
<div class="card">
<header class="card-header">
	<a href="" class="float-right btn btn-outline-primary mt-1">Log in</a>
	<h4 class="card-title mt-2">Sign up</h4>
</header>
<article class="card-body">
    <form action="pb2" method="GET"> 
	<div class="form-row">
		<div class="col form-group">
			<label>First name </label>   
		  	<input type="text" name="fname" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
		<div class="col form-group">
			<label>Last name</label>
		  	<input type="text" name="lname" class="form-control" placeholder=" ">
		</div> <!-- form-group end.// -->
	</div> <!-- form-row end.// -->
	
	<div class="form-group">
			<label class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="gender" value="Male">
		  <span class="form-check-label"> Male </span>
		</label>
		<label class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="gender" value="Female">
		  <span class="form-check-label"> Female</span>
		</label>
	</div> <!-- form-group end.// -->
	<div class="form-row">
		
		<div class="form-group col-md-6">
		  <label>Course</label>
		  <select id="inputState" name="course" class="form-control">
		      <option value="BSc. CSIT">BSc. CSIT</option>
                      <option value="BSW">BSW</option>
		      <option value="BBS">BBS</option>
		      <option value="BBA">BBA</option>
		      <option value="BCA">BCA</option>
		  </select>
		</div> <!-- form-group end.// -->
	</div> <!-- form-row.// -->
        <div class="form-group">
		<label>Roll No</label>
	    <input class="form-control" type="number" name="rollno">
	</div>
        <div class="form-group">
		<label>Year of Admission</label>
	    <input class="form-control" type="number" name="yearofad">
	</div>
        <div class="form-group">
		<label>Address</label>
	    <input class="form-control" type="text" name="address">
	</div>
        <div class="form-group">
		<label>Email</label>
	    <input class="form-control" type="text" name="email">
	</div>
        <div class="form-group">
		<label>Username</label>
	    <input class="form-control" type="text" name="username">
	</div>
	<div class="form-group">
		<label>Create password</label>
	    <input class="form-control" type="password" name="password">
	</div> <!-- form-group end.// -->  
    <div class="form-group">
        <input type="submit" class="btn btn-primary btn-block" value="Register">
    </div> <!-- form-group// -->      
    </form>
</article> <!-- card-body end .// -->
</div> <!-- card.// -->
</div> <!-- col.//-->

</div> <!-- row.//-->


</div> 
<!--container end.//-->

<br><br>
        
    </body>
</html>
