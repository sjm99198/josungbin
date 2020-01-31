package com.kite.mm.part.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.part.dao.PartDao;

@Service
public class PartDeleteSelectService {

	@Autowired
	private SqlSessionTemplate template;

	private PartDao dao;

	public int deleteselect(int idx) {
		
		dao = template.getMapper(PartDao.class);

		return dao.deleteselect(idx);
	}

}
