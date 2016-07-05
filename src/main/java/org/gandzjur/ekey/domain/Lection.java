package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LECTIONS")
@Entity
public class Lection implements Serializable {

    @Id
    private Integer lectionId;

    public Integer getLectionId() {
        return lectionId;
    }

    public void setLectionId(Integer lectionId) {
        this.lectionId = lectionId;
    }
    
}
