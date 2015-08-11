package com.myvicino.catalog.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
// @Table(name = "product_tbl")
public class Product extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(targetEntity=ProductType.class, fetch = FetchType.EAGER)
	private ProductType productType;

	@ManyToOne(targetEntity = Brand.class, fetch = FetchType.EAGER)
	private Brand brand;

	@OneToMany(targetEntity = ProductCategory.class, fetch = FetchType.LAZY)
	private Set<ProductCategory> productCategories;

	// @Column(name = "vendor_id")
	// private Set<Vendor> vendors;

	/*
	 * @OneToMany(mappedBy = "Product", targetEntity = ProductImage.class, fetch
	 * = FetchType.LAZY) private Set<ProductImage> productImages;
	 */
	@OneToMany(targetEntity = ProductOption.class, fetch = FetchType.LAZY)
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

	public Set<ProductOption> getProductOptions() {
		return productOptions;
	}

	public void setProductOptions(Set<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}
}
