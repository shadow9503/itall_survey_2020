package itall.survey.study.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itall.survey.study.VO.UserVO;


@Repository
public class UserDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Transactional
	public void insert(UserVO userVO) {
		sqlSessionTemplate.insert("userinfoadd", userVO);
	}
	public UserVO useridcheck(UserVO userVO) {
		return sqlSessionTemplate.selectOne("usericcheck", userVO);
		
	}
	public void excelsave() {
		sqlSessionTemplate.selectOne("dbsave");
		
	}
	public String useridsave(UserVO userVO) {
		return sqlSessionTemplate.selectOne("userid", userVO);
		
	}
	public int findsid(String surveyname) {
		return sqlSessionTemplate.selectOne("findsid", surveyname);
	}	
	public int findsurveyid(String surveyname) {
		return sqlSessionTemplate.selectOne("findsurveyid", surveyname);
	}
	public void addsurveyid(String surveyname) {
		sqlSessionTemplate.insert("addsurveyid", surveyname);
	}
	
}
