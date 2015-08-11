package com.myvicino.catalog.domain;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="created_time")
    private Date createdDate;
    @Column(name="created_by")
    private Date createdBy;
    @Column(name="unique_id", nullable=false, length=512)
    private String uniqueId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

}
