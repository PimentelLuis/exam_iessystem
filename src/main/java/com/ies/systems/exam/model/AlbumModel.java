package com.ies.systems.exam.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AlbumModel {

	private String nombre;
	
	private ArrayList<FotoModel> fotografiaList;
	
	public AlbumModel() {
		
	}
	
	public AlbumModel(String nombre, ArrayList<FotoModel> fotografiaList) {
		this.nombre = nombre;
		this.fotografiaList = fotografiaList;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<FotoModel> getFotografiaList() {
		return fotografiaList;
	}

	public void setFotografiaList(ArrayList<FotoModel> fotografiaList) {
		this.fotografiaList = fotografiaList;
	}

}
