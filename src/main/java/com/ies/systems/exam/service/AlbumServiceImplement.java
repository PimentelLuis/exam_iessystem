package com.ies.systems.exam.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ies.systems.exam.entity.Album;
import com.ies.systems.exam.entity.Fotografia;
import com.ies.systems.exam.model.AlbumModel;
import com.ies.systems.exam.model.FotoModel;
import com.ies.systems.exam.repository.AlbumRepository;
import com.ies.systems.exam.repository.FotografiaRepository;

@Service
public class AlbumServiceImplement implements AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private FotografiaRepository fotografiaRepository;

	@Override
	public ResponseEntity crearAlbum(AlbumModel albumModel) {
		
		Album album = new Album();
		album.setNombre(albumModel.getNombre());
		album.setFechaCreacion(new Date());

		albumRepository.save(album);
		
		for(FotoModel fotoModel : albumModel.getFotografiaList()) {
			Fotografia fotografia = new Fotografia();
			
			fotografia.setIdAlbum(album);
			fotografia.setUrl(fotoModel.getUrl());
			fotografia.setDescripcion(fotoModel.getDescripcion());
			
			fotografiaRepository.save(fotografia);
		}

		Map response = new HashMap(); 
		response.put("status", true);
		response.put("idAlbum", album.getIdAlbum());
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity borrarAlbum(Integer idAlbum) {
		
		Album album = albumRepository.findById(idAlbum).get();
		
		fotografiaRepository.deleteAll(album.getFotografiaList());
		albumRepository.delete(album);
		
		Map response = new HashMap(); 
		response.put("status", true);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity agregarFotosAlbum(Integer idAlbum, ArrayList<FotoModel> fotografiaList) {
		
		Album album = albumRepository.findById(idAlbum).get();
		
		for(FotoModel fotoModel : fotografiaList) {
			Fotografia fotografia = new Fotografia();
			
			fotografia.setIdAlbum(album);
			fotografia.setUrl(fotoModel.getUrl());
			fotografia.setDescripcion(fotoModel.getDescripcion());
			
			fotografiaRepository.save(fotografia);
		}
		
		Map response = new HashMap(); 
		response.put("status", true);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
