package org.gandzjur.ekey.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "GROUPS")
@Entity
public class Group implements Serializable {

    @Id
    @Column(name = "group_id", nullable = false)
    private Integer groupId;
    
    @Column(name = "group_name", nullable = false)
    private String groupName;
    
    @OneToMany(mappedBy = "group")
    private Set<Student> students;

    public Group() {
    }

    public Group(Integer groupId, String groupName, Set<Student> students) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.students = students;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" + "groupId=" + groupId + ", groupName=" + groupName + '}';
    }

}
