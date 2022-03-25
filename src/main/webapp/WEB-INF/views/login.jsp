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
</head>
<body>
    <section class="login-form">
        <div class="logo">
            <i class="far fa-moon"></i>
            <a href="index">MiniMini</a>
        </div>
        <div class="login-head">
            <div class="login-body">
                <h1 style="color:#166cea;">Mini Mini</h1>
                <form action="login.do" method="post">
                    <div class="int-area">
                        <input type="text" name="id" id="id" autocomplete="off" required>
                        <label for="id">USER NAME</label>
                    </div>
                    <div class="int-area">
                        <input type="password" name="password" id="password" autocomplete="off" required>
                        <label for="password">PASSWORD</label>
                    </div>
                    <div class="btn-area">
                        <button type="submit" >로그인</button>
                    </div>
                    <DIV class="btn-area">
                        <button type="button" onclick="location.href='register' ">회원가입</button>
                    </DIV>
                </form>
            </div>  
        </div>  
    
        

    </section>
</body>
</html>