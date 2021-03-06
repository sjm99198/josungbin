package com.kite.mm.part.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.part.dao.PartDao;

@Service
public class PartDeleteAllService {

	@Autowired
	private SqlSessionTemplate template;

	private PartDao dao;

	public int deleteAll(int idx) {
		
		dao = template.getMapper(PartDao.class);

		return dao.deleteAll();
	}

}
