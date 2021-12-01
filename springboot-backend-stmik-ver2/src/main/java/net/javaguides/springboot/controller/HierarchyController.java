package net.javaguides.springboot.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Hierarchy;
import net.javaguides.springboot.repository.HierarchyRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class HierarchyController {
	
	@Autowired
	private HierarchyRepository hierarchyRepository;

	
	@GetMapping("/hierarchy")
	public List<Hierarchy> getAllHierarchy(){
		return hierarchyRepository.findAll();
	}
//create employee rest api
	@PostMapping("/hierarchy")
	public 	Hierarchy createHierarchy(@RequestBody Hierarchy hierarchy) {
		return hierarchyRepository.save(hierarchy);
	}

@GetMapping("/hierarchy/{id}")
public ResponseEntity<Hierarchy> getHierarchyById(@PathVariable Long id) {
	Hierarchy hierarchy = hierarchyRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Hierarchy not exist with id :" + id));
	return ResponseEntity.ok(hierarchy);
	}


@PutMapping("/hierarchy/{id}")
public ResponseEntity<Hierarchy> updateHierarchy(@PathVariable Long id, @RequestBody Hierarchy hierarchyDetails){
	Hierarchy hierarchy = hierarchyRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Hierarchy not exist with id :" + id));
	
	hierarchy.setFirstName(hierarchyDetails.getFirstName());
	hierarchy.setLastName(hierarchyDetails.getLastName());
	hierarchy.setPosId(hierarchyDetails.getPosId());
	hierarchy.setnIK(hierarchyDetails.getnIK());
	
	Hierarchy updatedHierarchy = hierarchyRepository.save(hierarchy);
	return ResponseEntity.ok(updatedHierarchy);
	}

	@DeleteMapping("/hierarchy/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteHierarchy(@PathVariable Long id){
		Hierarchy hierarchy = hierarchyRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hierarchy not exist with id :" + id));
		hierarchyRepository.delete(hierarchy);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
