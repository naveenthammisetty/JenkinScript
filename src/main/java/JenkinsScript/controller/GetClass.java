package JenkinsScript.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetClass {

	  @GetMapping("Fetch")
	  public String getMessge()
	  {
		  return "Data Fetched Successfully!!!!";
	  }
}
