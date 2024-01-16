<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="/resource/addEmployeeCss.css">
    <title>Registration Form</title>



   
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
        <h1 style="color: beige;">ADD EMPLOYEE</h1>
    </div>
    <br>
    <marquee class="marq" behavior="scroll" direction="left">
        <h3>You are 30 seconds away from earning your own mony!</h3>
    </marquee>
    <form method="post" action="/addEmployee">

        <div class="mainbox" method="post" action="/addEmployee">
            <div class="allcolumns">
                <div class="Column"> <!--  first col -->
                    <div class="form-group">
                        <br>

                        <label for="username">User Name:</label>
                        <br>
                        <input type="text" id="username" name="username" required>
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="YourEmail">Your Email:</label>
                        <br>
                        <input type="text" id="username" name="email" required>
                    </div>
                    <div class="form-group">
                        <br>

                        <label for="password">Password:</label>
                        <br>
                        <input type="text" id="username" name="password" required>
                        <br>

                        <label for="createdate">Created Date:</label>
                        <br>
                        <input type="text" id="createDate" name="createDate" required>
                    </div>
                    <div class="form-group">
                        <br>

                        <label for="phone">Phone No:</label>
                        <br>
                        <input type="text" id="username" name="phone" required>
                        <br>
                        <br>

                    </div>
                    <div class="form-group">
                        <label for="department">Select Department:</label>
                        <br>
                        <select id="colors" name="department" style="width: 260px; height:21px ; border-radius: 20px;">
                            <option value="Manager">Manager</option>
                            <option value="Team Leadr">HR</option>
                            <option value="Software Developer">Development</option>
                            <option value="Database Engineer">Database Engineer</option>
                        </select>
                        <br>
                        <br>
                    </div>

                </div>
                <div class="Column"> <!--  second col -->
                    <div class="form-group">
                        <br>

                        <label for="salary">Your Salary:</label><br>
                        <input type="text" id="username" name="salary" required>
                    </div>
                    <br>

                    <div class="form-group">
                        <label for="gender">Select Your Gender:</label><br>

                        <br>
                        <label class="gender" type="text">male&nbsp;&nbsp;


                            <input type="radio" name="gender" value="male">


                            <label class="gender" type="text">female
                                <input type="radio" name="gender" value="female">

                                <label class="gender" type="text">other
                                    <input type="radio" name="gender" value="female">

                                </label>

                    </div>
                    <br>

                    <div class="form-group">
                        <label for="question">Please Select User Security Quetion:</label>
                        <select id="colors" name="question" style="width: 260px; height:21px ; border-radius: 20px;">
                            <option value="favorite food">favorite food</option>
                            <option value="favorite place">favorite place</option>
                            <option value="favorite dish">favorite dish</option>

                        </select>
                    </div>

                    <div class="form-group">
                        <br>
                        <label for="role">Please Select User Roll:</label>
                        <br>
                        <select id="role" name="role" style="width: 260px; height:21px ; border-radius: 20px;">
                            <option value="Manager">Manager</option>
                            <option value="HR">HR</option>
                            <option value="Software Developer">Software Developer</option>
                        </select>
                    </div>
                    <br>

                    <div>
                        <label for="Enter_Your_Answer">Enter Your Answer:</label>
                        <input type="text" id="username" name="answer" required>

                        <p style="color: red;">${Msg}</p>

                        <button class="loginbutton">Save</button>

                    </div>



                </div>

            </div>
        </div>
    </form>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <jsp:include page="footer.jsp" />

</body>

</html>