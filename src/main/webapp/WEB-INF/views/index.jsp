<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
            crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/jquery.fullPage.css">
    <script src="js/jquery.fullPage.js"></script>
    <script src="js/index.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <script src="https://kit.fontawesome.com/7ffcd0d484.js" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Dongle:wght@700&family=Noto+Sans+KR&display=swap" rel="stylesheet">
    
</head>
<body>
    <main id="fullpage">
        <section class="section section1">
            <div class="wrap1">
                <div class="nav">
                    <div class="logo">
                        <i class="far fa-moon"></i>
                        <a href="index">MiniMini</a>
                    </div>
                    <ul class="nav_middle">
                        <li><a href="#">포트폴리오</a></li>
                        <li><a href="#">맞춤개발</a></li>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">내 홈페이지 관리</a></li>
                    </ul>
                    <div class="nav_right">
                        <c:choose>
                 		<c:when test="${empty id }">
                        <a class="btn" href="login">로그인</a>
                        </c:when>
                        <c:otherwise>
                        <a class="btn" href="logout">로그아웃</a>
                        </c:otherwise>
                   
                  </c:choose>
                    </div>
                </div>
                <div class="wrap1_middle">
                    <div class="textBox">
                        <span>YS Solution</span>
                    </div>
                    <p class="textBox2">
                        <span>Digital marketing No.1<br>
                            예지솔루션 반응형 홈페이지</span>
                    </p>
                </div>
            </div>
        </section>
        <section class="section section2">
            <div class="wrap2">
                <div class="nav2">
                    <div class="logo2">
                        <i class="fas fa-moon"></i>
                        <a href="index">MiniMini</a>
                    </div>
                    <ul class="nav_middle2">
                        <li><a href="#">포트폴리오</a></li>
                        <li><a href="#">맞춤개발</a></li>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">내 홈페이지 관리</a></li>
                    </ul>
                    <div class="nav_right2">
                  <c:choose>
                 		<c:when test="${empty id }">
                        <a class="btn" href="login">로그인</a>
                        </c:when>
                        <c:otherwise>
                        <a class="btn" href="logout">로그아웃</a>
                        </c:otherwise>
                   
                  </c:choose>
                   </div>
                </div>
                <div class="wrap2_contact">
                    <div class="wrap2_contact_1">
                        <h1 style:>PORTFOLIO</h1>
                    </div>
                    <div class="wrap2_contact_2">
                        <p>Categoires</p>
                    
                    
                        <div class="menu" id="menu_1">홈페이지</div>
                        <div class="menu" id="menu_2">쇼핑몰</div>
                        <div class="menu" id="menu_3">디자인</div>
                        <div class="menu" id="menu_4">웹프로그램</div>
                    
                    	<jsp:include page="picture.jsp"/>
             
                       
                    </div>
                </div>
            </div>
        </section>
        <section class="section section3">
            <div class="wrap3">
                <div class="wrap3_left">
                    <div class="logo3">
                            <i class="far fa-moon"></i>
                            <a href="index">MiniMini</a>
                    </div>
                    <div class="wrap3_left_middle">
                        <div class="textbox">
                            <span>Request</span>
                            </div>
                            <div class="textbox2">
                            <span>당신의 성공을 기원합니다.</span>
                            </div>
                            <div class="phone">
                            <p>010-2725-6166</p>
                            </div>
                            <div class="email">
                            <p>multi@campus.com</p>
                        </div>
                    </div>
                </div>
                <div class="wrap3_right">
                    <div class="wrap3_information">
                        <form id="query" method="post">
                            <div class="information">
                                <input type="text" name="name" id="name" autocomplete="off" required>
                                <label for="name">이름</label>
                            </div>
                             <div class="information">
                                <input type="text" name="phone" id="phone" autocomplete="off" required>
                                <label for="phone">연락처</label>
                            </div>
                            <div class="information">
                                <input type="text" name="email" id="email" autocomplete="off" required>
                                <label for="email">이메일</label>
                            </div>
                            <div class="information">
                                <input type="text" name="request" id="request" autocomplete="off" required>
                                <label for="request">요청사항</label>
                            </div>
                            <div class="information_btn">
                                <button type="submit">문의하기</button>
                            </div> 
                        </form>
                    </div>    
                </div>
            </div>
           
        </section>
     	<script>
     	$(function() {
     		$('#query').on('submit', function (e){
     			e.preventDefault();
     			let name =$('#name').val();
         		let phone =$('#phone').val();
         		let email =$('#email').val();
         		let request =$('#request').val();
         		
         		$.ajax({
    				type : "post",
    				dataType : "text", 
    				async : true,
    				url : "http://localhost:8090/request",
    				data : {
    					name : name,
    					phone : phone,
    					email : email,
    					request : request
    				},
    				success : function(data, textStatus) {
    					alert(data);
    					location.href="http://localhost:8090/index";
    				},
    				error : function(data, textStatus) {
    					alert(data.responseText);
    					location.href="http://localhost:8090/login";
    				},
    				
    			});
     		});
     		
     	});
     	</script>

        
   
    </main>
</body>
</html>