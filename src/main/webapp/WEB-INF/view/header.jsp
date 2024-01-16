<!DOCTYPE html>
<html lang="en">
    <meta name="viewport" content="width=device-width, initial-scale=1">


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Document</title>
    <link rel="stylesheet" href="/resource/header.css">
    

</head>

<body>
    <!-- navbar -->
    <div class="navbar" style="position: fixed;">
        <img src="/resource/logo (1).png" alt="Logo" class="navbar-logo" >
        <a href="/getHomePage">Home</a>

<%

String role=(String)session.getAttribute("role");


if(role.equalsIgnoreCase("HR"))
{
    %>

        <a href="/addEmployee">Add Employees</a>
  <%
}

%>
        <a href="/employeeTable">List of Employees</a>
        <!-- <a href="/profilePage">Profile- (${username})</a> -->
        <a href="/getEmployeeUsingId?eid=<%=session.getAttribute("employeeId")%>&msg=null">Profile-(<%=session.getAttribute("username")%>)</a>
        <a href="/logout?eid=<%=session.getAttribute("eid")%>">Logout</a>

    </div>

</body>

</html>