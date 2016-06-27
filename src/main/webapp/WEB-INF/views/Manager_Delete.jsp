<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ManagerUpdate</title>
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
<%@include  file="ManagerNavbar.jspf" %>
    <div class="main_content">
        <div class="main_content_block">
        <%
        if(request.getParameter("mes").equals("test")){
        %><!-- 測驗項目 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">測驗項目</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">
            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 60px">
            <col style="width: 180px">
            <col style="width: 119px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">測驗簡介</th>
                <th class="deleteTable-3ei2">測驗簡章</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${testList}" var="test">  
              <tr>
                <td class="deleteTable-kik3">${test.testId}</td>
                <td class="deleteTable-kik3">${test.category}</td>
                <td class="deleteTable-kik3"><textarea rows="1" cols="35" readonly>${test.introduction}</textarea></td>
                <td class="deleteTable-kik3"><input type="text" value="${test.brochure}" style="width:200px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${test.testId} " form-action="test"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="delete" class="updatebutton" onclick="self.location.href='Manager_Update?mes=test&testId=${test.testId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              <!-- 資料庫 -->
            </table>

          </div>
        </div>
        <!-- 測驗項目 --><%
    }
        %>
        <%
        if(request.getParameter("mes").equals("testnews")){
        %>
      
        <!-- 測驗消息 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">消息</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 65px">
            <col style="width: 120px">
            <col style="width: 60px">
            <col style="width: 80px">
            <col style="width: 60px">
            <col style="width: 50px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
             <form id="form1" name="form1" method="get" action="Manager_Delete_Search_News">
      			<select name="test" style="padding:5px; font-size:16px; margin-right:5px;margin-left:4px;">
      			<option>測驗項目</option>
				<c:forEach items="${testList}" var="test" begin="0" end="3" step="1">
                    <option>${test.category}</option>
                </c:forEach>
				</select>
				<input type="hidden" name="display"  value="1">
				<input type="hidden" name="mes"  value="testnews">
				<input type="text" name="word" id="text" placeholder="請輸入關鍵字">&nbsp
				<input type="submit" name="submit" id="submit" class="button" value="搜尋">
				</form>
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">公告日期</th>
                <th class="deleteTable-3ei2">標題名稱</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">時程項目</th>
                <th class="deleteTable-3ei2">發布人員</th>
                <th class="deleteTable-3ei2">URL</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
<!--  -->     <!-- 以下跑資料庫 -->

              <c:if test="${display != 1}">
			<c:forEach items="${newsList}" var="news">  	
              <tr>
                <td class="deleteTable-kik3">${news.id}</td>
                <td class="deleteTable-kik3">${news.createDate}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.title}" style="width:180px;" readonly></td>
                <td class="deleteTable-kik3">${news.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.schedule.scheduleName}" style="width:110px;" readonly></td>
                <td class="deleteTable-kik3">${news.manager.managerAccount}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.content}" style="width:60px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${news.id} " form-action="testnews"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=testnews&id=${news.id}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if >
              <c:if test="${display == 1}">
              <c:if test="${wordDisplay == 0}">
              <c:forEach items="${newsList}" var="news">  	
              <tr>
                <td class="deleteTable-kik3">${news.id}</td>
                <td class="deleteTable-kik3">${news.createDate}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.title}" style="width:180px;" readonly></td>
                <td class="deleteTable-kik3">${news.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.schedule.scheduleName}" style="width:110px;" readonly></td>
                <td class="deleteTable-kik3">${news.manager.managerAccount}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.content}" style="width:60px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${news.id} " form-action="testnews"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=testnews&id=${news.id}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if >
              <c:if test="${wordDisplay == 1}">
              <c:forEach items="${newsWordList}" var="news">  	
              <tr>
                <td class="deleteTable-kik3">${news.id}</td>
                <td class="deleteTable-kik3">${news.createDate}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.title}" style="width:180px;" readonly></td>
                <td class="deleteTable-kik3">${news.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.schedule.scheduleName}" style="width:110px;" readonly></td>
                <td class="deleteTable-kik3">${news.manager.managerAccount}</td>
                <td class="deleteTable-kik3"><input type="text" value="${news.content}" style="width:60px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${news.id} " form-action="testnews"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=testnews&id=${news.id}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if >
              </c:if >
            </table>
          </div>
        </div>
        <!-- 測驗消息 -->
        <%
        }
        %>
        <%
        if(request.getParameter("mes").equals("schedule")){
        %>
        <!-- 時程 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">時程</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 65px">
            <col style="width: 120px">
            <col style="width: 60px">
            <col style="width: 70px">
            <col style="width: 70px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">公告日期</th>
                <th class="deleteTable-3ei2">時程項目</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">開始時間</th>
                <th class="deleteTable-3ei2">結束時間</th>
                
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${scheduleList}" var="schedule"> 
			  <c:if test="${schedule.scheduleId!='1'}">
              <tr>
                <td class="deleteTable-kik3">${schedule.scheduleId}</td>
                <td class="deleteTable-kik3">${schedule.schedulePostTime}</td>
                <td class="deleteTable-kik3"><input type="text" value="${schedule.scheduleName}" style="width:180px;" readonly></td>
                <td class="deleteTable-kik3">${schedule.test.category}</td>
                <td class="deleteTable-kik3">${schedule.scheduleStartTime}</td>
                <td class="deleteTable-kik3">${schedule.scheduleEndTime}</td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${schedule.scheduleId} " form-action="schedule"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=schedule&scheduleId=${schedule.scheduleId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:if>
              </c:forEach>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 時程 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("masterpiece")){
        %>
        <!-- 參考佳作 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">參考佳作</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 60px">
            <col style="width: 50px">
            <col style="width: 60px">
            <col style="width: 40px">
            <col style="width: 60px">
            <col style="width: 120px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">名稱</th>
                <th class="deleteTable-3ei2">學年度</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">科目</th>
                <th class="deleteTable-3ei2">URL</th>
                <th class="deleteTable-3ei2">評分標準</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${masterpieceList}" var="masterpiece"> 
              <tr>
                <td class="deleteTable-kik3">${masterpiece.masterpieceId}</td>
                <td class="deleteTable-kik3">${masterpiece.masterpieceName}</td>
                <td class="deleteTable-kik3">${masterpiece.masterpieceYear}</td>
                <td class="deleteTable-kik3">${masterpiece.test.category}</td>
                <td class="deleteTable-kik3">${masterpiece.masterpieceSubject}</td>
                <td class="deleteTable-kik3"><input type="text" value="${masterpiece.masterpieceURL}" style="width:80px;" readonly></td>
                <td class="deleteTable-kik3"><textarea rows="1" cols="22" readonly>${masterpiece.masterpieceContent}</textarea></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${masterpiece.masterpieceId} " form-action="masterpiece"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=masterpiece&masterpieceId=${masterpiece.masterpieceId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 參考佳作 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("referencepaper")){
        %>
        <!-- 參考試題 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">參考試卷</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 45px">
            <col style="width: 50px">
            <col style="width: 60px">
            <col style="width: 70px">
            <col style="width: 80px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">學年度</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">檔案名稱</th>
                <th class="deleteTable-3ei2">URL</th>
                
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${referencePaperList}" var="referencePaper">
              <tr>
                <td class="deleteTable-kik3">${referencePaper.referencePaperId}</td>
                <td class="deleteTable-kik3">${referencePaper.referencePaperYear}</td>
                <td class="deleteTable-kik3">${referencePaper.test.category}</td>
                <td class="deleteTable-kik3">${referencePaper.referencePaperName}</td>
                <td class="deleteTable-kik3"><input type="text" value="${referencePaper.referencePaperDownload}" style="width:150px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${referencePaper.referencePaperId} " form-action="referencepaper"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=referencepaper&referencePaperId=${referencePaper.referencePaperId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 參考試題 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("pastpaper")){
        %>
        <!-- 歷屆試題 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">歷屆試題</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 50px">
            <col style="width: 60px">
            <col style="width: 45px">
            <col style="width: 60px">
            <col style="width: 60px">
            <col style="width: 60px">
            <col style="width: 60px">
            <col style="width: 60px">
            <col style="width: 60px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
            <form id="form1" name="form1" method="get" action="Manager_Delete_Search_Pastpaper">
				<select name="year" style="padding:5px; font-size:16px; margin-right:5px;margin-left:4px;">
      			<option value="all">年度</option>
				<c:forEach items="${pastPaperListForSearchBarYear}" var="year">
                    <option>${year.pastPaperYear}</option>
                </c:forEach>
				</select>
				<input type="hidden" name="display"  value="1">
				<input type="hidden" name="mes"  value="pastpaper">&nbsp
				<input type="submit" name="submit" id="submit" class="button" value="搜尋">
				</form>
            
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">學年度</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">科目</th>
                <th class="deleteTable-3ei2">PDF</th>
                <th class="deleteTable-3ei2">Word</th>
                <th class="deleteTable-3ei2">答案</th>
                <th class="deleteTable-3ei2">非選題評分原則</th>
                <th class="deleteTable-3ei2">語音試題</th>
                <th class="deleteTable-3ei2">語音序號對照表</th>
                
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
              <c:if test="${display != 1}">
			  <c:forEach items="${pastPaperList}" var="pastPaper">
              <tr>
                <td class="deleteTable-kik3">${pastPaper.pastPaperId}</td>
                <td class="deleteTable-kik3">${pastPaper.pastPaperYear}</td>
                <td class="deleteTable-kik3">${pastPaper.test.category}</td>
                <td class="deleteTable-kik3">${pastPaper.pastPaperSubject}</td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperPDF}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperWORD}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperAnswer}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperScore}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperVoice}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperVTable}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${pastPaper.pastPaperId} " form-action="pastpaper"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=pastpaper&pastPaperId=${pastPaper.pastPaperId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if>
              <c:if test="${display == 1}">
			  <c:forEach items="${pastPaperListForSearch}" var="pastPaper">
              <tr>
                <td class="deleteTable-kik3">${pastPaper.pastPaperId}</td>
                <td class="deleteTable-kik3">${pastPaper.pastPaperYear}</td>
                <td class="deleteTable-kik3">${pastPaper.test.category}</td>
                <td class="deleteTable-kik3">${pastPaper.pastPaperSubject}</td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperPDF}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperWORD}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperAnswer}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperScore}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperVoice}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${pastPaper.pastPaperVTable}" style="width:65px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${pastPaper.pastPaperId} " form-action="pastpaper"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=pastpaper&pastPaperId=${pastPaper.pastPaperId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 歷屆試題 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("statistic")){
        %>

      <!-- 統計資料 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">統計資料</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 45px">
            <col style="width: 150px">
            <col style="width: 60px">
            <col style="width: 70px">
            <col style="width: 45px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
            <form id="form1" name="form1" method="get" action="Manager_Delete_Search_Statistic">
            <select name="Test" style="padding:5px; font-size:16px; margin-right:5px;margin-left:4px;">
      			<option>測驗項目</option>
				<c:forEach items="${testList}" var="test"  begin="0" end="2" step="1">
                    <option>${test.category}</option>
                </c:forEach>
				</select>
				<select name="year" style="padding:5px; font-size:16px; margin-right:5px;margin-left:4px;">
      			<option value="all">全部學年度</option>
				<c:forEach items="${statisticSearchBarYear}" var="year">
                    <option>${year.statisticYear}</option>
                </c:forEach>
				</select>
				<script>
                sort=new Array();
                sort[0]=[""]; 
                sort[1]=["報名人數統計總表", "各考區試場考生人數統計總表", "缺考人數統計總表", "各集報學校報名人數統計表", "各科各考區報名人數總表", "各選考組合報名人數總表",];  // 考生基本資料
                sort[2]=["原始分數與級分對照表", "各科級分人數百分比累計表", "五科總級分人數百分比累計表", "各科級分人數百分比分布圖", "總級分人數分布圖", "成績證明申請統計表", "各科成績標準一覽表", "各科成績人數累計表", "各科成績人數分布圖", "各科選擇題分數人數統計表","歷年報名人數統計表","高中英語聽力測驗第一次考試", "高中英語聽力測驗第二次考試"];  // 成績統計
                sort[3]=["各題題分及需第三閱差分表", "國文科非選擇題分數人數統計表", "英文科非選擇題分數人數統計表"];     // 非選擇題閱卷
                sort[4]=["各科試題鑑別度及通過率之分布圖", "各科答對率及鑑別指數表","各科總成績各能力組試卷難度及鑑別度", "各科試題鑑別度及通過率之分布圖", "各科選擇題選項分析"];        // 答對率及鑑別指數
                sort[5]=["各科選擇題選項分析"];    
                sort[6]=["人工閱卷各題題分及需主閱差分表", "各科非選擇題各題分數人數統計表"]; // 答對率及鑑別指數
                
                function renew(index){
                  for(var i=0;i<sort[index].length;i++)
                    document.form1.smallsort.options[i]=new Option(sort[index][i], sort[index][i]); // 設定新選項
                  document.form1.smallsort.length=sort[index].length; // 刪除多餘的選項
                }
                </script>
                <!-- 依據第一選單選擇跳出第二選單的質 -->
                <select name="sortbig" style="padding:5px; font-size:16px; margin-right:4px;" onChange="renew(this.selectedIndex);">
                    <option>請選擇專區分類</option>
                    <c:forEach items="${statisticSearchBarRegion}" var="statistic">    
                    <option>${statistic.statisticRegion}</option>
                	</c:forEach>
                    </select>
                <select name="smallsort" style="padding:5px; font-size:16px; margin-right:4px;">
                    <option>請選擇左方分類</option>
                </select>
                
				<input type="hidden" name="display"  value="1">
				<input type="hidden" name="mes"  value="statistic">&nbsp
				<input type="submit" name="submit" id="submit" class="button" value="搜尋">
				</form>
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">學年度</th>
                <th class="deleteTable-3ei2">資料名稱</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">專區分類</th>
                <th class="deleteTable-3ei2">URL</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
             <c:if test="${display != 1}">
			  <c:forEach items="${statisticList}" var="statistic">
              <tr>
                <td class="deleteTable-kik3">${statistic.statisticId}</td>
                <td class="deleteTable-kik3">${statistic.statisticYear}</td>
                <td class="deleteTable-kik3">${statistic.statisticName}</td>
                <td class="deleteTable-kik3">${statistic.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${statistic.statisticRegion}" style="width:120px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${statistic.statisticDownload}" style="width:60px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${statistic.statisticId} " form-action="statistic"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=statistic&statisticId=${statistic.statisticId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if>
              <c:if test="${display == 1}">
			  <c:forEach items="${statisticSearchData}" var="statistic">
              <tr>
                <td class="deleteTable-kik3">${statistic.statisticId}</td>
                <td class="deleteTable-kik3">${statistic.statisticYear}</td>
                <td class="deleteTable-kik3">${statistic.statisticName}</td>
                <td class="deleteTable-kik3">${statistic.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${statistic.statisticRegion}" style="width:120px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${statistic.statisticDownload}" style="width:60px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${statistic.statisticId} " form-action="statistic"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=statistic&statisticId=${statistic.statisticId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              </c:if>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 統計資料 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("form")){
        %>
        <!-- 相關表格 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">相關表格</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 60px">
            <col style="width: 140px">
            <col style="width: 140px">
            <col style="width: 60px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">表格名稱</th>
                <th class="deleteTable-3ei2">專區名稱</th>
                <th class="deleteTable-3ei2">URL</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${formList}" var="form">
              <tr>
                <td class="deleteTable-kik3">${form.formId}</td>
                <td class="deleteTable-kik3">${form.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${form.formName}" style="width:220px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${form.formDetail}" style="width:220px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${form.formDownload}" style="width:80px;" readonly></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${form.formId} " form-action="form"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=form&formId=${form.formId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              <!-- 資料庫 -->
            </table>
          </div>
        </div>
        <!-- 相關表格 -->
        <%}%>
        <%
        if(request.getParameter("mes").equals("question")){
        %>
        <!-- 問題解答 -->
        <div class="main_content_block_top">
          <div style="float: left;">
          <p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
                刪除／修改
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">問題解答</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

            <table class="deleteTable" style="undefined;table-layout: fixed; width: 100%">
            <colgroup>
            <col style="width: 40px">
            <col style="width: 60px">
            <col style="width: 130px">
            <col style="width: 60px">
            <col style="width: 125px">
            <col style="width: 45px">
            <col style="width: 45px">
            </colgroup>
            <!-- 標題 -->
              <tr>
                <th class="deleteTable-3ei2">ID</th>
                <th class="deleteTable-3ei2">測驗項目</th>
                <th class="deleteTable-3ei2">問題名稱</th>
                <th class="deleteTable-3ei2">類別</th>
                <th class="deleteTable-3ei2">解答內容</th>
                <th class="deleteTable-3ei2">刪除</th>
                <th class="deleteTable-3ei2">修改</th>
              </tr>
              <!-- 以下跑資料庫 -->
			  <c:forEach items="${questionList}" var="question">
              <tr>
                <td class="deleteTable-kik3">${question.questionId}</td>
                <td class="deleteTable-kik3">${question.test.category}</td>
                <td class="deleteTable-kik3"><input type="text" value="${question.questionName}" style="width:200px;" readonly></td>
                <td class="deleteTable-kik3"><input type="text" value="${question.questionDetail}" style="width:80px;" readonly></td>
                <td class="deleteTable-kik3"><textarea rows="1" cols="23" readonly>${question.questionContent}</textarea></td>
                <td class="deleteTable-kik3">
                <button type="button" name="delete" class="deletebutton"  href="#" data-toggle="modal" data-target="#deleteModal" data-id="${question.questionId} " form-action="question"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button>
                </td>
                <td class="deleteTable-kik3"><button type="button" name="update" class="updatebutton" onclick="self.location.href='Manager_Update?mes=question&questionId=${question.questionId}'"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></button></td>
              </tr>
              </c:forEach>
              <!-- 資料庫 -->
            </table>

          </div>
        </div>
        <!-- 問題解答 -->
        <%}%>

        </div>
    </div>
    
    
</div>

<%@include  file="SystemFooter.jspf" %>

	<div class="modal fade bs-example-modal-sm" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">警告</h4>
                </div>
                <div class="modal-body">
                    <p>確認刪除 ?</p>
                </div>
                <div class="modal-footer">
	                <form id="deleteForm" action="DeleteWithValues" method="post">
	            		<input type="hidden" name="id" id="deleteID">
	            		<input type="hidden" name="formAction" id="FormAction">
	                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                    <button type="submit" class="btn btn-danger">確認刪除</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>    
    <script>
    $(function(){
    	$(".deletebutton").click(function(){
    		//alert($(this).attr("data-id"));
    		$("#deleteID").val($(this).attr("data-id"));
    		$("#FormAction").val($(this).attr("form-action"));
    	});
    });
    </script>



</body>
</html>