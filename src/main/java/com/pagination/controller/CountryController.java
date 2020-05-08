package com.pagination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pagination.entities.Country;
import com.pagination.repository.CountryRepository;


@Controller
public class CountryController implements WebMvcConfigurer{

	@Autowired
	private CountryRepository countryRepo;
	
	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", countryRepo.findAll(PageRequest.of(page, 4)));
		model.addAttribute("currentPage", page);
		return "index";
	
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Country c) {
		
		countryRepo.save(c);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteCountry(Integer id) {
		countryRepo.deleteById(id);
		
		return "redirect:/";
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public Country findOne(Integer id) {
		return	countryRepo.findById(id).get();
			
	}
	
	
}
