package com.ies.systems.exam.model;


public class FotoModel {
	
	private String url;
	private String descripcion;
	
	public FotoModel() {
		
	}
	
	public FotoModel(String url, String descripcion) {
		this.url = url;
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
