package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Column;
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
    
    @Column(name = "device_mac")
    private Long deviceMac;
    
    @Column(name = "roomName")
    private String roomName;
    
    @ManyToOne
    @JoinColumn(name = "univer_id")
    private University university;

    public Room() {
    }

    public Room(Integer roomId, Long deviceMac, String roomName, University university) {
        this.roomId = roomId;
        this.deviceMac = deviceMac;
        this.roomName = roomName;
        this.university = university;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Long getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(Long deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", deviceMac=" + deviceMac + ", roomName=" + roomName + ", university=" + university.getUniverName() + '}';
    }

}
