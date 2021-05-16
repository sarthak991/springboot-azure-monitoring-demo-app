package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Video
{
	public Integer getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(final Integer identifier)
	{
		this.identifier = identifier;
	}

	@Id
	@GeneratedValue
	private Integer identifier;

	public String getDescription()
	{
		return description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	private String description;

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	private String name;

	public Video()
	{
	}
}
