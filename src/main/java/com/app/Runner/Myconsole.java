package com.app.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Myproduct;
import com.app.repo.Myrepo;

@Component
public class Myconsole implements CommandLineRunner{
	@Autowired
	private Myrepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Myproduct("hari", 20.120));
		repo.save(new Myproduct("veeru", 854.5));
		
	}
	

}
