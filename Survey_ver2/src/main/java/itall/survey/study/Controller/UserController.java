package itall.survey.study.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import itall.survey.study.Service.UserService;
import itall.survey.study.VO.UserVO;


@Controller
public class UserController {


	 @Autowired 
	 private UserService userService;
	 @Autowired
	private HttpServletRequest request;
	
	
	@RequestMapping(value = "/survey1", method = RequestMethod.GET)
	//페이지 이동 
	public String page1() {
		System.out.println("컨트롤 1번 페이지");
		return "./page1";
	}
	//회원 정보 저장
	@RequestMapping(value = "/userinfosave", method = RequestMethod.POST)
	public String usersave(Model model, UserVO VO) {
		System.out.println("유저 정보 저장");
		String surveyid="";
		String surveyname =request.getParameter("schoolname");
		
		int surveycheck=userService.findsid(surveyname);
		
		if(surveycheck== 0) {
			userService.addsurveyid(surveyname);
			surveyid= Integer.toString(userService.findsurveyid(surveyname));
			System.out.println(surveyid);
			VO.setSurveyid(surveyid);
		} else {
			surveyid= Integer.toString(userService.findsurveyid(surveyname));
			VO.setSurveyid(surveyid);
		}
		
		VO.setUserbirthdate(request.getParameter("userbirth"));
		
		System.out.println("유저 정보보기 : "+VO);
		//받은 생일 정보 취합하여 저장
		//VO=userService.birth(VO);
		//받은 메일 정보 취합하여 저장
		//VO=userService.emaidadd(VO);
		//받은정보로 ID생성 - 고유한 ID 생성을 위해 스쿨 5자리 + 생일4자리 + 이름 +번호 4자리 
		//VO=userService.createuserid(VO);
		
		//surveyid 입력 20WIN == 1
		
		//고유 아이디 인지 확인
		boolean useridcheck = userService.checkuserid(VO);
		
		if(useridcheck) {
		System.out.println(VO);
		userService.insert(VO);
		
		VO.setUserid(userService.useridsave(VO));
		
		HttpSession session = request.getSession();
		session.setAttribute("userid", VO.getUserid());
		session.setAttribute("surveyid", VO.getSurveyid());
		session.setAttribute("curriculum", VO.getUsercurriculum());
		//model.addAttribute("userid", VO.getUserid());
		//model.addAttribute("surveyid", VO.getSurveyid());
		return "./page2";
		
		} else {
			model.addAttribute("idcheck", useridcheck);
			//return "redirect:/survey1";
			return "/page1";
		}
			
	}
	@RequestMapping(value = "/excel", method = RequestMethod.GET)
	public String excelsave() {
		System.out.println("엑셀 저장 컨트롤");
		userService.excelsave();
		return "redirect:./";
	}
	@RequestMapping(value = "/survey4", method = RequestMethod.GET)
	public String page4() {
		System.out.println("컨트롤 4번 페이지");
		return "./page4";
	}
	@RequestMapping(value = "/survey3", method = RequestMethod.GET)
	public String page3() {
		System.out.println("컨트롤 3번 페이지");
		return "./page3";
	}
}
