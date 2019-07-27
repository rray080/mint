package com.gtids.mint.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtids.mint.MintApplication;

/**
 * @author rakesh
 * Date : 27-Jul-2019
 */
@RestController
@RequestMapping(value = MintApplication.BASE_URI+"/login")
public class LoginController {
	

	@RequestMapping(value = "/test")
	public String test() {
		return "test";
	}
}
