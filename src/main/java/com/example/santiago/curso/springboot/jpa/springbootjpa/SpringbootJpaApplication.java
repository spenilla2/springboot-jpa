package com.example.santiago.curso.springboot.jpa.springbootjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.santiago.curso.springboot.jpa.springbootjpa.entities.Person;
import com.example.santiago.curso.springboot.jpa.springbootjpa.repositories.PersonRepository;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository personRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = (List<Person> )personRepository.findAll();
		persons.stream().forEach(person -> System.out.println(person));

	}

}
