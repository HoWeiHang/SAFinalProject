<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>News</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/SC_navbar.css">
	<link rel="stylesheet" href="css/Footer.css">
</head>
<body>


<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container_top">
		<div class="container_top_text">
			<div class="container_top_topic">
			�Ǭ��O����
			</div>
			<div class="container_top_topic2">
					<a class="a_text_white" style="font-size:14px;" href="../../IndexView/IndexView.html">���� </a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:14px;" href="http://www.ceec.edu.tw/CeecMag/paper.html">�q�\��~�q�l��</a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:14px;" href="">�޲z�̵n�J</a>
					<br>
					<br>
					<a class="a_text_white" style="font-size:20px;" href="../../SS_Page/SSIndexView.html">���w��ئҸ�</a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:20px;" href="../../EL_Page/ELIndexView.html">�^�yť�O����</a>
			</div>
		</div>
	</div>
</nav>

<nav class="navbar">
      <div class="main_content_topbar">
		
      		<div style="font-family: Microsoft JhengHei;font-size:20px;">
      			<ul class="navigation">
      			
            <li style="padding-left: 23.5%;">
                <a class="main_content_link_setting" href="../01-introduction/SC_Page_introduction.html">²��</a>
            </li>
             <li>
                <a class="main_content_link_setting" href="../02-news/SC_Page_news.html">�̷s����</a>
            </li>
             <li>
                <a class="main_content_link_setting" href="../03-schedule/SC_Page_schedule.html">�Ҹդ�{</a>
            </li>
            <li>
                <a href="#">�ѦҨΧ@</a>
                <ul>
                    <li><a href="../04-masterpiece/SC_Page_masterpiece_Chinese.html">���Ҭ�</a></li>
                    <li>
                        <a href="../04-masterpiece/SC_Page_masterpiece_English.html">�^��Ҭ�</a>
                        
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">�������D</a>
                <ul>
                    <li><a href="#">�̦U�Ҭ����<span class="arrow-right"></span></a>
						<ul>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_subject.html">���</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_subject.html">�^��</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_subject.html">�ƾ�</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_subject.html">���|</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_subject.html">�۵M</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">�̾Ǧ~�פ���<span class="arrow-right"></span></a>
                        <ul>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">104</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">103</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">102</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">101</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">100</a></li>
                            <li><a href="../05-pastpaper/SC_Page_pastpaper_year.html">99</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
             <li>
                <a class="main_content_link_setting" href="../06-statistic/SC_Page_statistic.html">�έp���</a>
            </li>
             <li >
                <a class="main_content_link_setting" href="../07-form/SC_Page_form.html" style="border-right: 1px solid #fff;">�������</a>
            </li>

    </ul>	    	
    </div>
    </div>
    </nav>

<div class="wrap"> 
    <div class="main_content">
      	

      	<div class="main_content_down">
      		<div class="main_content_down_block">
      			<div class="main_content_down_block_title">
      				<p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
      					�̷s����&nbsp;
						<!--arrow-->
						<font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      					<a href="insertNews">�s�W</a>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">
      			<!-- news -->
      			<div class="TableForNews" >
      				<table >
                		<c:forEach items="${newsList}" var="news">
                    <!-- ��Ʈw��J-->
                    	<tr>
                        	<td>
                            ${news.createDate}<!--Date-->
                        	</td>
                        	<td onclick="location.href='�̷s�������}';" style="padding-left:10px;">
                           ${news.title} <!--NewsTitle-->
                        	</td>
                        	<td>
                        	<a class="btn btn-default" href="updateNews?id=${news.id}">�ק�</a>
                        	<a class="btn btn-sm btn-danger deleteBtn" href="#" data-toggle="modal" data-target="#deleteModal" data-id="${news.id}">�R��</a>
                        	</td>
                   		 </tr>
                    <!-- ��Ʈw��J-->
                		</c:forEach>   
                	</table>
                </div>
      			</div>      			
      		</div>    		
      	</div>  

    </div>
</div><!-- wrap -->
	
<footer class="footer"><!--����navbar-->
	
	<div class="footer_left">
		<div class="footer_left_left">
			<p align="right" style="font-family: Microsoft JhengHei;" >�{�Ѥ���</p>
		</div>

		<div class="footer_left_right">
			<p style="padding-left:20px;" class="footer_text_setting" >
				<a class="footer_left_link_setting" href="../../FooterRelativePage/01-aboutcenter/aboutcenter_introduction.html">
					²��
				</a>
			</p>
			<p style="padding-left:20px;" class="footer_text_setting" >
				<a class="footer_left_link_setting" href="../../FooterRelativePage/01-aboutcenter/aboutcenter_structure.html">
					��´�[�c
				</a>
			</p>
			<p style="padding-left:20px;" class="footer_text_setting" >
				<a class="footer_left_link_setting" href="../../FooterRelativePage/01-aboutcenter/aboutcenter_office.html">
					�U���¾�x
				</a>
			</p>
		</div>
	</div>
	
	<span class="footer_mid">
		<span class="footer_mid_left">
			<p align="center" style="font-family: Microsoft JhengHei;">����Ҹ�</p>
		</span>

		<span class="footer_mid_right">
			<p class="footer_text_setting">
				<a class="footer_left_link_setting" href="../../SC_Page/SCIndexView.html">
					�Ǭ��O����
				</a>
			</p>
			<p class="footer_text_setting">
				<a class="footer_left_link_setting" href="../../SS_Page/SSIndexView.html">
					���w��ئҸ�
				</a>
			</p>
			<p class="footer_text_setting">
				<a class="footer_left_link_setting" href="../../EL_Page/ELIndexView.html">
					�^��ť�O����
				</a>
			</p>
		</span>
	</span>
	
	<div class="footer_right">
		<div class="footer_right_top">
			<div class="footer_right_top_left_one">
				<p align="center" style="font-family: Microsoft JhengHei;">
					<a class="footer_right_link_setting" href="../../FooterRelativePage/02-downloadregion/downloadregion_allsoftware.html">
						�U���M��
					</a>
				</p>
			</div>
			<span class="footer_right_top_left_two">
				<p align="center" style="font-family: Microsoft JhengHei;">
					<a class="footer_right_link_setting" href="../../FooterRelativePage/03-syllabuschange/syllabuschange.html">
						�Һ�����
					</a>
				</p>
			</span>
			<span class="footer_right_top_left_three">
				<p align="center" style="font-family: Microsoft JhengHei;">
					<a class="footer_right_link_setting" href="../../FooterRelativePage/04-relativewebsite/Relativewebsite.html">
						��������
					</a>
				</p>
			</span>
			<div class="footer_right_top_left_four">
				<p align="center" style="font-family: Microsoft JhengHei;">
					<a class="footer_right_link_setting" href="../../FooterRelativePage/05-other/other.html">
						��L��T
					</a>
				</p>
			</div>
		</div>

		<div class="footer_right_down">
			<p style="padding-left:20px;margin-top:0px;font-size:11.5px;color:#696969;font-family: Microsoft JhengHei;">
				&nbsp;&nbsp;�`���G(02)2366-1416�@
					  �y���d�ߡG(02)2364-3677�@
					  �ǯu�G(02)2362-0755 
				<br>
				&nbsp;&nbsp;�a�}�G10673 �x�_����s��237��
					  �H�c�G10099 �O�_�l�F71-64��
			</p>
			
		</div>
	</div>
</footer>

<div class="modal fade bs-example-modal-sm" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">�R���峹</h4>
                </div>
                <div class="modal-body">
                    <p>�T�{�R����A�������T���]�N�R��</p>
                </div>
                <div class="modal-footer">
	                <form id="deleteForm" action="deleteNews" method="post">
	            		<input type="hidden" name="id" id="deleteID">
	                    <button type="button" class="btn btn-default" data-dismiss="modal">����</button>
	                    <button type="submit" class="btn btn-danger">�T�{�R��</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>    
    <script>
    $(function(){
    	$(".deleteBtn").click(function(){
    		//alert($(this).attr("data-id"));
    		$("#deleteID").val($(this).attr("data-id"));
    	});
    });
    </script>



    
  

</body>
</html>