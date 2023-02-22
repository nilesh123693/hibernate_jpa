package com.imageupload.save.image.in.db.repository;

import com.imageupload.save.image.in.db.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
