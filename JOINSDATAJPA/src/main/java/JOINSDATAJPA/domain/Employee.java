package JOINSDATAJPA.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	@Id
	@NonNull
	private Integer empId;
	private String empName;
	private String empAddress;
	private String empCode;
	
	/*MANY EMPLOYEES CAN HAVE ONE DEPARTMENT*/
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="DIDFK")
	private Department deptRepo;
	
}
	/*manyTOone mapping (MANY EMPLOYEES CAN HAVE ONE DEPARTMENT)
	 * HERE i define employee class as parent
	 * here i define department class as child
	 * i used @ManyToOne mapping and joincolumn for joining the class of child
	 * i saved dummy departments in departmentRunner
	 * i set the many emloyees to one department in employeeRunner
	 * --------------------FETCHTYPE------------------------------
	 * Here i used fetch type to employee parent class
	 * such as EAGER &  LAZY
	 * EAGER can fetch the both records parent and child
	 * LAZY can fetch the parent records
	 * MANY-TO-MANY && ONE-TO-MANY mappings default is LAZY 
	 * ONE-TO-ONE   && MANY-TO-ONE mappings default is EAGER*/

