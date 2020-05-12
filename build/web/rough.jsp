<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@page import ="Project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
    
<%
	if (request.getParameter("submit")!=null)
	{
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String fee = request.getParameter("fee");
		try
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement st= con.prepareStatement("insert into student(stname,course,fee)values(?,?,?)");
			st.setString(1,name);
			st.setString(2,course);
			st.setString(3,fee);
                        int rowcoutn = st.executeUpdate();
                        System.out.println("no of row inserted: "+rowcoutn);
			response.sendRedirect("register.jsp");
		}
		catch(Exception e){
			out.println(e);
		}
%>
<script>
	alert("Record Added");
</script>		
	
<% 		
	}	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Student</title>
</head>
<body>
	<div class ="panel-body">
		<table id ="tbl-student" class="table table-responsive table bordered" cellpadding="0" width="70%">
		<thead>
			<tr>
                            <th>SID</th>
                            <th>Student Name</th>
                            <th>Course</th>
                            <th>Fee</th>
                            <th>Edit</th>
                            <th>Delete</th>
			</tr>
			
		<%
		Connection con=ConnectionProvider.getCon();
		String query= "select *from student";
		Statement st= con.createStatement();
		
		ResultSet rs= st.executeQuery(query);
		while(rs.next())
		{
			//String id= rs.getString("id");
		%>	
			<tr>
                                <td><%=rs.getInt("id")%></td>
				<td><%=rs.getString("stname") %></td>
				<td><%=rs.getString("course") %></td>
				<td><%=rs.getString("fee") %></td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			
			<%
				}
			%>
		</table>
	</div>
</body>
</html>