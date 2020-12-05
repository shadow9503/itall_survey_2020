package itall.survey.study.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itall.survey.study.DAO.ShabitsDAO;
import itall.survey.study.VO.ShabitsVO;

@Service
public class ShabitsService {

	@Autowired
	private ShabitsDAO shabitsDAO;
	HashMap<String, Object> map = new HashMap<String, Object>();
	HashMap<String, Object> ansinfo = new HashMap<String, Object>();

	// 학습 스타일 질문 24개 존재하는지 확인
	public boolean checkquestion(ShabitsVO VO) {
		boolean questionadd = false;

		map.put("surveyid", VO.getSurveyid());
		map.put("questiontype", "shabits");

		int count = shabitsDAO.questioncheck(map);
		// 선호 과목 질문 18개 맞는 지 확인 18개가 아니면 등록진행
		if (count != 18) {
			questionadd = true;
		}
		return questionadd;
	}

	// 학습 스타일 질문 저장
	public void questioninsert(ShabitsVO VO) {
		String qinfo = "";
		String questiontype = "";
		String questionnum = "";
		String question = "";
		int findq = 0;

		// 공부 습관 1번 질문 저장
		qinfo = VO.getQ1().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ1().split(" ", 2)[1];

		System.out.println("qinfo" + qinfo);
		System.out.println("questiontype" + questiontype);
		System.out.println("questionnum" + questionnum);
		System.out.println("question" + question);

		findq = shabitsDAO.findquestion(qinfo);
		System.out.println("question" + question);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 2번 질문 저장
		qinfo = VO.getQ2().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ2().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 3번 질문 저장
		qinfo = VO.getQ3().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ3().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}
		// 공부 습관 4번 질문 저장
		qinfo = VO.getQ4().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ4().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 5번 질문 저장
		qinfo = VO.getQ5().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ5().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 6번 질문 저장
		qinfo = VO.getQ6().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ6().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 7번 질문 저장
		qinfo = VO.getQ7().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ7().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 8번 질문 저장
		qinfo = VO.getQ8().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ8().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 9번 질문 저장
		qinfo = VO.getQ9().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ9().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 10번 질문 저장
		qinfo = VO.getQ10().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ10().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 11번 질문 저장
		qinfo = VO.getQ11().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ11().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 12번 질문 저장
		qinfo = VO.getQ12().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ12().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 13번 질문 저장
		qinfo = VO.getQ13().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ13().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 14번 질문 저장
		qinfo = VO.getQ14().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ14().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 15번 질문 저장
		qinfo = VO.getQ15().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ15().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 16번 질문 저장
		qinfo = VO.getQ16().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ16().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 17번 질문 저장
		qinfo = VO.getQ17().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ17().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

		// 공부 습관 18번 질문 저장
		qinfo = VO.getQ18().split(" ", 2)[0];
		questiontype = qinfo.split("-")[0];
		questionnum = qinfo.split("-")[1];
		question = VO.getQ18().split(" ", 2)[1];

		findq = shabitsDAO.findquestion(qinfo);
		if (findq == 0) {
			map.put("questionid", qinfo);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			shabitsDAO.questionaddnp(map);
		}

	}

	// subject 답변 등록
	public void answerinsert(ShabitsVO VO) {
		String questionid = "";
		String answer = "";
		String answertype = "";
		String answernum = "";
		String answerinfo = "";

		answerinfo = VO.getA1().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA1().split(" ")[1];

		// 1번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		System.out.println("답변 정보" + answerinfo);
		System.out.println("답변에 타입" + answertype);
		System.out.println("답변 번호" + answernum);

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());
		questionid = shabitsDAO.findqid(ansinfo);
		System.out.println("디비에서 가져온 qid : " + questionid);

		// System.out.println("답변입니다." + answer);
		// System.out.println("질문 ID" + questionid);
		// System.out.println(VO.getUserid());

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		// 2번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA2().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA2().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		// 3번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA3().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA3().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum);
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		// 4번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA4().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA4().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 5번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA5().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA5().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 6번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA6().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA6().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 7번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA7().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA7().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 8번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA8().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA8().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 9번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA9().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA9().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 10번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA10().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA10().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 11번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA11().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA11().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 12번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA12().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA12().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 13번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA13().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA13().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 14번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA14().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA14().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 15번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA15().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA15().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		// 16번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA16().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA16().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		
		// 17번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA17().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA17().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

		// 18번 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)
		answerinfo = VO.getA18().split(" ")[0];
		answertype = answerinfo.split("-")[0];
		answernum = answerinfo.split("-")[1];
		answer = VO.getA18().split(" ")[1];

		// 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
		ansinfo.put("answertype", answertype);
		ansinfo.put("answernum", answernum); 
		ansinfo.put("surveyid", VO.getSurveyid());

		questionid = shabitsDAO.findqid(ansinfo);

		// 답변 저장을 위한 변수 HASHMAP으로 전달.
		map.put("answer", answer);
		map.put("questionid", questionid);
		map.put("userid", VO.getUserid());
		shabitsDAO.answeradd(map);

	}
}
