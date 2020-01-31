package com.kite.mm.part.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.part.dao.PartDao;
import com.kite.mm.part.domain.PartVo;

@Service
public class PartViewService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartDao dao;
	
	public PartVo getArticle(int idx) {
		
		dao = template.getMapper(PartDao.class);
		
		return dao.selectpartByIdx(idx) ;
		
	}

}
