package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="nik")
	private String nIK;
	
	@Column(name ="gender")
	private String Gender;
	
	@Column(name ="birth_place")
	private String birthPlace;
	
	@Column(name ="birthday_date")
	private String birthDayDate;
	
	@Column(name ="phone_number")
	private String phoneNumber;
	
	@Column(name ="religion")
	private String Religion;
	
	@Column(name ="marital_status")
	private String maritalStatus;
	
	@Column(name ="address")
	private String Address;
	
	@Column(name ="day_enter_company")
	private String dayEnterCompany;
	
	@Column(name ="day_out_company")
	private String dayOutCompany;
	
	@Column(name ="PIC_CLASS")
	private String picClass;
	
	@Column(name ="amount_of_leave")
	private String amountOfLeave;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String nIK, String Gender, String birthPlace,
			String birthDayDate, String phoneNumber, String Religion, String maritalStatus, String Address,
			String dayEnterCompany, String dayOutCompany, String picClass, String amountOfLeave) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nIK = nIK;
		this.Gender = Gender;
		this.birthPlace = birthPlace;
		this.birthDayDate = birthDayDate;
		this.phoneNumber = phoneNumber;
		this.Religion = Religion;
		this.maritalStatus = maritalStatus;
		this.Address = Address;
		this.dayEnterCompany = dayEnterCompany;
		this.dayOutCompany = dayOutCompany;
		this.picClass = picClass;
		this.amountOfLeave = amountOfLeave;
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
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getbirthPlace() {
		return birthPlace;
	}
	public void setbirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getbirthDayDate() {
		return birthDayDate;
	}
	public void setbirthDayDate(String birthDayDate) {
		this.birthDayDate = birthDayDate;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String Religion) {
		this.Religion = Religion;
	}
	public String getmaritalStatus() {
		return maritalStatus;
	}
	public void setmaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getdayEnterCompany() {
		return dayEnterCompany;
	}
	public void setdayEnterCompany(String dayEnterCompany) {
		this.dayEnterCompany = dayEnterCompany;
	}
	public String getdayOutCompany() {
		return dayOutCompany;
	}
	public void setdayOutCompany(String dayOutCompany) {
		this.dayOutCompany = dayOutCompany;
	}

	public String getpicClass() {
		return picClass;
	}
	public void setpicClass(String picClass) {
		this.picClass = picClass;
	}
	public String getamountOfLeave() {
		return amountOfLeave;
	}
	public void setamountOfLeave(String amountOfLeave) {
		this.amountOfLeave = amountOfLeave;
	}
}
