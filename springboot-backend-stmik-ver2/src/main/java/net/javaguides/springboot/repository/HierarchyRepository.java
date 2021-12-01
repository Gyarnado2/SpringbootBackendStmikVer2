package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Hierarchy;
@Repository
public interface HierarchyRepository extends JpaRepository<Hierarchy, Long>{

}