package itall.survey.study.VO;

import org.springframework.stereotype.Component;

@Component
public class UserVO {

	private String userid;
	private String username;
	private String userphone;
	private String userbirthdate;
	private String usergender;
	private String usermail;
	private String usercurriculum;
	private String birth1;
	private String birth2;
	private String birth3;
	private String email1;
	private String email2;
	private String domain;
	private String schoolname;
	private String surveyid;
	private String centername;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserbirthdate() {
		return userbirthdate;
	}
	public void setUserbirthdate(String userbirthdate) {
		this.userbirthdate = userbirthdate;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUsercurriculum() {
		return usercurriculum;
	}
	public void setUsercurriculum(String usercurriculum) {
		this.usercurriculum = usercurriculum;
	}
	public String getBirth1() {
		return birth1;
	}
	public void setBirth1(String birth1) {
		this.birth1 = birth1;
	}
	public String getBirth2() {
		return birth2;
	}
	public void setBirth2(String birth2) {
		this.birth2 = birth2;
	}
	public String getBirth3() {
		return birth3;
	}
	public void setBirth3(String birth3) {
		this.birth3 = birth3;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getSurveyid() {
		return surveyid;
	}
	public void setSurveyid(String surveyid) {
		this.surveyid = surveyid;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", username=" + username + ", userphone=" + userphone + ", userbirthdate="
				+ userbirthdate + ", usergender=" + usergender + ", usermail=" + usermail + ", usercurriculum="
				+ usercurriculum + ", birth1=" + birth1 + ", birth2=" + birth2 + ", birth3=" + birth3 + ", email1="
				+ email1 + ", email2=" + email2 + ", domain=" + domain + ", schoolname=" + schoolname + ", surveyid="
				+ surveyid + ", centername=" + centername + "]";
	}
	
	
	
}
