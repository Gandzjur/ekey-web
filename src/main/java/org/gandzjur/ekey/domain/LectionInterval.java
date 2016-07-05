package org.gandzjur.ekey.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "LECTION_INTERVALS")
@Entity
public class LectionInterval implements Serializable {

    @Id
    private Integer lectionIntervalId;

    public Integer getLectionIntervalId() {
        return lectionIntervalId;
    }

    public void setLectionIntervalId(Integer lectionIntervalId) {
        this.lectionIntervalId = lectionIntervalId;
    }
    
}
