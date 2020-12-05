package itall.survey.study.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itall.survey.study.DAO.StyleDAO;
import itall.survey.study.VO.StyleVO;

@Service
public class StyleService {

	@Autowired
	private StyleDAO styleDAO;
	HashMap<String, Object> map = new HashMap<String, Object>();
	HashMap<String, Object> ansinfo = new HashMap<String, Object>();
	HashMap<String, Object> savestyle = new HashMap<String, Object>();

	//학습 스타일 질문 24개 존재하는지 확인
	public boolean checkquestion(StyleVO VO) {
		boolean questionadd = false;

		map.put("surveyid", VO.getSurveyid());
		map.put("questiontype", "style");

		int count = styleDAO.questioncheck(map);
		// 학습 스타일 질문 32개 맞는 지 확인 32개가 아니면 등록진행
		if (count != 32) {
			questionadd = true;
		}
		return questionadd;
	}

	//학습 스타일 질문 저장
	public void questioninsert(StyleVO VO) {
		String etc = "";
		String questiontype = "";
		String questionprpn = "";
		String questionnum = "";
		String question = "";
		int cut = 0;
		int cut1 = 0;
		int findq = 0;

		// 1번 A질문 저장
		cut = VO.getQ1A().indexOf(' ');
		etc = VO.getQ1A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questiontype = etc.substring(0, cut1);
		// System.out.println("questiontype : " + questiontype);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		// System.out.println("questionprpn : " + questionprpn);
		// questionnum = Character.toString(etc.charAt(cut1+1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		// System.out.println("questionnum : " + questionnum);
		question = VO.getQ1A().substring(cut + 1, VO.getQ1A().length());
		// System.out.println("question : " + question);

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 1번 B질문 저장
		cut = VO.getQ1B().indexOf(' ');
		etc = VO.getQ1B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ1B().substring(cut + 1, VO.getQ1B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 2번 A질문 저장
		cut = VO.getQ2A().indexOf(' ');
		etc = VO.getQ2A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ2A().substring(cut + 1, VO.getQ2A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 2번 B질문 저장
		cut = VO.getQ2B().indexOf(' ');
		etc = VO.getQ2B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ2B().substring(cut + 1, VO.getQ2B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 3번 A질문 저장
		cut = VO.getQ3A().indexOf(' ');
		etc = VO.getQ3A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ3A().substring(cut + 1, VO.getQ3A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 3번 B질문 저장
		cut = VO.getQ3B().indexOf(' ');
		etc = VO.getQ3B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ3B().substring(cut + 1, VO.getQ3B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 4번 A질문 저장
		cut = VO.getQ4A().indexOf(' ');
		etc = VO.getQ4A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ4A().substring(cut + 1, VO.getQ4A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 4번 B질문 저장
		cut = VO.getQ4B().indexOf(' ');
		etc = VO.getQ4B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ4B().substring(cut + 1, VO.getQ4B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 5번 A질문 저장
		cut = VO.getQ5A().indexOf(' ');
		etc = VO.getQ5A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ5A().substring(cut + 1, VO.getQ5A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 5번 B질문 저장
		cut = VO.getQ5B().indexOf(' ');
		etc = VO.getQ5B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ5B().substring(cut + 1, VO.getQ5B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 6번 A질문 저장
		cut = VO.getQ6A().indexOf(' ');
		etc = VO.getQ6A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ6A().substring(cut + 1, VO.getQ6A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 6번 B질문 저장
		cut = VO.getQ6B().indexOf(' ');
		etc = VO.getQ6B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ6B().substring(cut + 1, VO.getQ6B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 7번 A질문 저장
		cut = VO.getQ7A().indexOf(' ');
		etc = VO.getQ7A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ7A().substring(cut + 1, VO.getQ7A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 7번 B질문 저장
		cut = VO.getQ7B().indexOf(' ');
		etc = VO.getQ7B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ7B().substring(cut + 1, VO.getQ7B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 8번 A질문 저장
		cut = VO.getQ8A().indexOf(' ');
		etc = VO.getQ8A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ8A().substring(cut + 1, VO.getQ8A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 8번 B질문 저장
		cut = VO.getQ8B().indexOf(' ');
		etc = VO.getQ8B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ8B().substring(cut + 1, VO.getQ8B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 9번 A질문 저장
		cut = VO.getQ9A().indexOf(' ');
		etc = VO.getQ9A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ9A().substring(cut + 1, VO.getQ9A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 9번 B질문 저장
		cut = VO.getQ9B().indexOf(' ');
		etc = VO.getQ9B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ9B().substring(cut + 1, VO.getQ9B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 10번 A질문 저장
		cut = VO.getQ10A().indexOf(' ');
		etc = VO.getQ10A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ10A().substring(cut + 1, VO.getQ10A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 10번 B질문 저장
		cut = VO.getQ10B().indexOf(' ');
		etc = VO.getQ10B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ10B().substring(cut + 1, VO.getQ10B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 11번 A질문 저장
		cut = VO.getQ11A().indexOf(' ');
		etc = VO.getQ11A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ11A().substring(cut + 1, VO.getQ11A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 11번 B질문 저장
		cut = VO.getQ11B().indexOf(' ');
		etc = VO.getQ11B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ11B().substring(cut + 1, VO.getQ11B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// -------------------------------------------------------------------

		// 12번 A질문 저장
		cut = VO.getQ12A().indexOf(' ');
		etc = VO.getQ12A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ12A().substring(cut + 1, VO.getQ12A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 12번 B질문 저장

		cut = VO.getQ12B().indexOf(' ');
		etc = VO.getQ12B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);

		question = VO.getQ12B().substring(cut + 1, VO.getQ12B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		
		// 1201 질문 추가되아 아래 내용 추가됨
		
		// -------------------------------------------------------------------

		// 13번 A질문 저장
		cut = VO.getQ13A().indexOf(' ');
		etc = VO.getQ13A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ13A().substring(cut + 1, VO.getQ13A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 13번 B질문 저장

		cut = VO.getQ13B().indexOf(' ');
		etc = VO.getQ13B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);

		question = VO.getQ13B().substring(cut + 1, VO.getQ13B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}


		// -------------------------------------------------------------------

		// 14번 A질문 저장
		cut = VO.getQ14A().indexOf(' ');
		etc = VO.getQ14A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ14A().substring(cut + 1, VO.getQ14A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 14번 B질문 저장

		cut = VO.getQ14B().indexOf(' ');
		etc = VO.getQ14B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);

		question = VO.getQ14B().substring(cut + 1, VO.getQ14B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}


		// -------------------------------------------------------------------

		// 15번 A질문 저장
		cut = VO.getQ15A().indexOf(' ');
		etc = VO.getQ15A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ15A().substring(cut + 1, VO.getQ15A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 15번 B질문 저장

		cut = VO.getQ15B().indexOf(' ');
		etc = VO.getQ15B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);

		question = VO.getQ15B().substring(cut + 1, VO.getQ15B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}


		// -------------------------------------------------------------------

		// 16번 A질문 저장
		cut = VO.getQ16A().indexOf(' ');
		etc = VO.getQ16A().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);
		question = VO.getQ16A().substring(cut + 1, VO.getQ16A().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

		// 16번 B질문 저장

		cut = VO.getQ16B().indexOf(' ');
		etc = VO.getQ16B().substring(0, cut);
		cut1 = etc.indexOf('-');
		System.out.println("cut" + cut);
		System.out.println("etc" + etc);
		System.out.println("cut1" + cut1);
		questionprpn = Character.toString(etc.charAt(etc.length() - 1));
		questionnum = etc.substring(cut1 + 1, etc.length() - 2);

		question = VO.getQ16B().substring(cut + 1, VO.getQ16B().length());

		findq = styleDAO.findquestion(etc);
		if (findq == 0) {
			map.put("questionid", etc);
			map.put("questiontype", questiontype);
			map.put("question", question);
			map.put("questionprpn", questionprpn);
			map.put("questionnum", questionnum);
			map.put("surveyid", VO.getSurveyid());
			styleDAO.questionadd(map);
		}

	}

	//학습 스타일 답변 저장
	//학습 스타일 답변 저장
	   public void answerinsert(StyleVO VO) {
	      // int qcut=0;

	      // String questionid="";
	      String questionid1 = "";
	      String answer = "";

	      int qcut1 = 0;
	      String answertype = "";
	      String answerprpn = "";
	      String answernum = "";
	      String answerinfo = "";
	      // 1번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // 질문 또 저장
	      /*
	       * qcut = VO.getQ1A().indexOf(' '); questionid = VO.getQ1A().substring(0, qcut);
	       */
	      answer = VO.getA1A().split(" ")[1];

	      // 질문id 디비에서 받아오기
	      answerinfo = VO.getA1A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      System.out.println("답변 정보" + answerinfo);
	      System.out.println("답변에 타입" + answertype);
	      System.out.println("답변 구분" + answerprpn);
	      System.out.println("답변 번호" + answernum);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);
	      System.out.println("디비에서 가져온 qid : " + questionid1);

	      // System.out.println("답변입니다." + answer);
	      // System.out.println("질문 ID" + questionid);
	      // System.out.println(VO.getUserid());

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      

	      // 1번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA1B().split(" ")[1];
	      answerinfo = VO.getA1B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 2번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA2A().split(" ")[1];
	      answerinfo = VO.getA2A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 2번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA2B().split(" ")[1];
	      answerinfo = VO.getA2B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 3번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA3A().split(" ")[1];
	      answerinfo = VO.getA3A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 3번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA3B().split(" ")[1];
	      answerinfo = VO.getA3B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 4번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA4A().split(" ")[1];
	      answerinfo = VO.getA4A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      
	      // 4번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA4B().split(" ")[1];
	      answerinfo = VO.getA4B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 5번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA5A().split(" ")[1];
	      answerinfo = VO.getA5A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 5번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA5B().split(" ")[1];
	      answerinfo = VO.getA5B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 6번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA6A().split(" ")[1];
	      answerinfo = VO.getA6A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 6번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA6B().split(" ")[1];
	      answerinfo = VO.getA6B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 7번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA7A().split(" ")[1];
	      answerinfo = VO.getA7A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 7번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA7B().split(" ")[1];
	      answerinfo = VO.getA7B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 8번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA8A().split(" ")[1];
	      answerinfo = VO.getA8A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 8번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA8B().split(" ")[1];
	      answerinfo = VO.getA8B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 9번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA9A().split(" ")[1];
	      answerinfo = VO.getA9A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 9번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA9B().split(" ")[1];
	      answerinfo = VO.getA9B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 10번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA10A().split(" ")[1];
	      answerinfo = VO.getA10A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 10번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA10B().split(" ")[1];
	      answerinfo = VO.getA10B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 11번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA11A().split(" ")[1];
	      answerinfo = VO.getA11A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 11번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA11B().split(" ")[1];
	      answerinfo = VO.getA11B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 12번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA12A().split(" ")[1];
	      answerinfo = VO.getA12A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 12번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA12B().split(" ")[1];
	      answerinfo = VO.getA12B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      
	      //1201 질문 추가되어 추가
	      // 13번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA13A().split(" ")[1];
	      answerinfo = VO.getA13A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 13번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA13B().split(" ")[1];
	      answerinfo = VO.getA13B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      

	      // 14번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA14A().split(" ")[1];
	      answerinfo = VO.getA14A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      // 14번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA14B().split(" ")[1];
	      answerinfo = VO.getA14B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 15번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA15A().split(" ")[1];
	      answerinfo = VO.getA15A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 15번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA15B().split(" ")[1];
	      answerinfo = VO.getA15B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	      

	      // 16번 A 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA16A().split(" ")[1];
	      answerinfo = VO.getA16A().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }

	      // 16번 B 답변 저장(질문 ID, 답변, 유저ID, 답변 번호는 DB 자동 생성)

	      // answer 답변 저장,answerinfo 답변 정보관련 저장
	      // answerinfo를 통해 type, prpn, num 정보 확인.
	      answer = VO.getA16B().split(" ")[1];
	      answerinfo = VO.getA16B().split(" ")[0];
	      qcut1 = answerinfo.indexOf('-');
	      answertype = answerinfo.substring(0, qcut1);
	      answerprpn = Character.toString(answerinfo.charAt(answerinfo.length() - 1));
	      answernum = answerinfo.substring(qcut1 + 1, answerinfo.length() - 2);

	      // 디비에서 질문 ID 조회하기 위한 변수들 HASHMAP으로 전달. 받아온 값 questionid에 저장
	      ansinfo.put("answertype", answertype);
	      ansinfo.put("answerprpn", answerprpn);
	      ansinfo.put("answernum", answernum); 
	      ansinfo.put("surveyid", VO.getSurveyid());
	      questionid1 = styleDAO.findqid(ansinfo);

	      // 답변 저장을 위한 변수 HASHMAP으로 전달.
	      map.put("answer", answer);
	      map.put("questionid", questionid1);
	      map.put("userid", VO.getUserid());
	      if (styleDAO.answerCheck(map) != 1) {
	         styleDAO.answeradd(map);
	      } else {
	         styleDAO.answerUpdate(map);
	      }
	   }


	//학습 스타일 분석
	public void answeranly(String userid, String surveyid) {
		HashMap<String, Object> qidinfo = new HashMap<String, Object>();
		HashMap<String, Object> answer = new HashMap<String, Object>();
		String resultqid = "";
		int resultnum1 = 0, resultnum2 = 0, resultnum3 = 0, resultnum4 = 0;
		int act = 0, ref = 0, sen = 0, intu = 0, vis = 0, vrb = 0, seq = 0, glo = 0;
		String typear = "";
		String typesi = "";
		String typevv = "";
		String typesg = "";
		String arcal = "";
		String sical = "";
		String vvcal = "";
		String sgcal = "";

		//------활동형 숙고형 계산----------------------------------------------------------
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "1");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "5");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "9");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "13");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		act = resultnum1 + resultnum2 + resultnum3 + resultnum4 ;

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "1");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "5");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "9");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "13");
		qidinfo.put("surveyid", surveyid);
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		ref = resultnum1 + resultnum2 + resultnum3 + resultnum4;
		
		int ar = act - ref;
		if(ar>0) {
			typear  = "ACT";
			arcal = ar + "a";
			System.out.println("ACT"+act);
			System.out.println("REF"+ref);
			System.out.println("typear"+ typear);
			System.out.println("arcla" + arcal);
		}else if(ar<0) {
			typear  = "REF";
			arcal = ar + "b";
			System.out.println("ACT"+act);
			System.out.println("REF"+ref);
			System.out.println("typear"+ typear);
			System.out.println("arcla" + arcal);
		}else {
			typear  = "Blank";
			arcal = ar + "c";
			System.out.println("ACT"+act);
			System.out.println("REF"+ref);
			System.out.println("typear"+ typear);
			System.out.println("arcla" + arcal);
		}
		savestyle.put("act", act);
		savestyle.put("ref", ref);
		savestyle.put("typear", typear);
		savestyle.put("arcal", arcal);
		
		//------감각형 직관형 계산----------------------------------------------------------
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "2");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "6");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "10");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "14");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		sen = resultnum1 + resultnum2 + resultnum3 + resultnum4 ;

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "2");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "6");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "10");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "14");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		intu = resultnum1 + resultnum2 + resultnum3 + resultnum4;
		
		int si = sen - intu;
		if(si>0) {
			typesi  = "SEN";
			sical = si + "a";
		}else if(si<0) {
			typesi  = "INT";
			sical = si + "b";
		}else {
			typesi  = "Blank";
			sical = si + "c";
		}
		savestyle.put("sen", sen);
		savestyle.put("intu", intu);
		savestyle.put("typesi", typesi);
		savestyle.put("sical", sical);
		
		
		//------시각형 언어형 계산----------------------------------------------------------
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "3");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "7");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "11");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "15");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		vis = resultnum1 + resultnum2 + resultnum3 + resultnum4 ;

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "3");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "7");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "11");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "15");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		vrb = resultnum1 + resultnum2 + resultnum3 + resultnum4;
		
		int vv = vis - vrb;
		if(vv>0) {
			typevv  = "VIS";
			vvcal = vv + "a";
		}else if(vv<0) {
			typevv  = "VRB";
			vvcal = vv + "b";
		}else {
			typevv  = "Blank";
			vvcal = vv + "c";
		}
		savestyle.put("vis", vis);
		savestyle.put("vrb", vrb);
		savestyle.put("typevv", typevv);
		savestyle.put("vvcal", vvcal);
		
		
		//------순차형 총체형 계산----------------------------------------------------------
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "4");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "8");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "12");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "A");
		qidinfo.put("answernum", "16");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		seq = resultnum1 + resultnum2 + resultnum3 + resultnum4 ;

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "4");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum1 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "8");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum2 = Integer.parseInt(styleDAO.answerresult(answer));

		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "12");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum3 = Integer.parseInt(styleDAO.answerresult(answer));
		
		qidinfo.put("answertype", "Style");
		qidinfo.put("answerprpn", "B");
		qidinfo.put("answernum", "16");
		resultqid = styleDAO.findqid(qidinfo);

		answer.put("questionid", resultqid);
		answer.put("userid", userid);
		resultnum4 = Integer.parseInt(styleDAO.answerresult(answer));

		glo = resultnum1 + resultnum2 + resultnum3 + resultnum4;
		
		int sg = seq - glo;
		if(sg>0) {
			typesg  = "SEQ";
			sgcal = sg + "a";
		}else if(sg<0) {
			typesg  = "GLO";
			sgcal = sg + "b";
		}else {
			typesg  = "Blank";
			sgcal = sg + "c";
		}
		savestyle.put("seq", seq);
		savestyle.put("glo", glo);
		savestyle.put("typesg", typesg);
		savestyle.put("sgcal", sgcal);
		
		//--------------------학습 스타일 저장---------------------
		
		savestyle.put("userid", userid);
		styleDAO.lstyleadd(savestyle);
		
	}
	// 유저 스타일 설문 결과에서 TYPE이 'Blank'인 컬럼이 존재하는지 체크
    public boolean checkBlankType(StyleVO VO) {
        boolean existBlankType = (styleDAO.checkBlankType(VO.getUserid()) == 1)  ? true : false;
        return existBlankType;
    }
	
	
}
