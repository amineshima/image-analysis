package localhost.af.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/sample")
public class SampleController {
	@GetMapping("")
	public String index() {
		String result = "sample";
		return result;
	}
}
