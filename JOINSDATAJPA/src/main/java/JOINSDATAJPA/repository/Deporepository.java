package JOINSDATAJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import JOINSDATAJPA.domain.Department;

public interface Deporepository extends JpaRepository<Department,Integer> {

	Department findByDepId(Integer Id);
}
