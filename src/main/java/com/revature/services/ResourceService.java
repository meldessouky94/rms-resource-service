package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.revature.models.Resource;
import com.revature.repository.ResourceRepository;

@Service
public class ResourceService {
	
	ResourceRepository resourceRepo;

	@Autowired
	public ResourceService(ResourceRepository resourceRepo) {
		super();
		this.resourceRepo = resourceRepo;
	}

	public List<Resource> getAllResources(Pageable pageable) {
		return resourceRepo.getAllResources(pageable);
	}

	public Resource getResourceById(int id) {
		return resourceRepo.getResourceById(id);
	}
	
	public List<Resource> getResourcesById(int[] ids) {
		return resourceRepo.getResourcesById(ids);
	}
	
	public Resource save(Resource resource) {
		return resourceRepo.save(resource);
	}
}
