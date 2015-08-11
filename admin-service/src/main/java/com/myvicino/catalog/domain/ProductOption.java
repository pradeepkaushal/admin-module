package com.myvicino.catalog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pradeep.kaushal on 08/08/15.
 */
@Entity
public class ProductOption extends BaseEntity{
    @Id
    @GeneratedValue
	private Long id;
   
    @Column
	private MeasureType measureType;
    
    @Column
    private Integer quatity;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MeasureType getMeasureType() {
		return measureType;
	}
	public void setMeasureType(MeasureType measureType) {
		this.measureType = measureType;
	}
	public Integer getQuatity() {
		return quatity;
	}
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}
    
    
}


