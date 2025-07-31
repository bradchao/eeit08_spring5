package tw.brad.spring5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.spring5.service.MemberService;

@RestController
@RequestMapping("/")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/test1")
	public void test1() {
		service.query1();
	}
	@RequestMapping("/test2")
	public void test2() {
		service.query2();
	}
	@RequestMapping("/test3")
	public void test3() {
		service.query3();
	}
	
}
