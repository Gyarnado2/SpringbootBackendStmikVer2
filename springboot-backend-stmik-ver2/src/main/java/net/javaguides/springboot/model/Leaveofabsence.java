package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "Leave_of_Absence")
public class Leaveofabsence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name ="leave_id")
	private String leaveId;
	
	@Column(name ="nik")
	private String nIK;
	
	@Column(name ="type_Of_Leave")
	private String typeOfLeave;
	
	@Column(name ="amount_Of_Leave")
	private String amountOfLeave;
	
	public Leaveofabsence() {
		
	}
	public Leaveofabsence(String leaveId, String nIK, String typeOfLeave, String amountOfLeave) {
		super();
		this.leaveId = leaveId;
		this.nIK = nIK;
		this.typeOfLeave = typeOfLeave;
		this.amountOfLeave = amountOfLeave;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getleaveId() {
		return leaveId;
	}
	public void setleaveId(String leaveId) {
		this.leaveId = leaveId;
	}
	public String getnIK() {
		return nIK;
	}
	public void setnIK(String nIK) {
		this.nIK = nIK;
	}
	public String gettypeOfLeave() {
		return typeOfLeave;
	}
	public void settypeOflLeave(String typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}
	
	public String getamountOfLeave() {
		return amountOfLeave;
	}
	public void setamountOfLeave(String amountOfLeave) {
		this.amountOfLeave = amountOfLeave;
	}
	
}