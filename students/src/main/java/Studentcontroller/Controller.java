package Studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequestMapping(value="/student")
public class Controller {
	@Autowired 
	StudentSerivs empstr;

	@PostMapping(value = "/add")
	public String insertstudents(@RequestBody student e) {
		this.e = e;
		return empstr.insertstudents(e);
	}

}
