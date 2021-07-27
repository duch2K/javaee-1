<%@ page import="com.javaee.summer.Footballer" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Players</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h2 class="mb-2 mt-3"><%= "YO!" %></h2>
        <a href="/add-player.jsp" class="btn btn-primary mb-3">Add player</a>
        <%
            ArrayList<Footballer> footballers = (ArrayList<Footballer>) request.getAttribute("footballers");
            for (Footballer f : footballers) {
        %>
        <div class="card m-2" style="width: 18rem; font-size: 14px;">
            <div class="card-body">
                <h5 class="card-title">
                    <%= f.getName() + " " + f.getSurname() %>
                </h5>

                <div>
                    <b>Club:</b> <%= f.getClub() %>
                </div>
                <div>
                    <b>Annual salary:</b> <%= f.getSalary() %> EUR
                </div>
                <div>
                    <b>Transfer price:</b> <%= f.getTransferPrice() %> EUR
                </div>
                <a href="#" class="card-link">details</a>
            </div>
        </div>
        <% } %>
    </div>

</body>
</html>
