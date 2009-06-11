package com.fipsen.core.entity;

public class Celebrity extends AbstractEntity
{
	private String firstname;
	private String lastname;
	private String middlename;
	private String birthplace;
	private String biography;
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getMiddlename()
	{
		return middlename;
	}
	public void setMiddlename(String middlename)
	{
		this.middlename = middlename;
	}
	public String getBirthplace()
	{
		return birthplace;
	}
	public void setBirthplace(String birthplace)
	{
		this.birthplace = birthplace;
	}
	public String getBiography()
	{
		return biography;
	}
	public void setBiography(String biography)
	{
		this.biography = biography;
	}
	
	

}
