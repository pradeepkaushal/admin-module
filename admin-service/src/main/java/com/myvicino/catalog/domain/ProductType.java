package com.myvicino.catalog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
//@Table(name="product_type_tbl")
public class ProductType extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
