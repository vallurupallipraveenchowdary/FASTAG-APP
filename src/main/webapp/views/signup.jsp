<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	body{
		color: #fff;
		background: #3598dc;
		font-family: 'Roboto', sans-serif;
	}
    .form-control{
		height: 41px;
		background: #f2f2f2;
		box-shadow: none !important;
		border: none;
	}
	.form-control:focus{
		background: #e2e2e2;
	}
    .form-control, .btn{        
        border-radius: 3px;
    }
	.signup-form{
		width: 390px;
		margin: 30px auto;
	}
	.signup-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 15px;
        background: #fff;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	.signup-form h2 {
		color: #333;
		font-weight: bold;
        margin-top: 0;
    }
    .signup-form hr {
        margin: 0 -30px 20px;
    }    
	.signup-form .form-group{
		margin-bottom: 20px;
	}
	.signup-form input[type="checkbox"]{
		margin-top: 3px;
	}
	.signup-form .row div:first-child{
		padding-right: 10px;
	}
	.signup-form .row div:last-child{
		padding-left: 10px;
	}
    .signup-form .btn{        
        font-size: 16px;
        font-weight: bold;
		background: #3598dc;
		border: none;
		min-width: 140px;
    }
	.signup-form .btn:hover, .signup-form .btn:focus{
		background: #2389cd !important;
        outline: none;
	}
    .signup-form a{
		color: #fff;
		text-decoration: underline;
	}
	.signup-form a:hover{
		text-decoration: none;
	}
	.signup-form form a{
		color: #3598dc;
		text-decoration: none;
	}	
	.signup-form form a:hover{
		text-decoration: underline;
	}
    .signup-form .hint-text {
		padding-bottom: 15px;
		text-align: center;
    }
    
    
    
    
</style>
</head>
<body>

<div class="signup-form">
    <form:form action="saveUserDetails" method="POST" modelAttribute="userObj" >
		<h2>Sign Up</h2>
		<p>Please fill in this form to create an account!</p>
		<hr>
        <div class="form-group">
			<div class="row">
				<div class="col-xs-6"><form:input type="text" path="userFName" class="form-control" name="first_name" placeholder="First Name" required="required"/></div>
				<div class="col-xs-6"><form:input type="text" path="userLName" class="form-control" name="last_name" placeholder="Last Name" required="required"/></div>
			</div>        	
        </div>
        <div class="form-group">
        	<form:input type="email" path="userEmail" class="form-control" name="email" placeholder="Email" required="required"/>
        </div>
		<div class="form-group">
            <form:input type="text" path="userPhoneNo"  class="form-control" name="phno" placeholder="PhNo" required="required"/>
        </div>
        <div class="form-group">
            <form:input type="text" path="userDob"  class="form-control" name="dateofbirth" placeholder="Date Of Birth" required="required"/>
        </div>
       <%--  <div class="form-group">
            <form:input type="date" path="userDob"  class="form-control" name="dateofbirth" placeholder="Date of Birth" required="required"/>
        </div> --%> 
        <%-- <div class="form-group">
        <label class="col-xs-6" for="dateofbirth">Date Of Birth</label>
<form:input type="date" path="userDob" name="dateofbirth" id="dateofbirth"/>
        </div> --%>
		<div class="form-check-inline col-xs-6">
		<label>Gender</label>
		<div style="float:right;">
      <label class="form-check-label " for="radio1">
        <form:radiobutton  path="userGender" class="form-check-input" id="radio1" name="optradio" value="male"/>Male
        <form:radiobutton path="userGender" class="form-check-input" id="radio2" name="optradio" value="female"/>Female
      </label>
      </div>
    </div>
          
        <div class="form-group">
			<label class="checkbox-inline"><input type="checkbox" required="required"/> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
		</div>
		<div class="form-group">
            <button type="submit" value="Sign Up" class="btn btn-primary btn-lg">Sign Up</button>
        </div>
    </form:form>
	<div class="hint-text">Already have an account? <a href="index">Login here</a></div>
</div>



</body>
</html>