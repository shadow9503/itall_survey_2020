package itall.survey.study.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import itall.survey.study.VO.SubjectVO;

@Repository
public class SubjectDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public void recordadd (SubjectVO VO) {
		sqlSessionTemplate.insert("userrecord", VO);
	}
	public void priorityadd (SubjectVO VO) {
		sqlSessionTemplate.insert("userpriority", VO);
	}
	
}
