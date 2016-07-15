package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "STUDENTS")
@Entity
public class Student  implements Serializable {

    @Id
    @Column(name = "student_id", length = 10, nullable = false)
    private String studentID;
    
    @Column(name = "rfid_token", nullable = false, unique = true)
    private Integer rfidToken;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Student() {
    }

    public Student(String studentID, Integer rfidTocken, String firstName, String lastName, Group group) {
        this.studentID = studentID;
        this.rfidToken = rfidTocken;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Integer getRfidToken() {
        return rfidToken;
    }

    public void setRfidToken(Integer rfidToken) {
        this.rfidToken = rfidToken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", rfidTocken=" + rfidToken + ", firstName=" + firstName + ", lastName=" + lastName + ", group=" + group.getGroupName() + '}';
    }

    
}
