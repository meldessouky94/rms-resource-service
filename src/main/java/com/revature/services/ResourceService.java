package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.google.common.primitives.Ints;
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

	public List<Resource> findResources(Resource resource) {
		return resourceRepo.findAll();
	}

	//tested
	public Resource getResourceById(int id) {
<<<<<<< HEAD
		return resourceRepo.getResourceById(id);
	} 
=======
		return resourceRepo.findById(id).orElseThrow(
				() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
>>>>>>> a53b8c5739057c4a2131b2a9eeba3ee43486d74b
	
	//tested
	public List<Resource> getResourcesById(int[] ids) {
		/* Had to convert the array of ids to an iterable so 
		 * findAllById() method would work.
		 */
		Iterable<Integer> iterable = Ints.asList(ids);
		return resourceRepo.findAllById(iterable);
	}
	
<<<<<<< HEAD
	//tested
=======
>>>>>>> a53b8c5739057c4a2131b2a9eeba3ee43486d74b
	public Resource save(Resource resource) {
		return resourceRepo.save(resource);
	}

	public void updateResource(Resource resource, int id) {
		Resource oldResource = resourceRepo.findById(id).orElseThrow(
				() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
		resource.setId(oldResource.getId());
		resourceRepo.save(resource);
	}
}
