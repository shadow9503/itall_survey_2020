<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
		<title>설문 1/4</title>
	</head>
	<body>
		<c:if test="${idcheck == false}">
			<script>
				alert('동일한 정보로 설문조사한 이력이 있습니다.');
				window.close();
			</script>
		</c:if>
		
		<header class="navbar navbar-dark bg-dark">
			<section class="container">
				<a class="navbar-brand">
					<img src="https://dev.itall.com/img/common/logo/logo_sparta.png" />
				</a>
			</section>
		</header>
		
		<main class="container pt-4">
			<section class="jumbotron">
				<h2>설문에 응해주셔서 감사합니다.</h2>
				<p class="lead">
					본 설문은 원생 분들에게 더 적합하고 개인화, 최적화된 교육 컨텐츠와 교육 프로그램을 제공하기 위한 설문입니다.
				</p>
				<hr />
				<p>
					등록한 이메일로 본인의 성격분석에 따른 학습성향 및 학습성과 향상에 관한 보고서를 송부해 드릴예정입니다, 감사합니다.
				</p>
			</section>
			
			<h2>개인정보 확인</h2>
			
			<hr />
		
			<form name="page1" action="./userinfosave" method="post" autocomplete="off">
				<input type="hidden" name="schoolname" value="20WIN" />
				<section class="form-group row">
					<label for="inputCenter" class="col-sm-2 col-form-label">센터명</label>
					<section class="col-sm-10">
						<select class="form-control" id="inputCenter" name="centername" required>
							<option value="" selected disabled hidden>선택해주세요</option>
							<option value="부천센터">부천센터</option>
							<option value="진주센터">진주센터</option>
							<option value="은평서대문센터">은평서대문센터</option>
							<option value="천안센터">천안센터</option>
							<option value="청주센터">청주센터</option>
							<option value="제주센터">제주센터</option>
							<option value="안양 평촌센터">안양 평촌센터</option>
							<option value="목동센터 2관">목동센터 2관</option>
							<option value="강동센터">강동센터</option>
							<option value="산본센터">산본센터</option>
							<option value="창원 상남센터">창원 상남센터</option>
							<option value="신촌센터">신촌센터</option>
							<option value="강남센터">강남센터</option>
							<option value="대전 둔산센터">대전 둔산센터</option>
							<option value="대구 수성구센터">대구 수성구센터</option>
							<option value="목동센터">목동센터</option>
							<option value="대치센터">대치센터</option>
							<option value="일산 백마센터">일산 백마센터</option>
							<option value="수원 영통센터">수원 영통센터</option>
							<option value="부산대센터">부산대센터</option>
							<option value="분당 수내센터">분당 수내센터</option>
							<option value="구리 남양주센터">구리 남양주센터</option>
							<option value="부산 센텀센터">부산 센텀센터</option>
							<option value="노원중계센터">노원중계센터</option>
							<option value="인천 부평센터">인천 부평센터</option>
							<option value="노량진센터">노량진센터</option>
							<option value="부산 경성대센터">부산 경성대센터</option>
							<option value="인천 연수송도센터">인천 연수송도센터</option>
							<option value="광주 충장로센터">광주 충장로센터</option>
							<option value="분당 수내센터 2관">분당 수내센터 2관</option>
							<option value="분당 정자센터">분당 정자센터</option>
							<option value="전주 전북대센터">전주 전북대센터</option>
							<option value="울산 옥동센터">울산 옥동센터</option>
							<option value="부산 서면센터">부산 서면센터</option>
							<option value="대구 동성로센터">대구 동성로센터</option>
							<option value="부산 화명센터">부산 화명센터</option>
							<option value="용인 수지센터">용인 수지센터</option>
							<option value="노량진센터 수능관">노량진센터 수능관</option>
							<option value="의정부센터">의정부센터</option>
							<option value="인천 청라센터">인천 청라센터</option>
							<option value="대전 유성센터">대전 유성센터</option>
							<option value="안산센터">안산센터</option>
							<option value="광명센터">광명센터</option>
							<option value="강서센터">강서센터</option>
							<option value="신림센터">신림센터</option>
							<option value="중화산센터">중화산센터</option>
							<option value="평택센터">평택센터</option>
							<option value="송파센터">송파센터</option>
							<option value="잇올센터">잇올센터</option>
							<option value="대구 수성구센터 2관">대구 수성구센터 2관</option>
							<option value="피스톤S">피스톤S</option>
							<option value="정자센터 2관">정자센터 2관</option>
							<option value="포항센터">포항센터</option>			
						</select>
					</section>
				</section>
				<section class="form-group row">
					<label for="inputName" class="col-sm-2 col-form-label">이름</label>
					<section class="col-sm-10">
						<input type="text" class="form-control" id="inputName" name="username" placeholder="홍길동" aria-describedby="nameHelp" required />
    					<small id="nameHelp" class="form-text text-muted">입력은 한글만 허용됩니다</small>
					</section>
				</section>
				<section class="form-group row">
					<label for="inputPhone" class="col-sm-2 col-form-label">휴대폰 번호</label>
					<section class="col-sm-10">
						<input type="tel" class="form-control" id="inputPhone" name="userphone" placeholder="01012345678" maxlength="11" onkeyup="this.value=this.value.replace(/[^0-9]/g,'');" aria-describedby="phoneHelp" required />
    					<small id="phoneHelp" class="form-text text-muted">(-)를 제외한 숫자만 입력해주세요</small>
					</section>
				</section>
				<section class="form-group row">
					<label for="inputMail" class="col-sm-2 col-form-label">이메일</label>
					<section class="col-sm-10">
						<input type="email" class="form-control" id="inputMail" name="usermail" placeholder="example@email.com" aria-describedby="mailHelp" required />
    					<small id="mailHelp" class="form-text text-muted">자주 사용하는 이메일 주소를 입력해주세요</small>
					</section>
				</section>
				<section class="form-group row">
					<label for="inputGender" class="col-sm-2 col-form-label">성별</label>
					<section class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usergender" id="genderRadio1" value="M" required />
							<label class="form-check-label" for="genderRadio1">남성</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usergender" id="genderRadio2" value="F" required />
							<label class="form-check-label" for="genderRadio2">여성</label>
						</div>
					</section>
				</section>
				<section class="form-group row">
					<label for="inputBirth" class="col-sm-2 col-form-label">생일</label>
					<section class="col-sm-10">
						<input type="date" class="form-control" id="inputBirth" name="userbirth" max="2003-12-31" required />
					</section>
				</section>
				<section class="form-group row">
					<label for="inputCurriculum" class="col-sm-2 col-form-label">계열</label>
					<section class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usercurriculum" id="curriculumRadio1" value="문과" required />
							<label class="form-check-label" for="curriculumRadio1">문과</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usercurriculum" id="curriculumRadio2" value="이과" required />
							<label class="form-check-label" for="curriculumRadio2">이과</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usercurriculum" id="curriculumRadio3" value="예능" required />
							<label class="form-check-label" for="curriculumRadio3">예능</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="usercurriculum" id="curriculumRadio4" value="체능" required />
							<label class="form-check-label" for="curriculumRadio4">체능</label>
						</div>
					</section>
				</section>
				
				<hr />
				
				<button class="btn btn-info">다음</button>
			</form>
		</main>
		
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
	</body>
</html>
