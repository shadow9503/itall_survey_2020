package itall.survey.study.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import itall.survey.study.Service.StyleService;
import itall.survey.study.VO.StyleVO;



@Controller
public class StyleController {

	 @Autowired 
	 private StyleService styleService;
	 @Autowired
	 private HttpServletRequest request;
	 
	 	//선호 과목 관련 설문 저장
		@RequestMapping(value = "/stylesurvey", method = RequestMethod.POST)
		public String stylesurveyinsert(Model model, StyleVO VO) {
			
			
			String msg = "";
			
			
			HttpSession session = request.getSession();
			VO.setSurveyid((String) session.getAttribute("surveyid"));
			VO.setUserid((String) session.getAttribute("userid"));

			System.out.println("스타일" + VO.getUserid());
			//질문 등록여부 확인
			boolean questioninsert = styleService.checkquestion(VO);
			if(questioninsert == true) {
				styleService.questioninsert(VO);
			}
			//질문 등록여부 확인
			
			styleService.answerinsert(VO); 
			styleService.answeranly(VO.getUserid(), VO.getSurveyid());
			
			// page2 스타일 설문 결과에서 'Blank' 타입 검사 존재하면 
            if(styleService.checkBlankType(VO)) {
                msg = "귀하의 점수 신뢰도가 부정확합니다. 다시 작성해주세요.";
                model.addAttribute("alertMsg", msg);
                return "/page2";
            }
			
			return "./page3";
			
		}
			
			
		
		
}
