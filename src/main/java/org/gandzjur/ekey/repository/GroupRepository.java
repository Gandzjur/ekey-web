package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface GroupRepository extends CrudRepository<Group, Integer>{
    
}
