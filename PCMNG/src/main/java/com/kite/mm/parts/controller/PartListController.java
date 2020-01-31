package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.part.domain.PartListView;
import com.kite.mm.part.service.PartListService;

@Controller
public class PartListController {
	
	@Autowired
	PartListService service;
	
	@RequestMapping("/part/list")
	public String list(
			@RequestParam(value="page", defaultValue = "1") int page,
			Model model
			) {
		
		PartListView view = service.getListView(page);
		
		System.out.println(view);
				
		model.addAttribute("listView", view); 
		
		return "part/list";
	}

}
