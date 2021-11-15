package JOINSDATAJPA.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Department {
	@Id
	@NotNull
	private Integer depId;
	private String depCode;
	private String depNote;

}
