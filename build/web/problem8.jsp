<%-- 
    Document   : problem8
    Created on : Mar 26, 2020, 1:42:03 PM
    Author     : Parash Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.assig.DbConnection"%>

<%

ResultSet resultSet = null;
ResultSet resultSet1 = null;
Statement st = DbConnection.statementObject();
Statement st1 = DbConnection.statementObject();
%>

<%
try{ 

    String sql ="SELECT authors.author_name from authors LEFT JOIN book_author_rel ON book_author_rel.author_id = authors.author_id WHERE book_author_rel.bookid = 1";

    resultSet = st.executeQuery(sql);
    while(resultSet.next()){
        
    }

} catch (Exception e) {
    e.printStackTrace();
}
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Problem 8</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
  <h2>Computer Science Book Store</h2>
  <p>Click to check out</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Book ID</th>
        <th>Book Title</th>
        <th>Book Authors</th>
        <th>Book Publication</th>
        <th>Published Year</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
        <%
            int bookid=0;
            try{ 

                String sql ="SELECT * from book_info";

                resultSet = st.executeQuery(sql);
                while(resultSet.next()){ bookid = resultSet.getInt("bookid"); %>
                        
                
                <tr>
                    <td><%= resultSet.getInt("bookid") %></td>
                    <td><%= resultSet.getString("book_title") %></td>
                    <td>
                    <%
                        try{ 

                            String sql1 ="SELECT authors.author_name from authors LEFT JOIN book_author_rel ON book_author_rel.author_id = authors.author_id WHERE book_author_rel.bookid ="+bookid;

                            resultSet1 = st1.executeQuery(sql1);
                            while(resultSet1.next()){
                                    %>
                                     <% 
                                    
                                        out.print(resultSet1.getString("author_name")); 
                                        out.print("<br>");
                                    %> 
                                    
                                    <%    }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>  
                    </td>
                    <td><%= resultSet.getString("publisher") %></td>
                    <td><%= resultSet.getString("publish_year") %></td>
                    <td><%= "NRP. "+resultSet.getString("price")+"/-" %></td>
                    <td><form method="POST" action="setSession">
                            <input type="hidden" name="booktitle" value="<%= resultSet.getString("book_title") %>">
                            <input type="hidden" name="bookprice" value="<%= resultSet.getInt("price") %>">
                            
                            <input type="submit" value="Add to Cart" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-shopping-cart"></span>
                        </form>
                    </td>
                </tr>
                
            <%    }

            } catch (Exception e) {
                e.printStackTrace();
            }
        %>  
      
    
    </tbody><h3><a href="buybook" ><span class="glyphicon glyphicon-shopping-cart"></span>Check Out</a></h3>
            <h3><a href="resetSession" ><span class="glyphicon glyphicon-shopping-cart"></span>Reset Cart</a></h3>
  </table>
</div>
    </body>
</html>
