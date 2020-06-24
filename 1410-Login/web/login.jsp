<%-- Document : login Created on : Jun 4, 2020, 3:19:36 PM Author : TASS --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="images/icons/favicon.ico" />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="vendor/bootstrap/css/bootstrap.min.css"
            />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="fonts/font-awesome-4.7.0/css/font-awesome.min.css"
            />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="fonts/iconic/css/material-design-iconic-font.min.css"
            />
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css" />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="vendor/css-hamburgers/hamburgers.min.css"
            />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="vendor/animsition/css/animsition.min.css"
            />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="vendor/select2/select2.min.css"
            />
        <!--===============================================================================================-->
        <link
            rel="stylesheet"
            type="text/css"
            href="vendor/daterangepicker/daterangepicker.css"
            />
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css" />
        <link rel="stylesheet" type="text/css" href="css/main.css" />
        <!--===============================================================================================-->
        <style>
            /*message error*/
            .alert {
                padding: 20px;
                background-color: green;
                color: white;
            }

            .closebtn {
                margin-left: 15px;
                color: white;
                font-weight: bold;
                float: right;
                font-size: 22px;
                line-height: 20px;
                cursor: pointer;
                transition: 0.3s;
            }

            .closebtn:hover {
                color: black;
            }
        </style>
    </head>
    <body>
    <c:if test="${message != null} == true">
        ${message != null}
        <div class="alert">
            <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 
            <strong>${message}</strong>
        </div>  
    </c:if>  
    <!--======== Cookie =========== -->
    <%
        Cookie[] listCookie = request.getCookies();
        String username = "";
        String password = "";
        String remember = "";

        int i = 0;
        if (listCookie != null) {
            while (i < listCookie.length) {
    %>
    <%= listCookie[i].getName()%>
    <%
                if (listCookie[i].getName().equals("username")) {
                    username = listCookie[i].getValue();
                }
                if (listCookie[i].getName().equals("pass")) {
                    password = listCookie[i].getValue();
                }
                if (listCookie[i].getName().equals("remember")) {
                    remember = listCookie[i].getValue();
                }
                i++;
            }
        }

    %>


    <!--======== Cookie =========== -->



    <div class="limiter">
        <div
            class="container-login100"
            style="background-image: url('images/bg-01.jpg');"
            >
            <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                <form
                    class="login100-form validate-form"
                    action="${pageContext.request.contextPath}/login"
                    method="post"
                    >
                    <span class="login100-form-title p-b-49">
                        Login
                    </span>

                    <div
                        class="wrap-input100 validate-input m-b-23"
                        data-validate="Username is reauired"
                        >
                        <span class="label-input100">Username</span>
                        <input
                            class="input100"
                            type="text"
                            name="username"
                            placeholder="Type your username"
                            value="<%= username%>"
                            />
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>

                    <div
                        class="wrap-input100 validate-input"
                        data-validate="Password is required"
                        >
                        <span class="label-input100">Password</span>
                        <input
                            class="input100"
                            type="password"
                            name="pass"
                            placeholder="Type your password"
                            value="<%= password%>"
                            />
                        <span class="focus-input100" data-symbol="&#xf190;"></span>
                    </div>

                    <div class="text-left p-t-8 p-b-31">
                        <input type="checkbox" name="remember" value="ON" <%= "ON".equals(remember) ? "checked='checked'" : ""%>/> remember me<br/>
                    </div>

                    <div class="text-right p-t-8 p-b-31">
                        <a href="#">
                            Forgot password?
                        </a>
                    </div>

                    <div class="container-login100-form-btn">
                        <div class="wrap-login100-form-btn">
                            <div class="login100-form-bgbtn"></div>
                            <button class="login100-form-btn">
                                Login
                            </button>
                        </div>
                    </div>

                    <div class="txt1 text-center p-t-54 p-b-20">
                        <span>
                            Or Sign Up Using
                        </span>
                    </div>

                    <div class="flex-c-m">
                        <a href="#" class="login100-social-item bg1">
                            <i class="fa fa-facebook"></i>
                        </a>

                        <a href="#" class="login100-social-item bg2">
                            <i class="fa fa-twitter"></i>
                        </a>

                        <a href="#" class="login100-social-item bg3">
                            <i class="fa fa-google"></i>
                        </a>
                    </div>

                    <div class="flex-col-c p-t-155">
                        <span class="txt1 p-b-17">
                            Or Sign Up Using
                        </span>

                        <a href="#" class="txt2">
                            Sign Up
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div id="dropDownSelect1"></div>

    <!--===============================================================================================-->
    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/animsition/js/animsition.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/select2/select2.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/daterangepicker/moment.min.js"></script>
    <script src="vendor/daterangepicker/daterangepicker.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/countdowntime/countdowntime.js"></script>
    <!--===============================================================================================-->
    <script src="js/main.js"></script>
</body>
</html>
