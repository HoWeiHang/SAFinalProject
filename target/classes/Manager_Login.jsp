<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>ManagerLogin</title>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Manager_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/Normal_navbar.css">
</head>
<body>



<div class="wrap">
   

  <div class="container_top">
    <div class="container_top_mid">
      <div class="container_top_mid_block">
        <div class="container_top_mid_block_left">
          <p style="font-family: Microsoft JhengHei; padding-left:50px; margin-top:15px; font-size:23px; color:#9F5000 ">
            大學入學考試中心
          </p>  
        </div>  

        <div class="container_top_mid_block_right">
          <p style="padding-left:30%;">
            <a class="container_top_mid_block_right_link_setting" href="IndexView">
              首頁
            </a>
              &nbsp;|&nbsp;
            <a class="container_top_mid_block_right_link_setting" href="http://www.ceec.edu.tw/CeecMag/paper.html">
              訂閱選才電子報
            </a>
              &nbsp;|&nbsp;
            <a class="container_top_mid_block_right_link_setting" href="Manager_Login">
              管理者登入
            </a>
          </p>
        </div>
      </div>
      
      <!--top orange line-->
      <div class="container_top_mid_line">
      </div>
    </div>
  </div>
    




    <div class="main_content">
    	<div class="Login_content_block">
    		<div class="Login_content_block_top">
    			<p style="font-family: Microsoft JhengHei; font-size:23px;  color:#00AAFF;">
    				<span class="glyphicon glyphicon-user" aria-hidden="true"></span> 管理者登入
    			</p>
    		</div>

    		<div class="Login_content_block_down" align="center">

    		<form id="form1" name="form1" method="get" action="Go_to_Manager_Index" style="font-size:17px;">
                        
            帳號：<input type="text" name="managerAccount" id="textfield" class="LoginField"><p>
            密碼：<input type="password" name="managerPassword" id="textfield" class="LoginField"><p>
            <br>
            <input type="submit" name="submit" id="submit" class="greenbutton" value="登入">
            <label class="label label-warning">${message}</label>
        </form>
					
    		</div>
    	</div>
    </div>
    
    
</div>
<%@include  file="SystemFooter.jspf" %>
</body>
</html>