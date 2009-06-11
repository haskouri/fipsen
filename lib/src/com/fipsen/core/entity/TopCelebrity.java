package com.fipsen.core.entity;

public class TopCelebrity extends AbstractEntity
{
	private String firstName;
	private String lastName;
	private String middleName;
	private int position;
	
	
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getPosition()
	{
		return position;
	}
	public void setPosition(int position)
	{
		this.position = position;
	}
	
	

}
