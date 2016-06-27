<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>TestIndex</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/SS_navbar.css">
</head>
<body>
<%@include  file="SSNavbar.jspf" %>
<div class="wrap"> 
    <div class="main_content">
      	<div class="main_content_down">
      		<div class="main_content_down_block">
      			<div class="main_content_down_block_title">
      				<p style="color:#FF6A00; font-size:24px; font-family: Microsoft JhengHei;">
      					統計資料
						<!--arrow-->
						<font color="#FF9A00"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain" style="padding-right:8%; padding-left:8%; font-family:Microsoft JhengHei;">

      			<form id="form1" name="form1" method="get" action="SS_Page_statistic_Search">
      			<select name="year" style="padding:5px; font-size:16px; margin-right:5px;margin-left:4px;">
				<option value="all">全部學年度</option>
				<c:forEach items="${statisticSearchBarYear}" var="statistic">
                    <option>${statistic.statisticYear}</option>
                </c:forEach>
				</select>

				<!-- 依據第一選單選擇跳出第二選單的質 -->
                <script>
                sort=new Array();
                sort[0]=[""]; 
                sort[1]=["報名人數統計總表", "各考區試場考生人數統計總表", "各科各考區報名人數總表", "各選考組合報名人數總表", "缺考人數統計總表", "各集報學校報名人數統計表"];  // 考生基本資料
                sort[2]=["各科成績標準一覽表", "各科成績人數累計表", "各科成績人數分布圖", "各科選擇題分數人數統計表"];  // 成績統計
                sort[3]=["人工閱卷各題題分及需主閱差分表", "各科非選擇題各題分數人數統計表"];     // 人工閱卷
                sort[4]=["各科總成績各能力組試卷難度及鑑別度", "各科試題鑑別度及通過率之分布圖", "各科答對率及鑑別指數表", "各科選擇題選項分析"];        // 答對率及鑑別指數
                
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

				<input type="hidden" name="check" value="1">
				<input type="hidden" name="TestID" value="2">
				<input type="submit" name="submit" id="submit" class="button" value="搜尋">

				</form>

      			<div class="TableForStatistic" >
      			<p>
      			<c:set var="check2" value="${statisticSearchData}"/> 
      			<c:set var="display" value="${check}"/> 
      			<c:if test="${display == 1 && check2[0].statisticId != 0}">
                <table>
                    
                    <tr>
                        <td>
                            學年度
                        </td>
                        <td >
                            專區分類
                        </td>
                        <td>
                            細項分類
                        </td>
                        <td>
                            載點
                        </td>
                    </tr>
                    <!-- 資料庫依搜尋結果輸入 -->
                    <c:forEach items="${statisticSearchData}" var="statistic">    
                    <tr>
                        <td>
                            ${statistic.statisticYear}
                        </td>
                        <td>
                            ${statistic.statisticRegion}
                        </td>
                        <td>
                            ${statistic.statisticName}
                        </td>
                        <td>
                            <a href="${statistic.statisticDownload}"><font color="#000000">下載</font></a>
                        </td>
                      </tr>  
                	</c:forEach> 
                    <!-- 資料庫依搜尋結果輸入 -->
                    
                </table>
                </c:if>
               
                <c:forEach items="${statisticSearchData}" var="check">    
                    <c:if test="${check.statisticId == 0}" >
   						<font color=red size="5">查無資料!!!</font>
					</c:if>
                </c:forEach>
                </p>
                </div>
      			
      			</div>
      		</div>
      	</div>

       
    </div>
</div><!-- wrap -->
<%@include  file="SystemFooter.jspf" %>
</body>
</html>