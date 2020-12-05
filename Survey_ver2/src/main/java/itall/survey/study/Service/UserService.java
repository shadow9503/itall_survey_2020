package itall.survey.study.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itall.survey.study.DAO.UserDAO;
import itall.survey.study.VO.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	// 아이디 등록 되어 있는지 개수 확인
	public int findsid(String surveyname){
		int surveyidcheck = userDAO.findsid(surveyname);
		
		return surveyidcheck;
	}
	
	public int findsurveyid(String surveyname){
		int surveyid = userDAO.findsurveyid(surveyname);
		
		return surveyid;
	}
	public void addsurveyid(String surveyname){
		userDAO.addsurveyid(surveyname);
	}
	
	
	//받은정보로 생년월일 생성
	public UserVO birth(UserVO userVO) {
	String birth = userVO.getBirth1()+"."+userVO.getBirth2()+"."+userVO.getBirth3();
	userVO.setUserbirthdate(birth);
	System.out.println("생일 저장 값 : " + userVO.getUserbirthdate());	
	return userVO;		
	}
	
	//받은 정보로 메일 정보 합치기
	public UserVO emaidadd(UserVO VO) {
		System.out.println(VO.getEmail2());
		
		if(VO.getEmail2() == null) {
		String mailsave1 = VO.getEmail1()+"@"+VO.getDomain();
		VO.setUsermail(mailsave1);
		System.out.println("메일 저장 값1 : " + VO.getUsermail());
		System.out.println(VO);
		} else {
		String mailsave2 = VO.getEmail1()+"@"+VO.getEmail2();
		VO.setUsermail(mailsave2);
		System.out.println("메일 저장 값2 : " + VO.getUsermail());
		System.out.println(VO);
		}	
	return VO;	
	}
	
	//받은 정보로 id만들기
	//아이디 자동 생성으로 변경
	public UserVO createuserid(UserVO userVO) {
		String month = "";
		String day ="";
		
		//생일 월 이 한자리 일때 앞에 0추가
		if(userVO.getBirth2().length() == 1) {
			month = "0" + userVO.getBirth2();
		} else {
			month = userVO.getBirth2();
		}
		//생일 일 이 한자리 일때 앞에 0추가
		if(userVO.getBirth3().length() == 1) {
			day = "0" + userVO.getBirth3();
		}else {
			day = userVO.getBirth3();
		}
		
		//핸드폰 뒷자리 4개 받기
		String phone = userVO.getUserphone().substring(userVO.getUserphone().length()-4, userVO.getUserphone().length());
		
		
		//user 아이디 : 생성 스쿨명 + 생일 + 이름+ 핸드폰 뒤 4자리
		userVO.setUserid(userVO.getSchoolname() + month + day +userVO.getUsername()+ phone);
		System.out.println(userVO.getUserid());
	return userVO;	
	}

	//동일id 존재 여부 확인하기
	public boolean checkuserid(UserVO userVO){		
	boolean checkid = true;
	UserVO idcheckVO = new UserVO();

	idcheckVO = userDAO.useridcheck(userVO);
	
	//사용가능하면 true 동일 id가 존재하면 false
	if(idcheckVO != null){
		checkid = false;
	}
	
	return checkid;
	}
	
	public void insert(UserVO userVO) {
		userDAO.insert(userVO);
	}
	
	public void excelsave(){
		System.out.println("db모튼 파일 저장");
		
	}
	public String useridsave(UserVO userVO) {
		String userid=userDAO.useridsave(userVO);
		return userid;
	}
}
