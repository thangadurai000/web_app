package StudController;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class hellocontroller {
	RestTemplate rest=new RestTemplate();
	@GetMapping(value="/gethi")
	public String gethi() {
		String url="http:/localhost:8080/gethello";
	ResponseEntity<String>name=rest.exchange(url, HttpMethod.GET,null, String.class);
	String ans=name.getBody();
	return ans;
	
	}
	

}
