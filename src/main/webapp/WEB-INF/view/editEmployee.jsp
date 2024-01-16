<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="/resource/editEmployee.css">
    <title>UPDATE DETAILS</title>
    

</head>

<body>
    <jsp:include page="header.jsp" />
    <br><br>
    <br>
    <br>
    <br>
    <br>
    <br>


    <div class="heading">
        <h1 style="color: beige;">PROFILE</h1>
    </div>
    <br>
   
    <br>
    <br>
   
    <form method="post" action="/update_Employee">

        <div class="mainbox" >
            <div class="allcolumns">
                <div class="Column"> <!--  first col -->
                    <div class="form-group">

                        <label for="username">Employee ID:</label>
                        <br>
                        <input type="text" id="employeeId" name="employeeId" value="${employee.employeeId}"   > 
      
                        <br>
                        <br>

                        <label for="username">User Name:</label>
                        <br>
                        <input type="text" id="username" name="username" value="${employee.username}" required>
                  <br>


                  
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="YourEmail">Your Email:</label>
                        <br>
                        <input type="text" id="email" name="email" value="${employee.email}"  required>
                    </div>
                    <div class="form-group">
                        <br>

                        <label for="password">Password:</label>
                        <br>
                        <input type="text" id="password" name="password" value="${employee.password}"  required>
                   <br>
                   <br>
                   <label for="createdDate">Created Date:</label>
                   <br>
                   <input type="text" id="createdDate" name="createdDate" value="${employee.createdDate}"  required>
                   
                    </div>
                    <div class="form-group">
                        <br>


                        
                        <br>
                        <br>

                    </div>
                    <div class="form-group">
                        <label for="department">Select Department:</label>
                        <br>
                        <select id="colors" name="department" style="width: 260px; height:21px ; ">
                            <option value="${employee.department}" >Team Leadr</option>
                            <option value="${employee.department}" >Manager</option>
                            <option value="${employee.department}" >Marketing</option>
                            <option value="${employee.department}" >Software Developer</option>
                        </select>
                        <br>
                        <br>
                    </div>

                </div>
                <div class="Column"> <!--  second col -->
                    <div class="form-group">
                        <br>

                        <label for="salary">Your Salary:</label><br>
                        <input type="text" id="username" name="salary" value="${employee.salary}" required>

                        
                    </div>
                    <br>

                    <div class="form-group">
                        <label for="gender"><span style="color: red;">*</span> Select Your Gender:</label><br>

                        <br>
                        <label class="gender" type="text">male&nbsp;&nbsp;


                            <input type="radio" name="gender" value="male"  >


                            <label class="gender" type="text">female
                                <input type="radio" name="gender" value="female" required>

                                <label class="gender" type="text">other
                                    <input type="radio" name="gender" value="other">

                                </label>

                    </div>
                    <br>

                    <div class="form-group">
                        <label for="question">Please Select User Security Question:</label>
                        <select id="colors" name="question" style="width: 260px; height:21px ;"  >
                            <option value="${employee.question}">${employee.question}</option>
                            <option value="favorite food">favorite food</option>
                            <option value="favorite place" >favorite place</option>
                            <option value="favorite dish" >favorite dish</option>

                        </select>
                    </div>

                    <div class="form-group">
                        <br>
                        <label for="role">Please Select User Roll:</label>
                        <br>
                        <select id="role" name="role"  style="width: 260px; height:21px ;">
                            <option value="${employee.role}">${employee.role}</option>
                            <option value="HR">HR</option>
                            <option value="Testing">Testing</option>
                            <option value="Manager">Manager</option>
                        </select>
                    </div>
                    <br>

                    <div>
                        <label for="Enter_Your_Answer">Enter Your Answer:</label>
                        <input type="text" id="answer" name="answer" value="${employee.answer}"  required>

                        <!-- <p style="color: red;">${msg}</p> -->


                        <button class="updateButton" id="updateButton">Update</button>

                    </div>



                </div>

            </div>
        </div>
    </form>


    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <jsp:include page="footer.jsp" />

</body>

<% 
String msg=(String)request.getAttribute("msg");

    if(msg!=null){
        %>
        <script>
        alert("${msg}");
    </script>
        <%
        }
        %>


</html>
