package com.example.demo.dto.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateBondRequest {

	@JsonProperty("r_g")
	String releaseGoal;
	
	String depositoryDealer;

	@NotNull
	String paymentDealer;
	
	@NotNull
	String accountManagementOrganization;
	
	String assetManagementOrganization;
}
