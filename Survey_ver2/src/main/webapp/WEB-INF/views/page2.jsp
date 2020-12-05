<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문 2/4</title>
<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
<script src="./resources/js/jquery-latest.min.js"></script>
    <script>
    /*
    부정확한 검사 실행시 TYPE 값에 'Blank'가 들어감 이경우 다시 검사함으로 알림.
*/
$(document).ready(function() {
    var msg = "${alertMsg}";
    if(msg != "") alert(msg);
});
    
var  doubleTapCheck =false;
    
    
         function check() {
        	  if(doubleTapCheck) {
    		      return false;
    		   }
          if ($("input[name=A1A]:radio:checked").length < 1) {
            alert("Q1-A 질문에 답변해주세요 ");
            return false;
          }
          if ($("input[name=A1B]:radio:checked").length < 1) {
        	  alert("Q1-B 질문에 답변해주세요 ");
              return false;
            } 
          if ($("input[name=A2A]:radio:checked").length < 1) {
        	  alert("Q2-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A2B]:radio:checked").length < 1) {
        	  alert("Q2-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A3A]:radio:checked").length < 1) {
        	  alert("Q3-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A3B]:radio:checked").length < 1) {
        	  alert("Q3-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A4A]:radio:checked").length < 1) {
        	  alert("Q4-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A4B]:radio:checked").length < 1) {
        	  alert("Q4-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A5A]:radio:checked").length < 1) {
              alert("Q5-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A5B]:radio:checked").length < 1) {
              alert("Q5-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A6A]:radio:checked").length < 1) {
              alert("Q6-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A6B]:radio:checked").length < 1) {
              alert("Q6-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A7A]:radio:checked").length < 1) {
              alert("Q7-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A7B]:radio:checked").length < 1) {
              alert("Q7-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A8A]:radio:checked").length < 1) {
              alert("Q8-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A8B]:radio:checked").length < 1) {
              alert("Q8-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A9A]:radio:checked").length < 1) {
              alert("Q9-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A9B]:radio:checked").length < 1) {
              alert("Q9-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A10A]:radio:checked").length < 1) {
              alert("Q10-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A10B]:radio:checked").length < 1) {
              alert("Q10-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A11A]:radio:checked").length < 1) {
              alert("Q11-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A11B]:radio:checked").length < 1) {
              alert("Q11-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A12A]:radio:checked").length < 1) {
              alert("Q12-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A12B]:radio:checked").length < 1) {
              alert("Q12-B 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A13A]:radio:checked").length < 1) {
              alert("Q13-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A13B]:radio:checked").length < 1) {
              alert("Q13-B 질문에 답변해주세요 ");
              return false;
            }  
          if ($("input[name=A14A]:radio:checked").length < 1) {
              alert("Q14-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A14B]:radio:checked").length < 1) {
              alert("Q14-B 질문에 답변해주세요 ");
              return false;
            }  
          if ($("input[name=A15A]:radio:checked").length < 1) {
              alert("Q15-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A15B]:radio:checked").length < 1) {
              alert("Q15-B 질문에 답변해주세요 ");
              return false;
            }  
          if ($("input[name=A16A]:radio:checked").length < 1) {
              alert("Q16-A 질문에 답변해주세요 ");
              return false;
            }
          if ($("input[name=A16B]:radio:checked").length < 1) {
              alert("Q16-B 질문에 답변해주세요 ");
              return false;
            }  
    	  doubleTapCheck = true;
    	  btn = document.getElementById('btnsumit');
    	  btn.disabled = 'disabled';
    	  btn.style.backgroundColor='grey';
    	  
    	  showLoadingProgress();
    	  

    	  
    	  
  	document.getElementById('page2').submit();
   }
         function showLoadingProgress() {
             document.getElementById("loading").setAttribute('class', '');
             document.getElementById("loading-image").setAttribute('class', '');
             document.getElementById("loading-text").setAttribute('class', '');
          }
    </script>
</head>
<body>
<div id="loading" class="hide">
             <img id="loading-image" class="hide" src="./resources/img/loader-white.gif" alt="Loading..." />
             <span id="loading-text" class="hide" >  로딩중...</span>
       </div>
       
<form id="page2" name="page2" action="./stylesurvey" method="post" autocomplete="off">

<div class="limiter">
		<div class="container-login100">
  <div class="wrap-login100">
<table>
<tr> <th colspan="2" align="left" style="font-size: 23px; padding-bottom: 60px; padding-top: 30px;">  다음 각 질문에 대해 자신이 어느쪽에 가까운지 그 점수에 체크하세요</th></tr>
<tr> <th colspan="2" align="left" style="font-size: 18px; color:red; padding-bottom: 60px;">  이 설문은 학습자의 학습 성향을 판단 할 수 있는 설문입니다. <br/>각 문항의 a/b 를 읽고 더 가까운 쪽에 높은점수를 주시면 되며, a/b문항의 응답 점수는 달라야합니다. </th></tr>          
          <colgroup>
            <col width="100px">
            <col width="800px">
          </colgroup>
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q1</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 새로운 것을 배울 때, 그것에 대해 <span class="styleQuestionImpact">이야기 하는 것이</span> 도움이 된다.</td> 
                    <td><input name='Q1A' id='Q1A' type='hidden' value="Style-1-A 새로운 것을 배울 때, 그것에 대해 이야기 하는 것이 도움이 된다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A1A' value='Style-1-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 새로운 것을 배울 때, 그것에 대해 <span class="styleQuestionImpact">숙고(곰곰히 생각)하는 것이</span> 도움이 된다.</td> 
                    <td><input name='Q1B' id='Q1B' type='hidden' value="Style-1-B 새로운 것을 배울 때, 그것에 대해 숙고(곰곰히 생각)하는 것이 도움이 된다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A1B' value='Style-1-B " + i + "'>")
                 </script>
                 </td>    
                </tr>

                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q2</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 내가 만약 선생님이라면, <span class="styleQuestionImpact">객관적 사실 혹은 현실적 구조</span>를 가르치고 싶다.</td> 
                    <td><input name='Q2A' id='Q2A' type='hidden' value="Style-2-A 내가 만약 선생님이라면, 객관적 사실 혹은 현실적 구조를 가르치고 싶다."></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A2A' value='Style-2-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 내가 만약 선생님이라면, <span class="styleQuestionImpact">추상적인 개념이나 이론</span>을 가르치고 싶다.</td> 
                    <td><input name='Q2B' id='Q2B' type='hidden' value="Style-2-B 내가 만약 선생님이라면, 추상적인 개념이나 이론을 가르치고 싶다."></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A2B' value='Style-2-B " + i + "'>")
                 </script>
                 </td>    
                </tr>


                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q3</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 새로운 정보를 배울 때, <span class="styleQuestionImpact">그림, 도표, 그래프 또는 지도</span>를 사용하는 것이 좋다</td> 
                    <td><input name='Q3A' id='Q3A' type='hidden' value="Style-3-A 새로운 정보를 배울 떄, 그림, 도표, 그래프 또는 지도를 사용하는 것이 좋다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A3A' value='Style-3-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 새로운 정보를 배울 때, <span class="styleQuestionImpact">말이나 글로 된 언어적 정보</span>를 사용하는 것이 좋다.</td> 
                    <td><input name='Q3B' id='Q3B' type='hidden' value="Style-3-B 새로운 정보를 배울 떄, 말이나 글로 된 언어적 정보를 사용하는 것이 좋다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A3B' value='Style-3-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q4</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 <span class="styleQuestionImpact">부분 부분을 이해</span>한 후에 전체를 이해한다.</td> 
                    <td><input name='Q4A' id='Q4A' type='hidden' value="Style-4-A 나는 부분 부분을 이해한 후에 전체를 이해한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A4A' value='Style-4-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 먼저 <span class="styleQuestionImpact">전체를 이해하고 각</span> 부분들이 어떻게 어울리는지를 알게 된다.</td> 
                    <td><input name='Q4B' id='Q4B' type='hidden' value="Style-4-B 새로운 정보를 배울 떄, 말이나 글로 된 언어적 정보를 사용하는 것이 좋다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A4B' value='Style-4-B " + i + "'>")
                 </script>
                 </td>    
                </tr>

                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q5</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 숙제를 시작할 때, <span class="styleQuestionImpact">즉시 해결책을 생각</span>해 내려 한다.</td> 
                    <td><input name='Q5A' id='Q5A' type='hidden' value="Style-5-A 나는 숙제를 시작할 때, 즉시 해결책을 생각해 내려 한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A5A' value='Style-5-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 숙제를 시작할 때, <span class="styleQuestionImpact">일단 문제를 완벽히 이해</span>하려 한다.</td> 
                    <td><input name='Q5B' id='Q5B' type='hidden' value="Style-5-B 나는 숙제를 시작할 때, 일단 문제를 완벽히 이해하려 한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A5B' value='Style-5-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q6</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 <span class="styleQuestionImpact">실제가</span> 좋다.</td> 
                    <td><input name='Q6A' id='Q6A' type='hidden' value="Style-6-A 나는 실제가 좋다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A6A' value='Style-6-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 <span class="styleQuestionImpact">이론이</span> 좋다.</td> 
                    <td><input name='Q6B' id='Q6B' type='hidden' value="Style-6-B 나는 이론이 좋다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A6B' value='Style-6-B " + i + "'>")
                 </script>
                 </td>    
                </tr>                  
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q7</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 실제로 <span class="styleQuestionImpact">본 것을</span> 잘 기억한다.</td> 
                    <td><input name='Q7A' id='Q7A' type='hidden' value="Style-7-A 실제로 본 것을 잘 기억한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A7A' value='Style-7-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 실제로 <span class="styleQuestionImpact">들은 것</span>을 잘 기억한다.</td> 
                    <td><input name='Q7B' id='Q7B' type='hidden' value="Style-7-B 나는 실제로 들은 것을 잘 기억한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A7B' value='Style-7-B " + i + "'>")
                 </script>
                 </td>    
                </tr>                    
                
             <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q8</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 내가 원하는 수업은 수업 내용이<span class="styleQuestionImpact"> 명확하고 체계적인 순서로 가르치</span>는 것이다.</td> 
                    <td><input name='Q8A' id='Q8A' type='hidden' value="Style-8-A 내가 원하는 수업은 수업 내용이 명확하고 체계적인 순서로 가르치는 것이다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A8A' value='Style-8-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 내가 원하는 수업은 수업내용의 <span class="styleQuestionImpact"> 모습을 개괄한 뒤, 그것을 다른 주제에 연관</span>짓는 것이다.</td> 
                    <td><input name='Q8B' id='Q8B' type='hidden' value="Style-8-B 나는 실제로 들은 것을 잘 기억한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A8B' value='Style-8-B " + i + "'>")
                 </script>
                 </td>    
                </tr>      
              
             <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q9</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 내가 <span class="styleQuestionImpact">실제로 해봤던 것</span>을 더 쉽게 기억한다.</td> 
                    <td><input name='Q9A' id='Q9A' type='hidden' value="Style-9-A 나는 내가 실제로 해봤던 것을 더 쉽게 기억한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A9A' value='Style-9-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 내가 <span class="styleQuestionImpact">생각을 많이 해봤던 것</span>을 더 쉽게 기억한다.</td> 
                    <td><input name='Q9B' id='Q9B' type='hidden' value="Style-9-B 나는 내가 생각을 많이 해봤던 것을 더 쉽게 기억한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A9B' value='Style-9-B " + i + "'>")
                 </script>
                 </td>    
                </tr>

             <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q10</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 일을 할 때, 나는 그 일을 <span class="styleQuestionImpact">해결하는 한 가지 방법을 완벽히 마스터</span>한다.</td> 
                    <td><input name='Q10A' id='Q10A' type='hidden' value="Style-10-A 일을 할 때, 나는 그 일을 해결하는 한 가지 방법을 완벽히 마스터한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A10A' value='Style-10-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 일을 할 때, 나는 <span class="styleQuestionImpact">여러가지 새로운 방법을 찾으려고 노력</span>하는 편이다.</td> 
                    <td><input name='Q10B' id='Q10B' type='hidden' value="Style-10-B 나는 내가 생각을 많이 해봤던 것을 더 쉽게 기억한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A10B' value='Style-10-B " + i + "'>")
                 </script>
                 </td>    
                </tr>                
                    
             <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q11</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 어떤 자료를 볼 때 <span class="styleQuestionImpact">차트나 표 형식을 선호</span>한다.</td> 
                    <td><input name='Q11A' id='Q11A' type='hidden' value="Style-11-A 나는 어떤 자료를 볼 때 차트나 표형식을 선호한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A11A' value='Style-11-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 어떤 자료를 볼 때 <span class="styleQuestionImpact">내용을 요약한 글 형식을 선호</span>한다.</td> 
                    <td><input name='Q11B' id='Q11B' type='hidden' value="Style-11-B 나는 어떤 자료를 볼 때 내용을 요약한 글 형식을 선호한다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A11B' value='Style-11-B " + i + "'>")
                 </script>
                 </td>    
                </tr>                
                
             <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q12</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 새로운 내용을 배울 때, 나는 <span class="styleQuestionImpact">모르는 부분위주로 학습</span>한다.</td> 
                    <td><input name='Q12A' id='Q12A' type='hidden' value="Style-12-A 새로운 내용을 배울 때, 나는 모르는 부분위주로 학습한다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A12A' value='Style-12-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 새로운 내용을 배울 때, 나는 그 <span class="styleQuestionImpact">주제와 관계되는 주제를 찾아</span>본다.</td> 
                    <td><input name='Q12B' id='Q12B' type='hidden' value="Style-12-B 새로운 내용을 배울 때, 나는 그 주제와 관계되는 주제를 찾아본다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A12B' value='Style-12-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q13</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 나는 <span class="styleQuestionImpact">외향적인</span> 사람이라고 여겨지는 편이다.</td> 
                    <td><input name='Q13A' id='Q13A' type='hidden' value="Style-13-A 나는 외향적인 사람이라고 여겨지는 편이다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A13A' value='Style-13-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 나는 <span class="styleQuestionImpact">수줍음이 많은</span> 사람이라고 여겨지는 편이다.</td> 
                    <td><input name='Q13B' id='Q13B' type='hidden' value="Style-13-B 나는 수줍음이 많은 사람이라고 여겨지는 편이다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A13B' value='Style-13-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q14</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 내가 좋아하는 수업은 사실이나 자료 등 <span class="styleQuestionImpact">구체적인 내용을 중시</span>하는 수업이다.</td> 
                    <td><input name='Q14A' id='Q14A' type='hidden' value="Style-14-A 내가 좋아하는 수업은 사실이나 자료 등 구체적인 내용을 중시하는 수업이다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A14A' value='Style-14-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 내가 좋아하는 수업은 개념이나 이론 등 <span class="styleQuestionImpact">추상적인 내용을 중시</span>하는 수업이다.</td> 
                    <td><input name='Q14B' id='Q14B' type='hidden' value="Style-14-B 내가 좋아하는 수업은 개념이나 이론 등 추상적인 내용을 중시하는 수업이다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A14B' value='Style-14-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q15</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 기분 전환을 위해서 나는 <span class="styleQuestionImpact">TV나 유투브 또는 영화를 본다.</span></td> 
                    <td><input name='Q15A' id='Q15A' type='hidden' value="Style-15-A 기분 전환을 위해서 나는 TV나 유투브 또는 영화를 본다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A15A' value='Style-15-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 기분 전환을 위해서 나는 <span class="styleQuestionImpact">책을 읽는다.</span></td> 
                    <td><input name='Q15B' id='Q15B' type='hidden' value="Style-15-B 기분 전환을 위해서 나는 책을 읽는다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A15B' value='Style-15-B " + i + "'>")
                 </script>
                 </td>    
                </tr>
                
                <tr>
                    <td rowspan="4" style="padding-bottom: 20px; font-size: 20px; font-weight: bold; text-align: center"> Q16</td> 
                    <td style=" font-size: 17px; font-weight: bold;">a. 수업시작 시, 학습목표를 말씀해 주시는 것은 내게 <span class="styleQuestionImpact">약간</span> 도움이 된다.</td> 
                    <td><input name='Q16A' id='Q16A' type='hidden' value="Style-16-A 수업시작 시, 학습목표를 말씀해 주시는 것은 내게 약간 도움이 된다"></td>         
                </tr>
                <tr>
                <td style="padding-bottom: 15px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A16A' value='Style-16-A " + i + "'>")
                 </script>
                 </td>
                 </tr>
                 <tr>
                 <td style=" font-size: 17px; font-weight: bold;">b. 수업시작 시, 학습목표를 말씀해 주시는 것은 내게 <span class="styleQuestionImpact">큰</span> 도움이 된다.</td> 
                    <td><input name='Q16B' id='Q16B' type='hidden' value="Style-16-B 수업시작 시, 학습목표를 말씀해 주시는 것은 내게 큰 도움이 된다"></td>        
                </tr>
                <tr>
                <td style="padding-bottom: 40px;"> <script type="text/javascript">
                    for (i=1;i<=10;i++) document.write( i + "<input style='margin-right: 25px; margin-left: 7px;' type='radio' name='A16B' value='Style-16-B " + i + "'>")
                 </script>
                 </td>    
                </tr>                                          
                </table>
</div>
</div>
</div>

			<div style="margin: auto">
							<button  id="btnsumit" style="margin: inherit; background-color: #87CEFA" class="login100-form-btn" type="button" onclick="check()">
								제출 후 다음
							</button>
			</div>
</form>			
			
</body>

<script>
	document.getElementById('#A1A').on(function() {
		console.log($('input[name=A1A]:radio:checked').val());
	})
</script>
</html>
