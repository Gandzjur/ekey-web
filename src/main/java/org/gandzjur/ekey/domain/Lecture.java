package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "LECTURES")
@Entity
public class Lecture implements Serializable {

    @Id
    private Integer lectureId;
    
    @ManyToOne
    @JoinColumn(name = "univer_id")
    private Univercity university;

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public Univercity getUniversity() {
        return university;
    }

    public void setUniversity(Univercity university) {
        this.university = university;
    }

   
    
}
