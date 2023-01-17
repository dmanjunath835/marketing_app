package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.services.LeadService;
import com.marketing.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private EmailService emailService;
//http://localhost:8080/create
	@RequestMapping("/create")
	public String view() {
		return "create_lead";
	}
	@RequestMapping("/saveData")
	public String save(Lead lead,ModelMap model) {
		model.addAttribute("msg", "Save record!");
		emailService.sendEmail(lead.getEmail(), "WelCome To Agu", "Hello");
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		leadService.save(lead);
		return "create_lead";
	}
	//http://locslhodt:8806/listall
	
	@RequestMapping("/listall")
	public String listLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
	//	System.out.println(leads);
		return "list_leads";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id,Model model) {
		leadService.deleteId(id);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
	//	System.out.println(leads);
		return "list_leads";
	}
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	
	
	@RequestMapping("/updateLead")
	public String updateLead(Lead lead,ModelMap model) {
		model.addAttribute("msg", "Save record!");
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		leadService.save(lead);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
	//	System.out.println(leads);
		return "list_leads";
	}
	
	
}
