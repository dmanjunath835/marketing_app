package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void save(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteId(long id) {
   leadRepo.deleteById(id);		
	}

	@Override
	public Lead getLeadById(long id) {
		
		 Optional<Lead> findById = leadRepo.findById(id);
		 Lead lead = findById.get();
		return lead;
	}

}
