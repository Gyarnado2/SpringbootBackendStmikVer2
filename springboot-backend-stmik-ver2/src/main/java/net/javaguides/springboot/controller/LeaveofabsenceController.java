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

import net.javaguides.springboot.model.Leaveofabsence;
import net.javaguides.springboot.repository.LeaveofabsenceRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class LeaveofabsenceController {
	
	@Autowired
	private LeaveofabsenceRepository leaveofabsenceRepository;

	
	@GetMapping("/leaveofabsence")
	public List<Leaveofabsence> getAllLeaveofabsence(){
		return leaveofabsenceRepository.findAll();
	}
//create employee rest api
	@PostMapping("/leaveofabsence")
	public 	Leaveofabsence createHierarchy(@RequestBody Leaveofabsence Leaveofabsence) {
		return leaveofabsenceRepository.save(Leaveofabsence);
	}

@GetMapping("/leaveofabsence/{id}")
public ResponseEntity<Leaveofabsence> getLeaveofabsenceById(@PathVariable Long id) {
	Leaveofabsence leaveofabsence = leaveofabsenceRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Leave of absence not exist with id :" + id));
	return ResponseEntity.ok(leaveofabsence);
	}

@PutMapping("/leaveofabsence/{id}")
public ResponseEntity<Leaveofabsence> updateLeaveofabsence(@PathVariable Long id, @RequestBody Leaveofabsence leaveofabsenceDetails){
	Leaveofabsence leaveofabsence = leaveofabsenceRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("leave of absence not exist with id :" + id));
	leaveofabsence.setleaveId(leaveofabsenceDetails.getleaveId());
	leaveofabsence.settypeOflLeave(leaveofabsenceDetails.gettypeOfLeave());
	leaveofabsence.setnIK(leaveofabsenceDetails.getnIK());
	
	leaveofabsence.setamountOfLeave(leaveofabsenceDetails.getamountOfLeave());
	
	Leaveofabsence updatedLeaveofabsence = leaveofabsenceRepository.save(leaveofabsence);
	return ResponseEntity.ok(updatedLeaveofabsence);
	}


	@DeleteMapping("/leaveofabsence/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLeaveofabsence(@PathVariable Long id){
		Leaveofabsence leaveofabsence = leaveofabsenceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Leave of absence not exist with id :" + id));
		leaveofabsenceRepository.delete(leaveofabsence);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
