package com.caveofprogramming.spring.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;

@Controller
public class OffersController {

	private OffersService offerService;

	@Autowired
	public void setOfferService(OffersService offerService) {
		this.offerService = offerService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();

		model.addAttribute("offers", offers);

		return "offers";
	}

	@RequestMapping("/createoffer")
	public String createOffer() {
		return "createoffer";
	}
	
	@RequestMapping("/docreate")
	public String doCreate() {

		return "offercreated";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String showTest(Model model,@RequestParam("id")String id) {
		System.out.println(id);
		
		return "home";
	}
	
}
