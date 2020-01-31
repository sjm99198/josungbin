package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.part.domain.PartListView;
import com.kite.mm.part.service.PartDeleteService;
import com.kite.mm.part.service.PartListService;

@Controller
public class PartDeleteController {
	
	@Autowired
	PartDeleteService service;
	
	@RequestMapping("/part/delete")
	public String list(
			@RequestParam(value="idx", defaultValue = "1") int idx,
			Model model
			) {
		
		System.out.println("삭제 컨트롤러 : idx =>" + idx);
				
		int result = service.deleteArticle(idx);
						
		model.addAttribute("result", result); 
		
		return "part/delete";
	}

}
