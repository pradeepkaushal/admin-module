package com.myvicino.catalog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
//@Table(name = "address_tbl")
public class Address extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String addressLine1;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
}
