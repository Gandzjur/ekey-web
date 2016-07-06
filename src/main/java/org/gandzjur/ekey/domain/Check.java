package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.joda.time.DateTime;

@Table(name = "CHECKS")
@Entity
public class Check implements Serializable {

    @Id
    @Column(name = "check_id", nullable = false)
    private Integer checkId;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "check_time", nullable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private DateTime checkTime;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Check() {
    }

    public Check(Integer checkId, DateTime checkTime, Room room, Student student) {
        this.checkId = checkId;
        this.checkTime = checkTime;
        this.room = room;
        this.student = student;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public DateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(DateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Check{" + "checkId=" + checkId + ", checkTime=" + checkTime + ", room=" + room.getRoomId() + ", student=" + student.getStudentID() + '}';
    }
    
}
