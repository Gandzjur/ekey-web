package org.gandzjur.ekey.repository;

import org.gandzjur.ekey.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RoomRepository extends JpaRepository<Room, Integer>{
    
}
