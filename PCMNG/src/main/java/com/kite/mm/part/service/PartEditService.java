package com.kite.mm.part.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.part.dao.PartDao;
import com.kite.mm.part.domain.PartWriteRequest;

@Service
public class PartEditService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartDao dao;
	
	public int editArticle(PartWriteRequest request) {
		
		dao = template.getMapper(PartDao.class);
		
		return 	dao.editArticle(request);
			
	}

	
	
	
	
	
	
	
	
}
