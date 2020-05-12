<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>JSP Page</title>
        <link href="WebContent/WEB-INF/lib/bootstrap-4.4.1-dist/css/bootstrap.css"rel="stylesheet" type="text/css"/>
        <link href="WebContent/WEB-INF/lib/bootstrap-4.4.1-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>Employee Register Form:</h1>
            <div class="card">
                <div class="card-body">
                    <form action="register.jsp" method="post">

                        <div class="form-group row">
                            <label for="firstName" class="col-sm-2 col-form-label">Student
                                Name</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" name="name" placeholder="Enter student name" id="sname" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputcourse" class="col-sm-2 col-form-label" >Course</label>

                            <div class="col-sm-7">
                                <input type="text" class="form-control" placeholder="Course" name="course" id="course" required>
                            </div>

                            <div class="form-group">
                                <label for="inputfee" class="col-sm-2 col-form-label">Fee</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" placeholder="Fee" name="fee" id="fee" required>
                                </div>
                                </br>
                                <div align="left">
                                    <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                                    <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
                                </div>
                                </form>


                                </body>
                                </html>