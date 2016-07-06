package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "LECTURES")
@Entity
public class Lecture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lecture_id", nullable = false)
    private Integer lectureId;
    
    @Column(name = "lecture_name")
    private String lectureName;
    
    @ManyToOne
    @JoinColumn(name = "lecture_interva_id")
    private LectureInterval interval;
    
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    
    @Column(name = "week_twoness")
    private Integer weekTwoness;
    
    @Column(name = "day_of_week")
    private Integer dayOfWeek;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    
    @ManyToOne
    @JoinColumn(name = "univer_id")
    private Univercity university;

    public Lecture() {
    }

    public Lecture(Integer lectureId, String lectureName, LectureInterval interval, Room room, Teacher teacher, Integer weekTwoness, Integer dayOfWeek, Group group, Univercity university) {
        this.lectureId = lectureId;
        this.lectureName = lectureName;
        this.interval = interval;
        this.room = room;
        this.teacher = teacher;
        this.weekTwoness = weekTwoness;
        this.dayOfWeek = dayOfWeek;
        this.group = group;
        this.university = university;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public LectureInterval getInterval() {
        return interval;
    }

    public void setInterval(LectureInterval interval) {
        this.interval = interval;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getWeekTwoness() {
        return weekTwoness;
    }

    public void setWeekTwoness(Integer weekTwoness) {
        this.weekTwoness = weekTwoness;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Univercity getUniversity() {
        return university;
    }

    public void setUniversity(Univercity university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Lecture{" + "lectureId=" + lectureId + 
                            ", lectureName=" + lectureName + 
                            ", interval=" + interval.getLectionIntervalId() + 
                            ", room=" + room.getRoomId() + 
                            ", teacher=" + teacher.getTeacherId() + 
                            ", weekTwoness=" + weekTwoness + 
                            ", dayOfWeek=" + dayOfWeek + 
                            ", group=" + group.getGroupName() + 
                            ", university=" + university.getUniverName() + '}';
    }

    
}
