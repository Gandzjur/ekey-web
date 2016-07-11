package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LectureRepository extends JpaRepository<Lecture, Integer>{
    
}
