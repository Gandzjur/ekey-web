package org.gandzjur.ekey.repository;

import java.io.Serializable;
import org.gandzjur.ekey.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UniversityRepository extends JpaRepository<University, Integer>{
    
}
