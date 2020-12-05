package itall.survey.study.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import itall.survey.study.Service.SubjectService;
import itall.survey.study.VO.SubjectVO;



@Controller
public class SubjectCountroller {

	
	@Autowired 
	 private SubjectService subjectService;
	 @Autowired
	private HttpServletRequest request;
	 
	 
	 @RequestMapping(value = "/subjectsurvey", method = RequestMethod.POST)
		public String stylesurveyinsert(Model model, SubjectVO VO) {
						
			HttpSession session = request.getSession();
			VO.setSurveyid((String) session.getAttribute("surveyid"));
			VO.setUserid((String) session.getAttribute("userid"));

			String curriculum = (String) session.getAttribute("curriculum");
			System.out.println("과 정보 확인"+curriculum);
			if(curriculum == "이과") {
				VO.setSelsubo(request.getParameter("selsuboe"));
				VO.setSelsubt(request.getParameter("selsubte"));
				VO.setSelsubo1(request.getParameter("selsuboe1"));
				VO.setSelsubop(request.getParameter("selsuboep"));
				VO.setSelsubt1(request.getParameter("selsubte1"));
				VO.setSelsubtp(request.getParameter("selsubtep"));
			}else if (curriculum == "문과") {
				VO.setSelsubo(request.getParameter("selsubom"));
				VO.setSelsubt(request.getParameter("selsubtm"));
				VO.setSelsubo1(request.getParameter("selsubom1"));
				VO.setSelsubop(request.getParameter("selsubomp"));
				VO.setSelsubt1(request.getParameter("selsubtm1"));
				VO.setSelsubtp(request.getParameter("selsubtmp"));
			}else {
				VO.setSelsubo(request.getParameter("selsubog"));
				VO.setSelsubt(request.getParameter("selsubtg"));
				VO.setSelsubo1(request.getParameter("selsubog1"));
				VO.setSelsubop(request.getParameter("selsubogp"));
				VO.setSelsubt1(request.getParameter("selsubtg1"));
				VO.setSelsubtp(request.getParameter("selsubtgp"));
			}
			
			System.out.println("3페이지 정보 저장 전:" +VO);
			subjectService.userrecordadd(VO);
			
			return "./page4";
			//return "";
		}
	 
}
