package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "hierarchy")
public class Hierarchy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="nik")
	private String nIK;
	
	
	@Column(name ="pos_Id")
	private String PosId;
	
	
	public Hierarchy() {
		
	}
	
	public Hierarchy(String firstName, String lastName, String nIK,  String PosId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nIK = nIK;
		this.PosId = PosId;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getnIK() {
		return nIK;
	}
	public void setnIK(String nIK) {
		this.nIK = nIK;
	}
	public String getPosId() {
		return PosId;
	}
	public void setPosId(String PosId) {
		this.PosId = PosId;
	}


}
