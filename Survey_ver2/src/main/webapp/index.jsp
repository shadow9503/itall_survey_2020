<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
<title>잇올 설문조사</title>
<style>
   
   
   body {
 /*       overflow-x:hidden;
      overflow-y:hidden;  */
   }
   .background {
      width: 100%;
       height: 100%;
   }
   .header {
      display: flex;
         justify-content: center;
   }
   .headerImage {
      width: 100%;
   }
   .content {
      display: flex;
      height: 45%;
       align-items: center;
         justify-content: center;
   }
   .surbeyButton {
       font-size: 30px;
       color: white;
       background-color: #d63e3d;
       padding: 20px;
       border-radius: 30px;
   }
   .footer {
      bottom: 0;
      left: 50%;
      margin-left: -122px;
      position: fixed;
   }
   .info {
      display: flex;
      height: 10%;
      background-color: blue;
      align-items: center;
         justify-content: center;
   }
   
</style>

<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
<script type="text/javascript"></script>
<script>

function popup1() {
   var url = 'survey1'
   window.open(url,"page1","width=800, height=1000, resizable=no,scrollbars=yes")
/*    document.getElementById("m_id").value = opener.document.userInfo.id.value */
}
function popup2() {
   var url = 'survey2'
   window.open(url,"page2","width=800, height=1000, resizable=no,scrollbars=yes")
/*    document.getElementById("m_id").value = opener.document.userInfo.id.value */
}
function popup3() {
   var url = 'survey3'
   window.open(url,"page2","width=800, height=1000, resizable=no,scrollbars=yes")
/*    document.getElementById("m_id").value = opener.document.userInfo.id.value */
}
function popup4() {
   var url = 'survey4'
   window.open(url,"page2","width=800, height=1000, resizable=no,scrollbars=yes")
/*    document.getElementById("m_id").value = opener.document.userInfo.id.value */
}
</script>
</head>
<body>
<%-- <div class="surveyBtnContainer">
   <input type="button" name="btn1" class="surveybtn" id="btn1"onclick="popup1()" value="설문 조사 시작">
   <span class="blank"/>
<!-- <input type="button" name="btn2" id="btn2"onclick="popup2()" value="설문 2번">
<input type="button" name="btn2" id="btn2"onclick="popup3()" value="설문 3번">
<input type="button" name="btn2" id="btn2"onclick="popup4()" value="설문 4번"> -->

   <input type="button" class="surveybtn" style="margin-top: 20px; background-color: #87CEFA" onclick="location.href='./excel'" value="DB파일 내보내기" disabled/>
</div> --%>
 <header class="navbar navbar-dark bg-dark">
	<section class="container">
		<a class="navbar-brand">
			<img src="https://dev.itall.com/img/common/logo/logo_sparta.png" />
		</a>
	</section> 
</header>
<div class="background">
   <div class="header">
      <img class="headerImage" src="./resources/img/survey_header.png"></img>
   </div>
   <div class="content">
      <button class="surbeyButton" onclick="popup1()">설문조사 시작</button>
   </div>
   <div class="footer">
      <img src="./resources/img/itall_logo.png"></img>
   </div>
</div>

</body>
<script>
   function showInfo() {
       document.getElementById("info").setAttribute('class', '');
       document.getElementById("info-image").setAttribute('class', '');
   }
</script>
</html>