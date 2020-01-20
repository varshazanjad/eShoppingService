package com.myProject.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/discountCalculator")
public class DiscountCalculatorEndPoint {

	@POST
	@Path("calculate")
	public Response calculateDiscount(){
		return null;
		
	}
}
