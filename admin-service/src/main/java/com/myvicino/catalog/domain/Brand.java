package com.myvicino.catalog.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pradeep.kaushal on 09/08/15.
 */
@Entity
public class Brand extends  BaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String brandName;
    @Column
    private String brandDescription;

    

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

  
}
