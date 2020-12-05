package itall.survey.study.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itall.survey.study.DAO.SubjectDAO;
import itall.survey.study.VO.SubjectVO;

@Service
public class SubjectService {

	@Autowired
	private SubjectDAO subjectDAO;

	public void userrecordadd(SubjectVO VO) {
		subjectDAO.recordadd(VO);
		subjectDAO.priorityadd(VO);
	}

	
	}
