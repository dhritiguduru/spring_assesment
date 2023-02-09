package com.q2.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
@javax.persistence.Table(name = "Auth_TBL")
public class Author {
	@Id
	private int authId;
	private String authName;
	private String authAdd;
	private int authPh;

}
