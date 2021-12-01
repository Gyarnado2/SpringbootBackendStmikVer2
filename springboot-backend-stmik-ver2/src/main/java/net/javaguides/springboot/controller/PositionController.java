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

import net.javaguides.springboot.model.Position;
import net.javaguides.springboot.repository.PositionRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PositionController {
	
	@Autowired
	private PositionRepository positionRepository;

	
	@GetMapping("/position")
	public List<Position> getAllPosition(){
		return positionRepository.findAll();
	}
//create employee rest api
	@PostMapping("/position")
	public 	Position createPosition(@RequestBody Position position) {
		return positionRepository.save(position);
	}

@GetMapping("/position/{id}")
public ResponseEntity<Position> getPositionById(@PathVariable Long id) {
	Position position = positionRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Position not exist with id :" + id));
	return ResponseEntity.ok(position);
	}


@PutMapping("/position/{id}")
public ResponseEntity<Position> updatePosition(@PathVariable Long id, @RequestBody Position positionDetails){
	Position position = positionRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
	
	position.setPositionName(positionDetails.getPositionName());
	
	Position updatedPosition = positionRepository.save(position);
	return ResponseEntity.ok(updatedPosition);
	}

	@DeleteMapping("/position/{id}")
	public ResponseEntity<Map<String, Boolean>> deletePosition(@PathVariable Long id){
		Position position = positionRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Position not exist with id :" + id));
		positionRepository.delete(position);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
