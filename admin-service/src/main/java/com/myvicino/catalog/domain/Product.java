package com.myvicino.catalog.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
//@Table(name = "product_tbl")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "product_type_id")
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name="brandId",referencedColumnName="brandId")
    private Brand brand;

    @OneToMany(mappedBy="product_tbl",targetEntity=ProductCategory.class,
            fetch=FetchType.LAZY)
    private Set<ProductCategory> productCategories;

    @Column(name = "vendor_id")
    private Set<Vendor> vendors;

    @OneToMany(mappedBy = "Product", targetEntity = ProductImage.class,
                    fetch = FetchType.LAZY)
    private Set<ProductImage> productImages;

    @OneToMany(mappedBy = "Product", targetEntity = ProductOption.class,
            fetch = FetchType.LAZY)
    private Set<ProductOption> productOptions;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Set<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public Set<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(Set<Vendor> vendors) {
        this.vendors = vendors;
    }

    public Set<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(Set<ProductImage> productImages) {
        this.productImages = productImages;
    }

    public Set<ProductOption> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(Set<ProductOption> productOptions) {
        this.productOptions = productOptions;
    }
}
