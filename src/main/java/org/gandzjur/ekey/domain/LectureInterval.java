package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LECTURE_INTERVALS")
@Entity
public class LectureInterval implements Serializable {

    @Id
    private Integer lectureIntervalId;

    public Integer getLectionIntervalId() {
        return lectureIntervalId;
    }

    public void setLectionIntervalId(Integer lectureIntervalId) {
        this.lectureIntervalId = lectureIntervalId;
    }
    
}
