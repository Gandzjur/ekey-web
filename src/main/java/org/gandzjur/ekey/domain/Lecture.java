package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LECTURES")
@Entity
public class Lecture implements Serializable {

    @Id
    private Integer lectureId;

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

   
    
}
