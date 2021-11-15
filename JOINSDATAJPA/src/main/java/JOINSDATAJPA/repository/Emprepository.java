package JOINSDATAJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import JOINSDATAJPA.domain.Employee;

public interface Emprepository extends JpaRepository<Employee,Integer> {
	
   Employee findByempId(Integer empId);
   //@Query("select e.empName,d.depCode from Employee e INNER JOIN e.deptRepo as d")
   //@Query("select e.empName,d.depCode from Employee e LEFT JOIN e.deptRepo as d")
   @Query("select e.empName,d.depCode from Employee e RIGHT JOIN e.deptRepo as d")
   //@Query("select e.empName,d.depCode from Employee e RIGHT JOIN e.deptRepo as d")--/* it wont in spring dataJPA support*/
	List<Object[]> getEmpNameandDepCode();

}
