package com.springwebservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springwebservice.model.Slogan;
import com.springwebservice.services.SloganService;

@Controller
@RequestMapping("slogan")
public class SloganController {

    @Autowired
    private SloganService sloganService;

    @RequestMapping("/add")
    public String add(Model model) {
    	
    	model.addAttribute(sloganService.create());
        
    	return "slogan/slogan-add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseStatus(value  = HttpStatus.OK)
    public void save(@RequestBody Slogan slogan, Model model) {
        
    	sloganService.add(slogan);
    }
    
    @RequestMapping(value = "/saveView", method = RequestMethod.POST)
    public String savejsf(@ModelAttribute("slogan") Slogan slogan) {
    	
    	sloganService.add(slogan);
	
    	return "redirect:/slogan/list";
    }

    
    @RequestMapping(value = "/delete/{sloganId}", method = RequestMethod.GET)
    public String deleteSlogan(@PathVariable Long sloganId) {
        
    	Slogan slogan = sloganService.findById(sloganId);
        sloganService.delete(slogan);
        
        return "redirect:/slogan/listView/";
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public List<Slogan> list(Map<String, Object> model) {
    	
        return sloganService.findAll();
    }

}
