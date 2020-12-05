<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.show {
		display: flex;
	}
	.hide {
		display: none;
	}
	#info { 
       width: 100%;
       height: 100%;
       position: fixed;
       align-items: center;
       flex-direction: column;
       justify-content: center;
       top: 0;
       left: 0;
       background-color: white;
       z-index: 99;
   } 
   #info-image { 
  	  width: 100%;
      position: relative;
      z-index: 100;
   }
   #info-text {
   	  margin-top: 15px;
   	  padding: 10px;'
      position: relative;
      background-color: #cecece;
      top: 5%;
      z-index: 100; 
      color: red;
      font-size: 20px;
      border-radius: 20px
      
   }
</style>
<meta charset="UTF-8">
<title>설문 4/4</title>
<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
<script src="./resources/js/jquery-latest.min.js"></script>
<script>
	$(document).ready(function() {
		var done = '${done}';
		if (done) {
			showInfo();
		}

	})

	var doubleTapCheck = false;

	function check() {
		if (doubleTapCheck) {
			return false;
		}

		if ($("input[name=A1]:radio:checked").length < 1) {
			alert("Q1 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A2]:radio:checked").length < 1) {
			alert("Q2 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A3]:radio:checked").length < 1) {
			alert("Q3 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A4]:radio:checked").length < 1) {
			alert("Q4 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A5]:radio:checked").length < 1) {
			alert("Q5 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A6]:radio:checked").length < 1) {
			alert("Q6 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A7]:radio:checked").length < 1) {
			alert("Q7 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A8]:radio:checked").length < 1) {
			alert("Q8 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A9]:radio:checked").length < 1) {
			alert("Q9 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A10]:radio:checked").length < 1) {
			alert("Q10 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A11]:radio:checked").length < 1) {
			alert("Q11 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A12]:radio:checked").length < 1) {
			alert("Q12 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A13]:radio:checked").length < 1) {
			alert("Q13 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A14]:radio:checked").length < 1) {
			alert("Q14 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A15]:radio:checked").length < 1) {
			alert("Q15 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A16]:radio:checked").length < 1) {
			alert("Q16 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A17]:radio:checked").length < 1) {
			alert("Q17 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}
		if ($("input[name=A18]:radio:checked").length < 1) {
			alert("Q18 질문에 대한 답변이 누락되었습니다. ");
			return false;
		}

		btn = document.getElementById('btnsumit');
		btn.disabled = 'disabled';
		btn.style.backgroundColor = 'grey';
		showLoadingProgress();

		doubleTapCheck = true;

		document.getElementById('page4').submit();

	}

	function showInfo() {
		document.getElementById("info").setAttribute('class', 'show');
		document.getElementById("info-image").setAttribute('class', '');
		document.getElementById("info-text").setAttribute('class', '');

	}

	function showLoadingProgress() {
		document.getElementById("loading").setAttribute('class', '');
		document.getElementById("loading-image").setAttribute('class', '');
		document.getElementById("loading-text").setAttribute('class', '');
	}

	function finishSurvey() {
		window.close();
	}
</script>

</head>
<body>

	<c:if test="${done == '1'}">
		<script>
			/* showInfo();  */
		</script>
	</c:if>
	<div id="loading" class="hide">
		<img id="loading-image" class="hide" src="./resources/img/loader-white.gif" alt="Loading..." />
		<span id="loading-text" class="hide"> 로딩중...</span>
	</div>
	<div id="info" class="hide">
		<img id="info-image" class="hide" src="./resources/img/info.png" />
		<button id="info-text" class="hide" onclick="finishSurvey()">설문조사 제출</button>
	</div>

	<form id="page4" name="page4" action="./shabitssurvey" method="post"
		autocomplete="off">


		<div class="limiter">
			<div class="container-login100">
				<div class="wrap-login100">
					<table>
						<tr>
							<th colspan="2" align="left"
								style="font-size: 19px; padding-bottom: 30px;">다음 질문들도
								1~10점 중 답변해주시면 됩니다. 자신이 느끼는 강도를 점수로 직접 마킹하세요.<br /> ( 1점 : 매우
								아니다 ~ 10점 : 매우 그렇다 )
							</th>
						</tr>
						<colgroup>
							<col width="150px">
							<col width="600px">
						</colgroup>
						<tr>
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q1</td>
							<td style="font-size: 17px; font-weight: bold;">전체를 먼저 파악하고
								공부한다</td>
							<td><input name='Q1' id='Q1' type='hidden'
								value="Shabits-1 전체를 먼저 파악하고 공부한다 "></td>
						</tr>
						<tr>
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input style='margin-right: 20px; margin-left: 7px;' type='radio' name='A1' value='Shabits-1 "+ i + "'>")
							</script></td>
						</tr>

						<tr>
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q2</td>
							<td style="font-size: 17px; font-weight: bold;">단계별로 이해해야 다음
								공부 영역으로 넘어간다.</td>
							<td><input name='Q2' id='Q2' type='hidden'
								value="Shabits-2 단계별로 이해해야 다음 공부 영역으로 넘어간다."></td>
						</tr>
						<tr>
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input style='margin-right: 20px; margin-left: 7px;' type='radio' name='A2' value='Shabits-2 "+ i + "'>")
							</script></td>
						</tr>
						<tr>
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q3</td>
							<td style="font-size: 17px; font-weight: bold;">공부한 내용을 대부분
								머릿속으로 떠올리거나, 말로 반복해보거나, 다시 쓰면서 정리해본다.</td>
							<td><input name='Q3' id='Q3' type='hidden'
								value="Shabits-3 공부한 내용을 대부분 머릿속으로 떠올리거나, 말로 반복해보거나, 다시 쓰면서 정리해본다."></td>
						</tr>
						<tr>
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input style='margin-right: 20px; margin-left: 7px;' type='radio' name='A3' value='Shabits-3 "+ i + "'>")
							</script></td>
						</tr>
						<tr>
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q4</td>
							<td style="font-size: 17px; font-weight: bold;">공부하다가 모르는 점은
								바로 찾아본다.</td>
							<td><input name='Q4' id='Q4' type='hidden'
								value="Shabits-4 공부하다가 모르는 점은 바로 찾아본다."></td>
						</tr>
						<tr>
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input style='margin-right: 20px; margin-left: 7px;' type='radio' name='A4' value='Shabits-4 "+ i + "'>")
							</script></td>
						</tr>


						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q5</td>
							<td style="font-size: 17px; font-weight: bold;">공부한 것에 대해 다른
								사람과 토의, 논의를 나누면 도움이 된다.</td>
							<td><input name='Q5' id='Q5' type='hidden'
								value="Shabits-5 공부한 것에 대해 다른 사람과 토의, 논의를 나누면 도움이 된다."></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A5' value='Shabits-5 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q6</td>
							<td style="font-size: 17px; font-weight: bold;">다른 사람이 내 공부
								상황이나 생각하는 정답에 대해 평가해주는 게 공부에 도움이 된다.</td>
							<td><input name='Q6' id='Q6' type='hidden'
								value="Shabits-6 다른 사람이 내 공부 상황이나 생각하는 정답에 대해 평가해주는 게 공부에 도움이 된다."></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A6' value='Shabits-6 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q7</td>
							<td style="font-size: 17px; font-weight: bold;">나는 학습 계획을
								구체적으로 짜며 공부를 한다.</td>
							<td><input name='Q7' id='Q7' type='hidden'
								value="Shabits-7 나는 학습 계획을 구체적으로 짜며 공부를 한다."></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A7' value='Shabits-7 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q8</td>
							<td style="font-size: 17px; font-weight: bold;">나는 공부에 있어서,
								과목이나 공부할 영역에 대한 구체적인 <br />우선순위가 있다.
							</td>
							<td><input name='Q8' id='Q8' type='hidden'
								value="Shabits-8 나는 공부에 있어서, 과목이나 공부할 영역에 대한 구체적인 우선순위가 있다."></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A8' value='Shabits-8 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q9</td>
							<td style="font-size: 17px; font-weight: bold;">나는 의지적으로,
								구체적으로 집중력을 높이기 위해 공부 전후로 <br />노력을 한다 (휴식, 명상, 나만의 방법 등)
							</td>
							<td><input name='Q9' id='Q9' type='hidden'
								value="Shabits-9 나는 의지적으로, 구체적으로 집중력을 높이기 위해 공부 전후로 노력을 한다 (휴식, 명상, 나만의 방법 등)"></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A9' value='Shabits-9 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q10</td>
							<td style="font-size: 17px; font-weight: bold;">나는 주로 실제 내가
								계획한 공부 계획대로 공부를 한다.</td>
							<td><input name='Q10' id='Q10' type='hidden'
								value="Shabits-10 나는 주로 실제 내가 계획한 공부 계획대로 공부를 한다."></td>
						</tr>
						<tr class="Literature">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='lradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A10' value='Shabits-10 "+ i + "'>")
							</script></td>
						</tr>


						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q11</td>
							<td style="font-size: 17px; font-weight: bold;">공부하는 데 단순히
								글보다는 시각, 청각 자료가 있으면 좋다.</td>
							<td><input name='Q11' id='Q11' type='hidden'
								value="Shabits-11 공부하는 데 단순히 글보다는 시각, 청각 자료가 있으면 좋다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A11' value='Shabits-11 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q12</td>
							<td style="font-size: 17px; font-weight: bold;">나는 공부를 할 때
								정보나 내용에 틀이 잘 잡혀 있으면 (목차, 표 등) 공부에 도움이 된다.</td>
							<td><input name='Q12' id='Q12' type='hidden'
								value="Shabits-12 나는 공부를 할 때 정보나 내용에 틀이 잘 잡혀 있으면 (목차, 표 등) 공부에 도움이 된다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A12' value='Shabits-12 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q13</td>
							<td style="font-size: 17px; font-weight: bold;">다른 사람과 같이
								공부하면 (단순히 같이 앉는 것 포함) <br />공부에 도움이 된다.
							</td>
							<td><input name='Q13' id='Q13' type='hidden'
								value="Shabits-13 다른 사람과 같이 공부하면 (단순히 같이 앉는 것 포함) 공부에 도움이 된다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A13' value='Shabits-13 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q14</td>
							<td style="font-size: 17px; font-weight: bold;">암기보단 이해하는
								학습이 나에게 더 맞는다.</td>
							<td><input name='Q14' id='Q14' type='hidden'
								value="Shabits-14 암기보단 이해하는 학습이 나에게 더 맞는다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A14' value='Shabits-14 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q15</td>
							<td style="font-size: 17px; font-weight: bold;">나는 공부한 내용에
								대해 때때로 더 한발짝 나가서 생각하곤 한다.</td>
							<td><input name='Q15' id='Q15' type='hidden'
								value="Shabits-15 나는 공부한 내용에 대해 때때로 더 한발짝 나가서 생각하곤 한다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A15' value='Shabits-15 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q16</td>
							<td style="font-size: 17px; font-weight: bold;">나는 내가 관심 있는
								분야나, 재능 면의 잠재성이 다양하다고 <br />생각한다.
							</td>
							<td><input name='Q16' id='Q16' type='hidden'
								value="Shabits-16 나는 내가 관심 있는 분야나, 재능 면의 잠재성이 다양하다고 생각한다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A16' value='Shabits-16 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q17</td>
							<td style="font-size: 17px; font-weight: bold;">나는 나만의 공간,
								나만의 환경이 갖추어지면 공부를 더 잘한다<br />(폐쇄적 공간)
							</td>
							<td><input name='Q17' id='Q17' type='hidden'
								value="Shabits-17 나는 나만의 공간, 나만의 환경이 갖추어지면 공부를 더 잘한다(폐쇄적 공간)"></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(i
													+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A17' value='Shabits-17 "+ i + "'>")
							</script></td>
						</tr>

						<tr class="science">
							<!-- style="display:none;"> -->
							<td rowspan="2"
								style="padding-bottom: 20px; font-size: 25px; font-weight: bold;">
								Q18</td>
							<td style="font-size: 17px; font-weight: bold;">공부에 있어서 늘
								새로운 경험이나 감정이 나한테 중요하다.</td>
							<td><input name='Q18' id='Q18' type='hidden'
								value="Shabits-18 공부에 있어서 늘 새로운 경험이나 감정이 나한테 중요하다."></td>
						</tr>
						<tr class="science">
							<!-- style="display:none;"> -->
							<td style="padding-bottom: 20px;"><script
									type="text/javascript">
								for (i = 1; i <= 10; i++)
									document
											.write(
													i
															+ "<input class='sradio' style='margin-right: 20px; margin-left: 7px;' type='radio' name='A18' value='Shabits-18 "+ i + "'>")
							</script></td>
						</tr>
					</table>
				</div>
			</div>
		</div>

		<div style="margin: auto">
			<button id='btnsumit'
				style="margin: inherit; background-color: #87CEFA"
				class="login100-form-btn" type="button" onclick="check()">
				제출</button>
		</div>
	</form>
</body>
</html>
