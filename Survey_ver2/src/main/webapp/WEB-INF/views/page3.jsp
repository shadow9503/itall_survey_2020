<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>설문 3/4</title>
<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
<script src="./resources/js/jquery-latest.min.js"></script>
<script type="text/javascript"></script>


<script>
  var  doubleTapCheck =false;

  function check() {
	    var selectcheck = 0;

	    if (doubleTapCheck) {
	        return false;
	    }


	    if ($("#korin").val() == "") {
	        alert("국어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#korin").focus();
	        return false;
	    }
	    if ($("#korre").val() == "") {
	        alert("국어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#korre").focus();
	        return false;
	    }
	    if ($("#korpr").val() == "") {
	        alert("국어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#korpr").focus();
	        return false;
	    }
	    if ($("#korpt").val() == "") {
	        alert("국어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#korpt").focus();
	        return false;
	    }
	    if ($("#engin").val() == "") {
	        alert("영어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#engin").focus();
	        return false;
	    }
	    if ($("#engre").val() == "") {
	        alert("영어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#engre").focus();
	        return false;
	    }
	    if ($("#engpr").val() == "") {
	        alert("영어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#engpr").focus();
	        return false;
	    }
	    if ($("#engpt").val() == "") {
	        alert("영어 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#engpt").focus();
	        return false;
	    }
	    if ($("#matin").val() == "") {
	        alert("수학 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#matin").focus();
	        return false;
	    }
	    if ($("#matre").val() == "") {
	        alert("수학 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#matre").focus();
	        return false;
	    }
	    if ($("#matpr").val() == "") {
	        alert("수학 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#matpr").focus();
	        return false;
	    }
	    if ($("#matpt").val() == "") {
	        alert("수학 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#matpt").focus();
	        return false;
	    }
	    if ($("#selsuin").val() == "") {
	        alert("탐구 1 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsuin").focus();
	        return false;
	    }
	    if ($("#selsure").val() == "") {
	        alert("탐구 1 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsure").focus();
	        return false;
	    }
	    if ($("#selsupr").val() == "") {
	        alert("탐구 1 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsupr").focus();
	        return false;
	    }
	    if ($("#selsupt").val() == "") {
	        alert("탐구 1 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsupt").focus();
	        return false;
	    }
	    if ($("#selsu1in").val() == "") {
	        alert("탐구 2 과목의  학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsu1in").focus();
	        return false;
	    }
	    if ($("#selsu1re").val() == "") {
	        alert("탐구 2 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsu1re").focus();
	        return false;
	    }
	    if ($("#selsu1pr").val() == "") {
	        alert("탐구 2 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsu1pr").focus();
	        return false;
	    }
	    if ($("#selsu1pt").val() == "") {
	        alert("탐구 2 과목의 학습 우선순위 입력이 누락 되었습니다.");
	        $("#selsu1pt").focus();
	        return false;
	    }
	    if ($("#korin").val() == $("#korre").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korin").focus();
	        return false;
	    }
	    if ($("#korin").val() == $("#korpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korin").focus();
	        return false;
	    }
	    if ($("#korin").val() == $("#korpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korin").focus();
	        return false;
	    }
	    if ($("#korre").val() == $("#korpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korre").focus();
	        return false;
	    }
	    if ($("#korre").val() == $("#korpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korre").focus();
	        return false;
	    }
	    if ($("#korpr").val() == $("#korpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#korpe").focus();
	        return false;
	    }
	    if ($("#engin").val() == $("#engre").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#engin").focus();
	        return false;
	    }
	    if ($("#engin").val() == $("#engpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#engin").focus();
	        return false;
	    }
	    if ($("#engin").val() == $("#engpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#engin").focus();
	        return false;
	    }
	    if ($("#engre").val() == $("#engpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#engre").focus();
	        return false;
	    }
	    if ($("#engre").val() == $("#engpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#engre").focus();
	        return false;
	    }
	    if ($("#matpr").val() == $("#matpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matpe").focus();
	        return false;
	    }
	    if ($("#matin").val() == $("#matre").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matin").focus();
	        return false;
	    }
	    if ($("#matin").val() == $("#matpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matin").focus();
	        return false;
	    }
	    if ($("#matin").val() == $("#matpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matin").focus();
	        return false;
	    }
	    if ($("#matre").val() == $("#matpr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matre").focus();
	        return false;
	    }
	    if ($("#matre").val() == $("#matpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matre").focus();
	        return false;
	    }
	    if ($("#matpr").val() == $("#matpt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#matpe").focus();
	        return false;
	    }
	    if ($("#selsuin").val() == $("#selsure").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsuin").focus();
	        return false;
	    }
	    if ($("#selsuin").val() == $("#selsupr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsuin").focus();
	        return false;
	    }
	    if ($("#selsuin").val() == $("#selsupt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsuin").focus();
	        return false;
	    }
	    if ($("#selsure").val() == $("#selsupr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsure").focus();
	        return false;
	    }
	    if ($("#selsure").val() == $("#selsupt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsure").focus();
	        return false;
	    }
	    if ($("#selsupr").val() == $("#selsupt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsupe").focus();
	        return false;
	    }
	    if ($("#selsu1in").val() == $("#selsu1re").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1in").focus();
	        return false;
	    }
	    if ($("#selsu1in").val() == $("#selsu1pr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1in").focus();
	        return false;
	    }
	    if ($("#selsu1in").val() == $("#selsu1pt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1in").focus();
	        return false;
	    }
	    if ($("#selsu1re").val() == $("#selsu1pr").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1re").focus();
	        return false;
	    }
	    if ($("#selsu1re").val() == $("#selsu1pt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1re").focus();
	        return false;
	    }
	    if ($("#selsu1pr").val() == $("#selsu1pt").val()) {
	        alert("우선 순위에 같은 값이 존재합니다. 중복된 값 없이 각 항목에 1~4로 입력해주세요");
	        $("#selsu1pe").focus();
	        return false;
	    }
	    if ($("#matslc").val() == "") {
	        alert("수학 형을 선택해주세요");
	        return false;
	    }

	    if (!($(".select1").val() && $(".select2").val())) {
	        alert("탐구 과목을 선택해주세요");
	        return false;
	    }
	    if (!($(".input101").val() && $(".input102").val())) {
	        alert("탐구 영역 원 점수를 입력 해주세요");
	        return false;
	    }
	    if ($("#kor1").val() == "") {
	        alert("국어 과목의 원점수를 입력해주세요.");
	        return false;
	    }
	    if ($("#mat1").val() == "") {
	        alert("수학 과목의 원점수를 입력해주세요.");
	        return false;
	    }
	    if ($("#eng1").val() == "") {
	        alert("영어 과목의 원점수를 입력해주세요.");
	        return false;
	    }
	    doubleTapCheck = true;
	    btn = document.getElementById('btnsumit');
	    btn.disabled = 'disabled';
	    btn.style.backgroundColor = 'grey';
	    showLoadingProgress();


	    document.getElementById('page3').submit();

	}
      
      function showLoadingProgress() {
          document.getElementById("loading").setAttribute('class', '');
          document.getElementById("loading-image").setAttribute('class', '');
          document.getElementById("loading-text").setAttribute('class', '');
       }
      
      function InputEvent(conditions) {
    	    var $input = conditions.input;
    	    var dataType = conditions.dataType;
    	    var eventType = conditions.eventType;

    	    if ((!eventType)) {
    	        eventType = "change";
    	    }

    	    var handlerFunc = conditions.handler;
    	    if ((!handlerFunc)) {
    	        handlerFunc = function (event) {
    				//한글만
    	           if (dataType == "NUM") {
    	                regEx = /[^1234]/gi;
    	            }else if (dataType == "NUMALL") {
    	                regEx = /[^0-9]/gi;
    	            }
    	            remainOnlyTargetValue(regEx, $input, event);
    	        };
    	    }
    	    $input.on(eventType, handlerFunc);
    	}

    	function remainOnlyTargetValue(regEx, $input, event) {
    	    if ((!(event.keyCode >= 34 && event.keyCode <= 40)) && event.keyCode != 16) {
    	        var inputVal = $input.val();
    	        if (regEx.test(inputVal)) {
    	            $input.val(inputVal.replace(regEx, ''));
    	        }
    	    }
    	}

    	$(document).ready(function () {
    	    try {
    	        InputEvent({input: $("#korin"), dataType: "NUM"});
    	        InputEvent({input: $("#korre"), dataType: "NUM"});
    	        InputEvent({input: $("#korpr"), dataType: "NUM"});
    	        InputEvent({input: $("#korpt"), dataType: "NUM"});
    	        InputEvent({input: $("#engin"), dataType: "NUM"});
    	        InputEvent({input: $("#engre"), dataType: "NUM"});
    	        InputEvent({input: $("#engpr"), dataType: "NUM"});
    	        InputEvent({input: $("#engpt"), dataType: "NUM"});
    	        InputEvent({input: $("#matin"), dataType: "NUM"});
    	        InputEvent({input: $("#matre"), dataType: "NUM"});
    	        InputEvent({input: $("#matpr"), dataType: "NUM"});
    	        InputEvent({input: $("#matpt"), dataType: "NUM"});
    	        InputEvent({input: $("#selsuin"), dataType: "NUM"});
    	        InputEvent({input: $("#selsure"), dataType: "NUM"});
    	        InputEvent({input: $("#selsupr"), dataType: "NUM"});
    	        InputEvent({input: $("#selsupt"), dataType: "NUM"});
    	        InputEvent({input: $("#selsu1in"), dataType: "NUM"});
    	        InputEvent({input: $("#selsu1re"), dataType: "NUM"});
    	        InputEvent({input: $("#selsu1pr"), dataType: "NUM"});
    	        InputEvent({input: $("#selsu1pt"), dataType: "NUM"});
    	      
    	    } catch (e) {
    	        console.log(e);
    	    }
    	});
</script>

</head>
<body>
<div id="loading" class="hide">
             <img id="loading-image" class="hide" src="./resources/img/loader-white.gif" alt="Loading..." />
             <span id="loading-text" class="hide" >  로딩중...</span>
       </div>
<form id="page3" name="page3" action="./subjectsurvey" method="post" autocomplete="off">


<div class="limiter">
		<div class="container-login100">
  <div class="wrap-login100">
<table border="1">
          <thead>
<tr> <th scope="col" colspan="4" align="left" style="font-size: 20px; padding-bottom: 30px;">  다음 과목들에 대해서 원점수와 백분위를 입력해주세요<br/> 백분위는 소수점 두번째 자리까지 입력해주세요<br/><br/><span style="color: red">원점수만 입력해주세요 탐구과목은 과목을 선택해야 입력가능합니다.</span></th></tr>
   </thead>
          <tr>
          	<th colspan="2" style="width: 250px;">과목</th>
            <th colspan="1" style="width: 150px;">원점수</th>
            <th colspan="1" style="width: 150px;">백분위(00.00)</th>
          </tr>
     
      <tbody>
          		<tr>
                    <td colspan="2" style="padding-bottom: 20px; font-size: 15px; font-weight: bold; "> 국어</td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						   <input class="input100" name='kor1' id='kor1' type='number' style="width: 100px;"></div></td>
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                               <input class="input100" name='korp' id='korp' type='text' style="width: 100px;" disabled></div></td>         
                </tr>
                <tr>
                <tr>
                    <td colspan="2" style="padding-bottom: 20px; font-size: 15px; font-weight: bold;"> 영어</td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input100" name='eng1' id='eng1' type='number' style="width: 100px;"></div></td>				 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input class="input100" name='engp' id='engp' type='text' style="width: 100px;" disabled></div></td>         
                </tr>
                <tr>
                <tr>
                    <td scope="col" style="padding-bottom: 20px; font-size: 15px; font-weight: bold; width: 120px;"> 수학</td>
                    <td scope="col" >
                       <select name="matslc" id="matslc" style="margin-left: 10px; width: 100px;">
						    <option value="" >선택하세요</option>
						    <option value="가">가</option>
						    <option value="나">나</option> 
						</select></td>  
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input100" name='mat1' id='mat1' type='text' style="width: 100px;" disabled></div></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input100" name='matp' id='matp' type='text' style="width: 100px;" disabled></div></td>         
                </tr>
        
           <c:if test="${curriculum eq '이과'}">
			<tr>
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 	
                    <select class="select1" name="selsuboe" id="selsuboe" style="margin-left: 5px; width: 200px; height: 30px;">
						    <option value="" >탐구 과목 선택하세요</option>
						    <option value="물리학1">물리학1</option>
						    <option value="화학1">화학1</option>
						    <option value="생물과학1">생명과학1</option>
						     <option value="지구과학1">지구과학1</option>
						    <option value="물리학2">물리학2</option>
						    <option value="화학2">화학2</option>  
						    <option value="생물과학2">생명과학2</option>  
						    <option value="지구과학2">지구과학2</option>
						</select></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input101"  name='selsuboe1' id='selsuboe1' type='text' style="width: 100px;" disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input  class="input101" name='selsuboep' id='selsuboep' type='text' style="width: 100px;" disabled></div></td>
                  </tr>
                  <tr>  
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 		
                     <select class="select2" name="selsubte" id="selsubte" style="margin-left: 5px; width: 200px; height: 30px;">
						    <option value="" >탐구 과목 선택하세요</option>
						    <option value="물리학1">물리학1</option>
						    <option value="화학1">화학1</option>
						    <option value="생물과학1">생명과학1</option>
						     <option value="지구과학1">지구과학1</option>
						    <option value="물리학2">물리학2</option>
						    <option value="화학2">화학2</option>  
						    <option value="생물과학2">생명과학2</option>  
						    <option value="지구과학2">지구과학2</option>
						</select></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input102" name='selsubte1' id='selsubte1' type='text' style="width: 100px;" disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input class="input102" name='selsubtep' id='selsubtep' type='text' style="width: 100px;" disabled></div></td>             
                </tr>
                <tr>
			</c:if>
			
      
           <c:if test="${curriculum eq '문과'}">
			<tr>
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 		
                    <select class="select1" name="selsubom" id="selsubom" style="margin-left: 5px; width: 200px; height: 30px;">
						    <option value="" >탐구 과목 선택하세요</option>
						    <option value="생활과윤리">생활과윤리</option>
						    <option value="윤리와사상">윤리와 사상</option>
						    <option value="한국지리">한국 지리</option>
						    <option value="세계지리">세계 지리</option> 
						    <option value="동아시아사">동아시아사</option> 
						    <option value="세계사">세계사</option>  
						    <option value="경제">경제</option> 
						    <option value="정치와법">정치와법</option>
						    <option value="사회문화">사회문화</option>
						</select></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input101"  name='selsubom1' id='selsubom1' type='text' style="width: 100px;"disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input  class="input101" name='selsubomp' id='selsubomp' type='text' style="width: 100px;"disabled></div></td> 
                  </tr>
                  <tr>  
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 		
                     <select class="select2" name="selsubtm" id="selsubtm" style="margin-left: 5px; width: 200px; height: 30px;">
                     		<option value="" >탐구 과목 선택하세요</option>
						    <option value="생활과윤리">생활과윤리</option>
						    <option value="윤리와사상">윤리와 사상</option>
						    <option value="한국지리">한국 지리</option>
						    <option value="세계지리">세계 지리</option> 
						    <option value="동아시아사">동아시아사</option> 
						    <option value="세계사">세계사</option>  
						    <option value="경제">경제</option> 
						    <option value="정치와법">정치와법</option>
						    <option value="사회문화">사회문화</option>
						</select></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input102" name='selsubtm1' id='selsubtm1' type='text' style="width: 100px;"disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input class="input102" name='selsubtmp' id='selsubtmp' type='text' style="width: 100px;"disabled></div></td>         
                </tr>
                <tr>
			</c:if>
              
           <c:if test="${curriculum eq '예능' or curriculum eq '체능'}">
			<tr>
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 	
                    <select class="select1" name="selsubog" id="selsubog" style="margin-left: 5px; width: 200px; height: 30px;">
						    <option value="" >탐구 과목 선택하세요</option>
						    <option value="생활과윤리">생활과윤리</option>
						    <option value="윤리와사상">윤리와 사상</option>
						    <option value="한국지리">한국 지리</option>
						    <option value="세계지리">세계 지리</option> 
						    <option value="동아시아사">동아시아사</option> 
						    <option value="세계사">세계사</option>  
						    <option value="경제">경제</option> 
						    <option value="정치와법">정치와법</option>
						    <option value="사회문화">사회문화</option>
						  	<option value="물리학1">물리학1</option>
						    <option value="화학1">화학1</option>
						    <option value="생물과학1">생명과학1</option>
						     <option value="지구과학1">지구과학1</option>
						    <option value="물리학2">물리학2</option>
						    <option value="화학2">화학2</option>  
						    <option value="생물과학2">생명과학2</option>  
						    <option value="지구과학2">지구과학2</option>
						</select></td> 						
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input101"  name='selsubog1' id='selsubog1' type='text' style="width: 100px;"disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input  class="input101" name='selsubogp' id='selsubogp' type='text' style="width: 100px;"disabled></div></td> 
                  </tr>
                  <tr>  
                    <td colspan="2"style="padding-bottom: 10px; font-size: 25px; font-weight: bold; padding-left: 20px;"> 		
                     <select class="select2" name="selsubtg" id="selsubtg" style="margin-left: 5px; width: 200px; height: 30px;">
						    <option value="" >탐구 과목 선택하세요</option>
						    <option value="생활과윤리">생활과윤리</option>
						    <option value="윤리와사상">윤리와 사상</option>
						    <option value="한국지리">한국 지리</option>
						    <option value="세계지리">세계 지리</option> 
						    <option value="동아시아사">동아시아사</option> 
						    <option value="세계사">세계사</option>  
						    <option value="경제">경제</option> 
						    <option value="정치와법">정치와법</option>
						    <option value="사회문화">사회문화</option>
						    <option value="물리학1">물리학1</option>
						    <option value="화학1">화학1</option>
						    <option value="생물과학1">생명과학1</option>
						     <option value="지구과학1">지구과학1</option>
						    <option value="물리학2">물리학2</option>
						    <option value="화학2">화학2</option>  
						    <option value="생물과학2">생명과학2</option>  
						    <option value="지구과학2">지구과학2</option>
						</select></td> 
                    <td colspan="1" style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                    						<input class="input102" name='selsubtg1' id='selsubtg1' type='text' style="width: 100px;"disabled></div></td> 
                    <td colspan="1"style="padding-left: 30px;"><div class="wrap-input100 validate-input" style="width: 100px;">
                                            <input class="input102" name='selsubtgp' id='selsubtgp' type='text' style="width: 100px;"disabled></div></td>       
                </tr>
                <tr>
			</c:if>
			</tbody>
          </table>
          </div>
</div>
</div>
  
<hr color="Azure" size="10px">    
    
<div class="limiter">
		<div class="container-login100">
  <div class="wrap-login100">
          <table border="1">
          <thead>
          <tr> <th colspan="6" align="left" style="font-size: 20px; padding-bottom: 20px;">  각 과목의 공부방법에 대한 우선 순위를 선택해 주세요</th></tr>
          </thead>
          <tbody>
          <tr>
          	<th colspan="1" style="width: 100px;">과목</th>
            <th colspan="1" style="width: 100px;">인강</th>
            <th colspan="1" style="width: 100px;">현강(학원)</th>
            <th colspan="1" style="width: 100px;">독학</th>
            <th colspan="1" style="width: 100px;">과외</th>
          </tr>
</tbody>
<tbody>
          		<tr>
                    <td style="padding-left: 35px; font-size: 15px; font-weight: bold;"> 국어</td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='korin' id='korin' type="text" style="width: 50px;"maxlength="1"  ></div></td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='korre' id='korre' type="text" style="width: 50px;" maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='korpr' id='korpr' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='korpt' id='korpt' type="text" style="width: 50px;"maxlength="1" ></div></td>                     							                    							                    							                         
                </tr>
          		<tr>
                    <td style="padding-left: 35px; font-size: 15px; font-weight: bold;"> 영어</td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='engin' id='engin' type="text" style="width: 50px;" maxlength="1" ></div></td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='engre' id='engre' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='engpr' id='engpr' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='engpt' id='engpt' type="text" style="width: 50px;"maxlength="1" ></div></td>                           
                </tr>
                <tr>
                    <td style="padding-left: 35px; font-size: 15px; font-weight: bold;"> 수학</td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='matin' id='matin' type="text" style="width: 50px;"maxlength="1" ></div></td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='matre' id='matre' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='matpr' id='matpr' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='matpt' id='matpt' type="text" style="width: 50px;"maxlength="1" ></div></td>                                                
                </tr>
                <tr>
                    <td style="padding-left: 15px; font-size: 15px; font-weight: bold;"><input class="input100" name='selsu' id='selsu' type="text" style="width: 80px;" disabled></td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsuin' id='selsuin' type="text" style="width: 50px;"maxlength="1" ></div></td>
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsure' id='selsure' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsupr' id='selsupr' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td style="padding-left: 7px;"><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsupt' id='selsupt' type="text" style="width: 50px;"maxlength="1" ></div></td>                              
                </tr>
                 <tr>
                    <td style="padding-left: 15px; font-size: 15px; font-weight: bold;"><input class="input100" name='selsu1' id='selsu1' type="text" style="width: 80px;" disabled></td> 
                    <td ><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsu1in' id='selsu1in' type="text" style="width: 50px;"maxlength="1" ></div></td>
                    <td ><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsu1re' id='selsu1re' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td ><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsu1pr' id='selsu1pr' type="text" style="width: 50px;"maxlength="1" ></div></td> 
                    <td ><div class="wrap-input100 validate-input" style="width: 70px;">
                    							<input class="input100" name='selsu1pt' id='selsu1pt' type="text" style="width: 50px;"maxlength="1" ></div></td>                                    
                </tr>
                </tbody>
        </table>    
           </div>
</div>
</div>                


			<div style="margin: auto">
				<button  id='btnsumit' style="margin: inherit; background-color: #87CEFA" class="login100-form-btn" type="button" onclick="check()">
					제출 후 다음
				</button>
			</div>
			</form>

</body>
<script type="text/javascript">


$('#selsuboe').change(function(){ 
	$("#selsuboe option:selected").each(function () { 
		$("#selsu").val($(this).val());
		console.log($("#selsu").val());
		$("#selsuboe1").attr("disabled",false); //활성화
		//$("#selsuboep").attr("disabled",false); //활성화
		$("#selsu").attr("disabled",true); //비활성화 
		}); 
	});
$('#selsubte').change(function(){ 
	$("#selsubte option:selected").each(function () { 
		$("#selsu1").val($(this).val());
		console.log($("#selsu1").val());
		$("#selsubte1").attr("disabled",false); //활성화
		//$("#selsubtep").attr("disabled",false); //활성화
		$("#selsu1").attr("disabled",true); //비활성화 
		}); 
	});
$('#selsubom').change(function(){ 
	$("#selsubom option:selected").each(function () { 
		$("#selsu").val($(this).val());
		console.log($("#selsu").val());
		$("#selsubom1").attr("disabled",false); //활성화
		//$("#selsubomp").attr("disabled",false); //활성화
		$("#selsu").attr("disabled",true); //비활성화 
		}); 
	});
$('#selsubtm').change(function(){ 
	$("#selsubtm option:selected").each(function () { 
		$("#selsu1").val($(this).val());
		console.log($("#selsu1").val());
		$("#selsubtm1").attr("disabled",false); //활성화
		//$("#selsubtmp").attr("disabled",false); //활성화
		$("#selsu1").attr("disabled",true); //비활성화 
		}); 
	});
$('#selsubog').change(function(){ 
	$("#selsubog option:selected").each(function () { 
		$("#selsu").val($(this).val());
		console.log($("#selsu").val());
		$("#selsubog1").attr("disabled",false); //활성화
		//$("#selsubogp").attr("disabled",false); //활성화
		$("#selsu").attr("disabled",true); //비활성화 
		}); 
	});
$('#selsubtg').change(function(){ 
	$("#selsubtg option:selected").each(function () { 
		$("#selsu1").val($(this).val());
		console.log($("#selsu1").val());
		$("#selsubtg1").attr("disabled",false); //활성화
		//$("#selsubtgp").attr("disabled",false); //활성화
		$("#selsu1").attr("disabled",true); //비활성화 
		}); 
	});
	
$('#matslc').change(function(){ 
	$("#matslc option:selected").each(function () { 
		$("#mat1").attr("disabled",false); //활성화
		//$("#matp").attr("disabled",false); //활성화 
		}); 
	});

</script>
</html>