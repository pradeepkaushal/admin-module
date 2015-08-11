package com.myvicino.catalog.domain;

import javax.persistence.*;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
//@Table(name = "vendor_tbl")
public class Vendor extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "vendor_addrs")
    private Address address;

    @Column(name = "active")
    private Boolean active;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
