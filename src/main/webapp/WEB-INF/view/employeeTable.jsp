<jsp:include page="header.jsp" />


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/resource/employeeTable.css">

</head>

<body>


    <br><br><br><br><br><br>
    <form method="get" action="/employeeTable">
        <table border="2" class="tbl" >
            <thead>
                <tr>


                    <td class="coumn">employeeId</td>
                    <td class="coumn">username</td>
                    <td class="coumn">createdDate</td>
                      

                    <%

String role1=(String)session.getAttribute("role");


if(role1.equalsIgnoreCase("HR"))
{
    %>


                      <td class="coumn">password</td>
                      <td class="coumn">salary</td>    
                      <td class="coumn">question </td> 
                      <td class="coumn">answer</td>

                


                      <%
                    }
                    
                    %>
    
    



                    <td class="coumn">gender</td>
                    <td class="coumn">email</td>
                    <td class="coumn">role </td>
                    <td class="coumn">phone </td>
                    <td class="coumn">department</td>
                    <td class="coumn">status</td>
                    <td class="coumn">action</td>
                

                </tr>
            </thead>

            <tbody>
                <c:forEach items="${employees}" var="emp">

                <tr>
                    <td ><c:out value="${emp.employeeId}"></c:out></td>
                    <td ><c:out value="${emp.username}"></c:out></td>
                    <td ><c:out value="${emp.createdDate}"></c:out></td>     
                    
                    
                    <%

                    String role2=(String)session.getAttribute("role");
                    
                    
                    if(role2.equalsIgnoreCase("HR"))
                    {
                        %>
                      
                    <td ><c:out value="${emp.password}"></c:out></td>
                    <td ><c:out value="${emp.salary}"></c:out></td>
                    <td ><c:out value="${emp.question}"></c:out></td>
                    <td ><c:out value="${emp.answer}"></c:out></td>


                    <%
                }
                
                %>


                    


                    <td ><c:out value="${emp.gender}"></c:out></td>
                    <td ><c:out value="${emp.email}"></c:out></td>
                    <td ><c:out value="${emp.role}"></c:out></td>
                    <td ><c:out value="${emp.phone}"></c:out></td>
                    <td ><c:out value="${emp.department}"></c:out></td>
                    <td ><c:out value="${emp.status}"></c:out></td>




                    <td>
                    <button type="button"> <a href="/getEmployeeUsingId?eid=${emp.employeeId}&msg=null">EDIT</a> </button>
                     <button type="button"> <a href="/deleteEmployeeById?eid=${emp.employeeId}" onclick="return confirm('Are You sure you want to delete this record permenently');">DELETE</a> </button> </td>            
                    </tr>                            
            </c:forEach>
            </tbody>

        </table>
    </form>
    <br><br><br><br><br><br><br>    <br><br><br><br><br><br><br>    <br><br><br><br><br><br><br>
    <br><br><br><br><br><br><br>



</body>

<script>
    
</script>

</html>    <jsp:include page="footer.jsp" />
