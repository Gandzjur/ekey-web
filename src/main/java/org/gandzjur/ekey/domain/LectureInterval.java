package org.gandzjur.ekey.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Table(name = "LECTURE_INTERVALS")
@Entity
public class LectureInterval implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lecture_interval_id", nullable = false)
    private Integer lectureIntervalId;
    
    @ManyToOne
    @JoinColumn(name = "univer_id")
    private University univercity;
    
    @Column(name = "start_time")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private DateTime start_time;
    
    @Column(name = "lecture_interval")
    private Long lectureInterval;

    public LectureInterval() {
    }

    public LectureInterval(Integer lectureIntervalId, University univercity, DateTime start_time, Long lectureInterval) {
        this.lectureIntervalId = lectureIntervalId;
        this.univercity = univercity;
        this.start_time = start_time;
        this.lectureInterval = lectureInterval;
    }

    public Integer getLectureIntervalId() {
        return lectureIntervalId;
    }

    public void setLectureIntervalId(Integer lectureIntervalId) {
        this.lectureIntervalId = lectureIntervalId;
    }

    public University getUnivercity() {
        return univercity;
    }

    public void setUnivercity(University univercity) {
        this.univercity = univercity;
    }

    public DateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(DateTime start_time) {
        this.start_time = start_time;
    }

    public Long getLectureInterval() {
        return lectureInterval;
    }

    public void setLectureInterval(Long lectureInterval) {
        this.lectureInterval = lectureInterval;
    }

    @Override
    public String toString() {
        return "LectureInterval{" + "lectureIntervalId=" + lectureIntervalId + ", univercity=" + univercity.getUniverName() + ", start_time=" + start_time + ", lectureInterval=" + lectureInterval + '}';
    }

}
