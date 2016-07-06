package org.gandzjur.ekey.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "UNIVERSITIES")
@Entity
public class Univercity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "univer_id", nullable = false)
    private Integer univerId;
    
    @Column(name = "univer_name")
    private String univerName;
    
    @OneToMany(mappedBy = "university")
    private List<Lection> lections;
    
    @OneToMany(mappedBy = "university")
    private List<Room> rooms;

    public Univercity() {
    }

    public Univercity(Integer univerId, String univerName, List<Lection> lections, List<Room> rooms) {
        this.univerId = univerId;
        this.univerName = univerName;
        this.lections = lections;
        this.rooms = rooms;
    }

    public Integer getUniverId() {
        return univerId;
    }

    public void setUniverId(Integer univerId) {
        this.univerId = univerId;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public List<Lection> getLections() {
        return lections;
    }

    public void setLections(List<Lection> lections) {
        this.lections = lections;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Univercity{" + "univerId=" + univerId + ", univerName=" + univerName + '}';
    }
    
    
}
