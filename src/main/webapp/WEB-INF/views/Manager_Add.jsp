<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>ManagerAdd</title>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Manager_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/Normal_navbar.css">
    <link href="css/jquery.validate.css" rel="stylesheet">
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">測驗項目</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

 <!-- test form --><form id="insertTest" name="insertTest" method="post" action="Manager_Add_test" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td><input type="text" name="category" id="category" placeholder="測驗項目" class="text_Field"></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">簡介</td>
                  <td style="padding-left:5.8%;"><textarea name="introduction" id="introduction" rows="10" cols="50"></textarea></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">簡章</td>
                  <td><input type="file" name="brochure" id="brochure" placeholder="簡章" ></td>
                </tr>
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="t_submit" id="t_submit" class="addbutton" value="新增">
            </div>


            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">消息</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">
	
<!-- news form --><form id="insertNews" name="insertNews" method="post" action="Manager_Add_testnews" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <td class="addTable-rf6n">消息標題</td>
                  <td><input type="text" id="title" name="title" placeholder="標題" class="text_Field"></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">發布人員</td>
                  <td><input type="text" id="manager.managerAccount" style="background-color: transparent; border: 0px" name="manager.managerAccount" value="${manager.managerAccount}" class="text_Field" readonly></td>
                </tr>
                
                <!-- 依據第一選單選擇跳出第二選單的質 
                <script>
                testnews_sort=new Array();
                testnews_sort[0]=[""];  // 未選擇
                testnews_sort[1]=["","學測的時程", "學測的時程2"];  // 學科能力測驗
                testnews_sort[2]=["指考的時程", "指考的時程2"];  // 指定科目考試
                testnews_sort[3]=["英聽的時程", "英聽的時程2"];     // 英文聽力測驗
                
                function testnews_renew(index){
                  for(var i=0;i<testnews_sort[index].length;i++)
                    document.testnews_form1.testnews_schedule.options[i]=new Option(testnews_sort[index][i], testnews_sort[index][i]); // 設定新選項
                  document.testnews_form1.testnews_schedule.length=testnews_sort[index].length; // 刪除多餘的選項
                }
                </script>
                 依據第一選單選擇跳出第二選單的質 -->
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">時程項目</td>
                  <td style="padding-left:5.8%;">
                  <select class="form-control" id="schedule.scheduleId" name="schedule.scheduleId">
				  		<c:forEach items="${scheduleList}" var="schedule">
					  		<option value="${schedule.scheduleId}">
					  			${schedule.scheduleName}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">載點連結</td>
                  <td><input type="file" id="content" name="content"></td>
                </tr>
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="testnews_submit" id="testnews_submit" class="addbutton" value="新增">
            </div>

          </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">時程</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

 <!-- schedule form -->  <form id="insertSchedule" name="insertSchedule" method="post" action="Manager_Add_schedule" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <td class="addTable-rf6n">時程項目</td>
                  <td><input type="text" id="scheduleName" name="scheduleName" placeholder="時程項目" class="text_Field"></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">開始時間</td>
                  <td><input type="date" id="scheduleStartTime" name="scheduleStartTime" placeholder="開始時間 (yyyy/mm/dd)" class="text_Field"></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">結束時間</td>
                  <td><input type="date" id="scheduleEndTime" name="scheduleEndTime" placeholder="結束時間 (yyyy/mm/dd)" class="text_Field"></td>
                </tr>
                
                
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="schedule_submit" id="schedule_submit" class="addbutton" value="新增">
            </div>


            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">參考佳作</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- masterpiece form -->  <form id="insertMasterpiece" name="insertMasterpiece" method="post" action="Manager_Add_masterpiece" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <td class="addTable-rf6n">名稱</td>
                  <td><input type="text" name="masterpieceName" id="masterpieceName" placeholder="名稱" class="text_Field"></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">學年度</td>
                  <td><input type="text" name="masterpieceYear" id="masterpieceYear"   class="text_Field" style="width:55px;">學年度</td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">考科</td>
                  <td style="padding-left:5.8%;">
	                  <select id="masterpieceSubject" name="masterpieceSubject" style="padding:5px; font-size:16px; margin-right:4px;">
	                    <option value="國文">國文</option>
	                    <option value="英文">英文</option>
	                  </select>
                   </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">PDF檔</td>
                  <td><input type="file" name="masterpieceURL" id="masterpieceURL" placeholder="PDF連結網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">評分標準</td>
                  <td style="padding-left:5.8%;"><textarea name="masterpieceContent" id="masterpieceContent"  rows="10" cols="50"></textarea></td>
                </tr>
                
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="masterpiece_submit" id="masterpiece_submit" class="addbutton" value="新增">
            </div>


            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">參考試卷</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- referencePaper form --> <form id="insertReferencePaper" name="insertReferencePaper" method="post" action="Manager_Add_referencepaper" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <td class="addTable-rf6n">檔案名稱</td>
                  <td style="padding-left:5.8%;"><select name="referencePaperName" id="referencePaperName" style="padding:5px; font-size:16px; margin-right:4px;">
                    <option value="試題下載">試題下載</option>
                    <option value="語音檔下載">語音檔下載</option>
                    <option value="參考答案下載">參考答案下載</option>
                    </select></td>
                </tr>
                <tr>
                  <th class="addTable-rf6n">公告年度</th>
                  <th><input type="text" name="referencePaperYear" id="referencePaperYear" class="text_Field" style="width:55px;">年</th>
                </tr>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
					  		<option value="3">
					  			英聽
				  			</option>
					</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">載點</td>
                  <td><input type="file" name="referencePaperDownload" id="referencePaperDownload" ></td>
                </tr>
                
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="referencepaper_submit" id="referencepaper_submit" class="addbutton" value="新增">
            </div>


            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">歷屆試題</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- pastPaper form --><form id="insertPastPaper" name="insertPastPaper" method="post" action="Manager_Add_pastpaper" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                
                <!-- 依據第一選單選擇跳出第二選單的質
                <script>
                pastpaper_sort=new Array();
                pastpaper_sort[0]=[""];  // 未選擇
                pastpaper_sort[1]=["國文", "英文", "數學", "自然", "社會"];  // 學科能力測驗
                pastpaper_sort[2]=["國文", "英文", "數學甲", "數學乙", "物理", "化學", "生物", "歷史", "地理", "公民"];  // 指定科目考試
                pastpaper_sort[3]=["第一次英聽", "第二次英聽"];     // 英文聽力測驗
                
                function pastpaper_renew(index){
                  for(var i=0;i<pastpaper_sort[index].length;i++)
                    document.pastpaper_form1.pastpaper_subject.options[i]=new Option(pastpaper_sort[index][i], pastpaper_sort[index][i]); // 設定新選項
                  document.pastpaper_form1.pastpaper_subject.length=pastpaper_sort[index].length; // 刪除多餘的選項
                }
                </script>
                	 依據第一選單選擇跳出第二選單的質 
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">考科</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="pastPaperSubject" name="pastPaperSubject">
				  		<c:forEach items="${pastPaperListForDistinctSubject}" var="pastPaper">
					  		<option value="${pastPaper.pastPaperSubject}">
					  			${pastPaper.pastPaperSubject}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr> -->
              <!-- <tr>
                  <td class="addTable-rf6n">考科</td>
                  <td style="padding-left:5.8%;"><select name="pastpaper_subject" style="padding:5px; font-size:16px; margin-right:4px;">
                    <option value="">請選擇測驗項目</option>

                    </select></td>
                </tr>
			  -->
			  <!-- 依據第一選單選擇跳出第二選單的質 -->
                <script>
                pastpaper_sort=new Array();
                pastpaper_sort[0]=[""];  // 未選擇
                pastpaper_sort[1]=["國文", "英文", "數學", "自然", "社會"];  // 學科能力測驗
                pastpaper_sort[2]=["國文", "英文", "數學甲", "數學乙", "物理", "化學", "生物", "歷史", "地理", "公民"];  // 指定科目考試
                pastpaper_sort[3]=["第一次英聽", "第二次英聽"];     // 英文聽力測驗
                
                function pastpaper_renew(index){
                  for(var i=0;i<pastpaper_sort[index].length;i++)
                    document.insertPastPaper.pastPaperSubject.options[i]=new Option(pastpaper_sort[index][i], pastpaper_sort[index][i]); // 設定新選項
                  document.insertPastPaper.pastPaperSubject.length=pastpaper_sort[index].length; // 刪除多餘的選項
                }
                </script>
                <!-- 依據第一選單選擇跳出第二選單的質 -->
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId" onChange="pastpaper_renew(this.selectedIndex);">
                    <option>請選擇測驗項目</option>
                    <option value="1">學測</option>
                    <option value="2">指考</option>
                    <option value="3">英聽</option>
                    </select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">考科</td>
                  <td style="padding-left:5.8%;"><select class="form-control" id="pastPaperSubject" name="pastPaperSubject">
                    <option value="">請選擇測驗項目</option>

                    </select></td>
                </tr>
                <tr>
                  <th class="addTable-rf6n">學年度</th>
                  <th><input type="text" name="pastPaperYear" id="pastPaperYear" class="text_Field" style="width:55px;">學年度</th>
                </tr>
                <tr>
                  <td class="addTable-rf6n">PDF檔</td>
                  <td><input type="file" name="pastPaperPDF" id="pastPaperPDF" placeholder="PDF載點網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">Word檔</td>
                  <td><input type="file" name="pastPaperWORD" id="pastPaperWORD" placeholder="WORD載點網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">答案</td>
                  <td><input type="file" name="pastPaperAnswer" id="pastPaperAnswer" placeholder="載點網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">非選擇題評分原則</td>
                  <td><input type="file" name="pastPaperScore" id="pastPaperScore" placeholder="載點網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">語音試題內容</td>
                  <td><input type="file" name="pastPaperVoice" id="pastPaperVoice" placeholder="載點網址" ></td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">語音序號內容對照表</td>
                  <td><input type="file" name="pastPaperVTable" id="pastPaperVTable" placeholder="載點網址" ></td>
                </tr>
                
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="pastpaper_submit" id="pastpaper_submit" class="addbutton" value="新增">
            </div>


            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">統計資料</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- statistic form --><form id="insertStatistic" name="insertStatistic" method="post" action="Manager_Add_statistic" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <th class="addTable-rf6n">標題名稱</th>
                  <th><input type="text" name="statisticName" id="statisticName" placeholder="標題名稱" class="text_Field"></th>
                </tr>
                <tr>
                  <th class="addTable-rf6n">學年度</th>
                  <th><input type="text" name="statisticYear" id="statisticYear" class="text_Field" style="width:55px;">學年度</th>
                </tr>
                <!-- 依據第一選單選擇跳出第二選單的質 
                <script>
                Sta_sort=new Array();
                Sta_sort[0]=[""];  // 未選擇時
                Sta_sort[1]=["考生基本資料" , "成績統計", "非選擇題閱卷", "答對率及鑑別指數", "選擇(填)題選項分析"];  // 學測
                Sta_sort[2]=["考生基本資料" , "成績統計", "人工閱卷", "答對率及鑑別指數"];  // 指考
                Sta_sort[3]=["考生基本資料" , "成績統計"];     // 英聽
                
                
                function Sta_renew(index){
                  for(var i=0;i<Sta_sort[index].length;i++)
                    document.Sta_form1.Sta_sortbig.options[i]=new Option(Sta_sort[index][i], Sta_sort[index][i]); // 設定新選項
                  document.Sta_form1.Sta_sortbig.length=Sta_sort[index].length; // 刪除多餘的選項
                }
                </script>
                	依據第一選單選擇跳出第二選單的質 -->
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">專區名稱</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="statisticRegion" name="statisticRegion">
				  		<c:forEach items="${statisticListForDistinctRegion}" var="statistic">
					  		<option value="${statistic.statisticRegion}">
					  			${statistic.statisticRegion}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">載點</td>
                  <td><input type="file" name="statisticDownload" id="statisticDownload" placeholder="載點網址" ></td>
                </tr>
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="Sta_submit" id="Sta_submit" class="addbutton" value="新增">
            </div>
            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">相關表格</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- form  --> <form id="insertForm" name="insertForm" method="post" action="Manager_Add_form" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <th class="addTable-rf6n">表格名稱</th>
                  <th><input type="text" name="formName" id="formName" placeholder="名稱" class="text_Field"></th>
                </tr>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="${testCategory.testId}">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">細項分類</td>
                  <td style="padding-left:5.8%;">
                  <select name="formDetail" id="formDetail" style="padding:5px; font-size:16px; margin-right:4px;">
                    <option value="個人申請使用">個人申請使用</option>
                    <option value="招生單位使用">招生單位使用</option>
                    <option value="考試相關資料申請">考試相關資料申請</option>
                    </select>
                    </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">載點</td>
                  <td><input type="file" name="formDownload" id="formDownload" placeholder="載點網址" ></td>
                </tr>
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="form_submit" id="form_submit" class="addbutton" value="新增">
            </div>

            </form>
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
                新增
            <!--arrow-->
            <font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">問題解答</font>
            
          </p>
          </div>
<%@include  file="ManagerControl.jspf" %>
        </div>

        <div class="main_content_block_down">
          <div align="center" style="padding-top:10px;">

<!-- question form --> <form id="insertQuestion" name="insertQuestion" method="post" action="Manager_Add_question" style="font-size:17px;">

            <table class="addTable" style="undefined;table-layout: fixed; width: 438px">
              <colgroup>
              <col style="width: 150px">
              <col style="width: 500px">
              </colgroup>
                <tr>
                  <th class="addTable-rf6n">問題名稱</th>
                  <th><input type="text" name="questionName" id="questionName" class="text_Field"></th>
                </tr>
                <tr>
                  <td class="addTable-rf6n">測驗項目</td>
                  <td style="padding-left:5.8%;">
                    <select class="form-control" id="test.testId" name="test.testId">
					  		<option value="3">
					  			英聽
				  			</option>
					</select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">細項分類</td>
                  <td style="padding-left:5.8%;">
                    <select name="questionDetail" id="questionDetail" style="padding:5px; font-size:16px; margin-right:4px;">
                    <option value="考試簡介">考試簡介</option>
                    <option value="應考相關">應考相關</option>
                    <option value="考場相關">考場相關</option>
                    <option value="試題相關">試題相關</option>
                    <option value="成績相關">成績相關</option>
                    </select>
                  </td>
                </tr>
                <tr>
                  <td class="addTable-rf6n">內容</td>
                  <td style="padding-left:5.8%;"><textarea name="questionContent" id="questionContent" rows="10" cols="50"></textarea></td>
                </tr>
            </table>
            <div align="right" style="margin-top:30px; padding-right:9%;">
            <input type="submit" name="Q_submit" id="Q_submit" class="addbutton" value="新增">
            </div>

            </form>
          </div>
        </div>
        <!-- 問題解答 -->
        <%}%>

    	</div>
    </div>
    
    
</div>
	
<%@include  file="SystemFooter.jspf" %>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#insertTest").validate({
		rules:{
			category:"required"
		}
	});
	$("#insertNews").validate({
		rules:{
			title:"required",
			content:"required"
		}
	});
	$("#insertSchedule").validate({
		rules:{
			scheduleName:"required",
			scheduleStartTime:"required",
			scheduleEndTime:"required"
		}
	});
	$("#insertMasterpiece").validate({
		rules:{
			masterpieceName:"required",
			masterpieceURL:"required"
		}
	});
	$("#insertReferencePaper").validate({
		rules:{
			referencePaperDownload:"required"
		}
	});
	$("#insertPastPaper").validate({
		rules:{
			pastPaperPDF:"required"
		}
	});
	$("#insertStatistic").validate({
		rules:{
			statisticName:"required"
		}
	});
	$("#insertForm").validate({
		rules:{
			formName:"required"
		}
	});
	$("#insertQuestion").validate({
		rules:{
			questionName:"required",
			questionContent:"required"
		}
	});
	</script>


</body>
</html>