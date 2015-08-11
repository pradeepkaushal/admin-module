package com.myvicino.catalog.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pradeep.kaushal on 09/08/15.
 */
@Entity(name = "brand_tbl")
public class Brand extends  BaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String brandName;
    @Column
    private String brandDescription;

    @OneToMany(mappedBy="brand",targetEntity=Product.class,
            fetch=FetchType.LAZY)
    private Set<Product> products;

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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
