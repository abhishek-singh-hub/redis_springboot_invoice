package com.redis.invoice.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice implements Serializable{

	
	private static final long serialVersionUID = 3073747981117279013L;
	@Id
	@GeneratedValue
	private Integer invId;
	private String invName;
	private Double invAmount;
}
