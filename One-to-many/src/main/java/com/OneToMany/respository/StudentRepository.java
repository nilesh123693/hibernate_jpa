package com.OneToMany.respository;

import com.OneToMany.Entity.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student1, Integer> {
}
