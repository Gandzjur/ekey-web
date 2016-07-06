package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TEACHERS")
@Entity
public class Teacher implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private Integer teacherId;
    
    @Column(name = "teacher_name")
    private String teacherName;
    
    @Column(name = "teacher_surname")
    private String teacherSurname;
    
    @Column(name = "teacher_patronymic")
    private String teacherPatronymic;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName, String teacherSurname, String teacherPatronymic) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherPatronymic = teacherPatronymic;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherPatronymic() {
        return teacherPatronymic;
    }

    public void setTeacherPatronymic(String teacherPatronymic) {
        this.teacherPatronymic = teacherPatronymic;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSurname=" + teacherSurname + ", teacherPatronymic=" + teacherPatronymic + '}';
    }
    
    
}
