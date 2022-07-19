package com.example.companyreg.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "stocks")
public class Stock {
	@Id
	private String stockId;
	//@NotBlank(message = "This field is mandatory!")
	private String companyCode;
	//@NotBlank(message = "This field is mandatory!")
	private double stockPrice;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateAdded;
	
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date date) {
		
		this.dateAdded = date;
	}
	
}
