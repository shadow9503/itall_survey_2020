package itall.survey.study.DAO;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class StyleDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int questioncheck (HashMap<String, Object> map) {
		return sqlSessionTemplate.selectOne("questioncheck", map);		
	}
	
	public void questionadd (HashMap<String, Object> map) {
		sqlSessionTemplate.insert("questionadd", map);
	}
	
	public int findquestion (String questionid) {
		System.out.println("다오 질문있는지 확인"+questionid);
		return sqlSessionTemplate.selectOne("findqcount", questionid);		
	}

	public void answeradd (HashMap<String, Object> map) {
		sqlSessionTemplate.insert("answeradd", map);
	}
	public String findqid (HashMap<String, Object> ansinfo) {
		return sqlSessionTemplate.selectOne("findqid", ansinfo);
	}
	public String answerresult (HashMap<String, Object> findanswer) {
		return sqlSessionTemplate.selectOne("answerresult", findanswer);
	}
	public void lstyleadd(HashMap<String, Object> savestyle) {
		sqlSessionTemplate.update("lstyle", savestyle);
	}
	public int checkBlankType (String userid) {
        return sqlSessionTemplate.selectOne("checkBlankType", userid);
    }
    public void answerUpdate(HashMap<String, Object> map) {
        sqlSessionTemplate.update("answerUpdate", map);
    }
    public int answerCheck(HashMap<String, Object> map) {
        return sqlSessionTemplate.selectOne("answerCheck", map);
    }
	
}
