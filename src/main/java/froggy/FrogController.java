package froggy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FrogController {

	@GetMapping("/")
	public String root() {
		return "Hello Kubernetes demo on Wed! I'm served by " + getClass().getName();
	}

	@GetMapping("hello/{name}")
	public String person(@PathVariable String name) {
		return "Hello " + name + "!";
	}

}
