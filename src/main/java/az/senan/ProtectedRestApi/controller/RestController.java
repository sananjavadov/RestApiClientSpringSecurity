package az.senan.ProtectedRestApi.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import az.senan.ProtectedRestApi.model.Student;
import az.senan.ProtectedRestApi.service.StudentService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/students")
	public List<Student> getAll(){
		return service.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public Student getId(@PathVariable("id") int id) {
		return service.getStudent(id);
	}

	@RequestMapping("/client/students")
	public String getProductList() {
	
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic "+Base64.encodeBase64String("user:123".getBytes()));
	//	headers.setBasicAuth("user", "123"); üstdəki metod ilə eyni işi görürlər. Bu hazır metoddur.
		
		HttpEntity <String> entity = new HttpEntity<String>(headers);
	       
		return new RestTemplate().exchange(
	         "http://localhost:8080/students", HttpMethod.POST, entity, String.class).getBody();
	   }
	
	@RequestMapping("/client/students/{id}")
	public String getProductId(@PathVariable int id) {
	
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Basic "+Base64.encodeBase64String("user:123".getBytes()));
	//	headers.setBasicAuth("user", "123"); üstdəki metod ilə eyni işi görürlər. Bu hazır metoddur.
		
		HttpEntity <String> entity = new HttpEntity<String>(headers);
	       
		return new RestTemplate().exchange(
	         "http://localhost:8080/students/"+id, HttpMethod.POST, entity, String.class).getBody();
	   }
	
	
}
