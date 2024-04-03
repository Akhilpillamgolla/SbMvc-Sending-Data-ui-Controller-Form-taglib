package com.SpringMvc.Controller;


import lombok.Data;

@Data                    //Generate Setter method & Getter Method For us
public class Customer {   //Binding Class

	private String customerName;
	private String customerEmail;
	private Long customerPhno;
}