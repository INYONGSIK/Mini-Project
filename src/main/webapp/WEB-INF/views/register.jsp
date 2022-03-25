<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/login.css">
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="https://kit.fontawesome.com/7ffcd0d484.js" crossorigin="anonymous"></script>
    <!-- <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet"> -->
    <script
  src="https://code.jquery.com/jquery-3.6.0.slim.js"
  integrity="sha256-HwWONEZrpuoh951cQD1ov2HUK5zA5DwJ1DNUXaM6FsY="
  crossorigin="anonymous"></script>
    
    <!-- <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">
 -->
<body>
    <section class="login-form">
     	<div class="logo">
            <i class="far fa-moon"></i>
            <a href="index">MiniMini</a>
        </div>
        <div class="login-head">
            <div class="login-body">
		        <h1 style="color:#166cea;">Mini Mini</h1>
		        <form action="register.do" method="post" onsubmit="return isValidForm()">
		            <div class="int-area">
		                <input type="text" name="id" id="id" required>
		                <label for="id">아이디 </label>
		            </div>
		            <div class="int-area">
		                <input type="password" name="password" id="password" required>
		                <label for="password">패스워드</label>
		            </div>
		            <div class="int-area">
		                <input type="password" name="password2" id="password2" required>
		                <label for="password2">패스워드확인</label>
		            </div>
		            <div class="btn-area">
		                <button type="submit">회원가입</button>
		            </div>
            
       			 </form>
       		</div>  
        </div> 
        <script>
            function check_pw() {  //비밀번호 확인
    let p = document.getElementById('password').value;
    let p2 = document.getElementById('password2').value;

    if (p !== p2) {
        alert("비밀번호가 다릅니다.");
        return false;
    }
    if (p === p2) {
        return true;
    }
}

function isValidForm() {
    if (check_pw()) {
        return true;
    } else {
        return false
    }
}
        </script>    

    </section>


</body>
</html>