package itall.survey.study.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import itall.survey.study.Service.ShabitsService;
import itall.survey.study.VO.ShabitsVO;



@Controller
public class ShabitsController {

	@Autowired 
	 private ShabitsService shabitsService;
	 @Autowired
	 private HttpServletRequest request;
	 
	 @RequestMapping(value = "/shabitssurvey", method = RequestMethod.POST)
		public String stylesurveyinsert(Model model, ShabitsVO VO) {
			
			HttpSession session = request.getSession();
			VO.setSurveyid((String) session.getAttribute("surveyid"));
			VO.setUserid((String) session.getAttribute("userid"));

			System.out.println("서브젝트" +VO.getUserid());
			//질문 등록여부 확인
			boolean questioninsert = shabitsService.checkquestion(VO);
			if(questioninsert == true) {
				shabitsService.questioninsert(VO);
			}
			//질문 등록여부 확인
			
			shabitsService.answerinsert(VO); 
			//styleService.answeranly(VO.getUserid());
			model.addAttribute("done", 1);
			return "./page4";
			//return "";
		}
}
