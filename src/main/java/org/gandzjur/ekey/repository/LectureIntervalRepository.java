package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.LectureInterval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LectureIntervalRepository extends JpaRepository<LectureInterval, Integer>{
    
}
