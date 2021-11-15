package JOINSDATAJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import JOINSDATAJPA.domain.Employee;
import JOINSDATAJPA.repository.Deporepository;
import JOINSDATAJPA.repository.Emprepository;
@Component
public class Emprunner implements CommandLineRunner {

	@Autowired
	private Emprepository erepo;
	
	@Autowired
	private Deporepository drepo;
	
	@Override
	public void run(String... args) throws Exception {
		

		erepo.save(new Employee(1,"Ram","siddipet","dev",drepo.findByDepId(11)));
		erepo.save(new Employee(2,"Ram","siddipet","dev",drepo.findByDepId(11)));
		erepo.save(new Employee(3,"Ram","siddipet","dev",null));
		erepo.save(new Employee(5,"Ram","siddipet","dev",null));
		erepo.save(new Employee(6,"Ram","siddipet","dev",null));
		erepo.save(new Employee(7,"Ram","siddipet","dev",drepo.findByDepId(13)));
		
	}

}
