package JOINSDATAJPA.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import JOINSDATAJPA.domain.Employee;
import JOINSDATAJPA.repository.Emprepository;
@Component
@Order(12)
public class Fetchrunner implements CommandLineRunner {

	@Autowired
	private Emprepository erepo;
	
	@Override
	public void run(String... args) throws Exception {
		Optional<Employee> opt=erepo.findById(1);
		System.out.println("Ok");
		
		List<Object[]> list=erepo.getEmpNameandDepCode();
		for(Object[] obj:list) {
			System.out.println(obj[0]+"-"+obj[1]);
		}
}
}

