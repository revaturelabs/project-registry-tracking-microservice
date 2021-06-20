package com.revature.registry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.registry.model.Phase;
import com.revature.registry.repository.PhaseRepository;

@Service
public class PhaseService {
	
	@Autowired
	private PhaseRepository phaseRepository;

	public List<Phase> getAllPhases() {

	    return phaseRepository.findAll();
		
	}

	public Phase  getPhaseById(int id) {
		Phase phase = phaseRepository.findById(id);
		if (phase != null) {
			return phase;
		}
		return null;
	}
}
