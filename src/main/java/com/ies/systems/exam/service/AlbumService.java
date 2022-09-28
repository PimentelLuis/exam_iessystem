package com.ies.systems.exam.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import com.ies.systems.exam.model.AlbumModel;
import com.ies.systems.exam.model.FotoModel;

public interface AlbumService {
	
	public ResponseEntity crearAlbum(AlbumModel albumModel);
	public ResponseEntity borrarAlbum(Integer idAlbum);
	public ResponseEntity agregarFotosAlbum(Integer idAlbum, ArrayList<FotoModel> fotografiaList);

}
