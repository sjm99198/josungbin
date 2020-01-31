package com.kite.mm.part.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.part.dao.PartDao;
import com.kite.mm.part.domain.PartWriteRequest;

@Service
public class PartWriteService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartDao dao;
		
	public int write(PartWriteRequest request) {
		
		dao = template.getMapper(PartDao.class);
		
		return dao.insertArticle(request);
	}
	
	
	
	
	

}
