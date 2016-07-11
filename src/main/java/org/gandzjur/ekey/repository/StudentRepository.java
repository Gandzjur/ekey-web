package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends CrudRepository<Student, String> {
    
    Student findByRfidTocken(Integer rfidTocken);
    
}
