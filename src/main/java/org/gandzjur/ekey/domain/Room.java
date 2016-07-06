package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "ROOMS")
@Entity
public class Room implements Serializable {

    @Id
    private Integer roomId;
    
    @ManyToOne
    @JoinColumn(name = "univer_id")
    private Univercity university;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Univercity getUniversity() {
        return university;
    }

    public void setUniversity(Univercity university) {
        this.university = university;
    }
    
}
