package com.iu.s9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BoardController {

	@RequestMapping(value="/board/{kind}/{num}")
	public void board(@PathVariable String kind,@PathVariable int num){
		System.out.println(kind);
		System.out.println(num);
	}
	
}
