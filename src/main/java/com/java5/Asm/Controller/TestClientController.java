package com.java5.Asm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestClientController {
	@RequestMapping("/client")
	public String showForm() {
		return "product/infoClient";
	}
}