package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController  //
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	/*// Option #1
	@GetMapping  //helps this method to serve like ref point
	public String Hello(){
		return "Hello World";
	}*/

	/*//Option #2
	@GetMapping
	public List<String> Hello(){
		return List.of("Hello","World");
	}*/


   /* //Option #3
    @GetMapping
    public List<Student> Hello() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 2),
                        21)


        );
    }*/


}
