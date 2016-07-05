package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CHECKS")
@Entity
public class Check implements Serializable {

    @Id
    private Integer checkId;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }
    
}
