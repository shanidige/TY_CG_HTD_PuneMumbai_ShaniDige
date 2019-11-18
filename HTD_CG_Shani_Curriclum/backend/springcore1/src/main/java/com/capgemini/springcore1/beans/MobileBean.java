package com.capgemini.springcore1.beans;

public class MobileBean {

	private String brandName;
	private String modelName;
	private int price;
	
	private MobileDisplayBean mobileBean;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public MobileDisplayBean getMobileBean() {
		return mobileBean;
	}

	public void setMobileBean(MobileDisplayBean mobileBean) {
		this.mobileBean = mobileBean;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
}
