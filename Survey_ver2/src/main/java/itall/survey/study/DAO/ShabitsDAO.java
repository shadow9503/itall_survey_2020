package itall.survey.study.DAO;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShabitsDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int questioncheck (HashMap<String, Object> map) {
		return sqlSessionTemplate.selectOne("questioncheck", map);		
	}
	
	public void questionaddnp (HashMap<String, Object> map) {
		sqlSessionTemplate.insert("questionaddNP", map);
	}
	public int findquestion (String questionid) {
		System.out.println("다오 질문있는지 확인"+questionid);
		return sqlSessionTemplate.selectOne("findqcount", questionid);		
	}
	public String findqid (HashMap<String, Object> ansinfo) {
		return sqlSessionTemplate.selectOne("findqidNP", ansinfo);
	}
	public void answeradd (HashMap<String, Object> map) {
		sqlSessionTemplate.insert("answeradd", map);
	}
}
