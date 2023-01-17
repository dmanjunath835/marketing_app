package com.marketing.services;

import java.util.List;

import com.marketing.entities.Lead;


public interface LeadService {
public void save(Lead lead);

//public List<Lead> getAllLeads();

public List<Lead> getAllLeads();

public void deleteId(long id);

public Lead getLeadById(long id);


}
