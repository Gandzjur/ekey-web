package org.gandzjur.ekey.repository;

import java.io.Serializable;
import javax.transaction.Transactional;
import org.gandzjur.ekey.domain.Check;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CheckRepository extends JpaRepository<Check, Integer>{
    
}
