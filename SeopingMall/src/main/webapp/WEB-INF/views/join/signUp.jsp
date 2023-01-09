<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="/WEB-INF/views/head.jsp" />
</head>

<script>
var msg = "<c:out value = '${msg}'/>";
if(msg){
	alert(msg);
	
}
function signUpReg(){
	var form = document.frm;
	var id = document.getElementById("usrId").value;
	var passwrd1 = document.getElementById("usrPassword1").value;
	var passwrd2 = document.getElementById("usrPassword2").value;
	
	if(!id || !passwrd1 || !passwrd2){
		alert("정보를 모두 입력해주세요.");
		return false;
	}
	
	if(passwrd1 != passwrd2){
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}
	
	console.log(passwrd1);
	form.action = "/signUpReg";
	form.submit();
}
</script>

<body>
<div class="maindiv">
<div class="bigsubdiv">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" class="img-fluid"
          alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form name="frm" method="post">
          <!-- ID input -->
          <div class="form-outline mb-4">
            <input type="email" name = "usrId" id="usrId" class="form-control form-control-lg" placeholder="Enter a valid ID" />
            <label class="form-label" for="form3Example3">ID</label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-3">
            <input value='${JoinVo.usrPassword1}' type="password" name = "usrPassword1" id="usrPassword1" class="form-control form-control-lg" placeholder="Enter password" />
            <label class="form-label" for="form3Example4">first Password</label>
          </div>
          <!-- Password check input -->
          <div class="form-outline mb-3">
            <input value='${JoinVo.usrPassword2}' type="password" name = "usrPassword2" id="usrPassword2" class="form-control form-control-lg" placeholder="Enter password" />
            <label class="form-label" for="form3Example4">second Password</label>
          </div>


          <div class="text-center text-lg-start mt-4 pt-2">
            <button onclick="signUpReg()" type="button" class="btn btn-primary btn-lg" style="padding-left: 2.5rem; padding-right: 2.5rem;">Sign Up</button>
          </div>

        </form>
      </div>
    </div>
  </div>
  </div>
  </div>
</body>
<c:import url="/WEB-INF/views/footer.jsp" />
</html>