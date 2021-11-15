package JOINSDATAJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import JOINSDATAJPA.domain.Department;
import JOINSDATAJPA.repository.Deporepository;
@Component
public class Departmentrunner implements CommandLineRunner {

	@Autowired
	Deporepository drepo;
	
	@Override
	public void run(String... args) throws Exception {
		drepo.save(new Department(11,"QA","dev"));
		drepo.save(new Department(12,"QB","testing"));
		drepo.save(new Department(13,"QC","analyst"));
		drepo.save(new Department(14,"QD","TA"));
	}

}
