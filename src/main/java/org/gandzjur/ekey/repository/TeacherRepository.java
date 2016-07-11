package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
    
}
