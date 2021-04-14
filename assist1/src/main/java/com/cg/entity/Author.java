package com.cg.entity;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long author_id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "secondname")
	private String middleName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "phoneno")
	private String phoneNo;

	public Author() {

	}

	public Author(String firstName, String middleName, String lastName, String phoneNo) {
		super();

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public Long getAuthor_id() {
		return author_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}

}
