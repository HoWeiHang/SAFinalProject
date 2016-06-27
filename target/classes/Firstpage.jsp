<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/Firstpage.css">
	<title>Document</title>
</head>
<body>
	<div class="big_test_container">
		<div class="small_test_container">
			<div class="test_container" onclick="location.href=
'IndexView.html';">
				<span class="every_test_blue" href="IndexView">
					<font class="word" style="color:blue;">大考中心首頁</font>
				</span>
			</div>
			<div class="test_container" style="left:25%" onclick="location.href=
'../SC_Page/SCIndexView.html';">
				<span class="every_test_green" href="SCIndexView" >
					<font class="word">學科能力測驗</font>
				</span>
			</div>
			<div class="test_container" style="left:50%" onclick="location.href=
'../SS_Page/SSIndexView.html';">
				<span class="every_test_blue" href="SSIndexView">
					<font class="word">指定科目考試</font>
				</span>
			</div>
			<div class="test_container" style="left:75%" onclick="location.href=
'../EL_Page/ELIndexView.html';">
				<span class="every_test_green" href="ELIndexView">
					<font class="word">英文聽力測驗</font>
				</span>
			</div>
		</div>
	</div>
</body>
</html>