package com.example.SpringCloudDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getTest")
public class TestClass {
	
	
	@GetMapping("/helloWord")
	@ResponseBody
	public String helloWord() {
		return "欢迎访问SpringCloudDemo！";
	}

}
