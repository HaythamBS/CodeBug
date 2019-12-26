package io.CodeBug.Consumers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GmapsConsumer {

	@RequestMapping(value="/geolocation",method = RequestMethod.GET)
	public String GetGeolocationData() {
		
		return "35464,546846";
	}
}
