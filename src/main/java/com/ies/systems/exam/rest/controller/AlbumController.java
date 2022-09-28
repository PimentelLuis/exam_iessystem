package com.ies.systems.exam.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.systems.exam.model.AlbumModel;
import com.ies.systems.exam.model.FotoModel;
import com.ies.systems.exam.service.AlbumService;

import com.ies.systems.exam.util.Constants;
import static com.ies.systems.exam.util.Constants.APLICATION_JSON;

import java.util.ArrayList;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(Constants.Album.REQUEST_MAPPING)
@CrossOrigin
@Tag(name = Constants.Album.NAME, description = Constants.Album.DESCRIPCION)
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@Operation(summary = Constants.Album.CrearAlbum.SUMMARY, description = Constants.Album.CrearAlbum.DESCRIPTION)
	@PostMapping(path = Constants.Album.CrearAlbum.PATH, produces = APLICATION_JSON, consumes = APLICATION_JSON)
	ResponseEntity crearAlbum(@RequestBody AlbumModel albumModel) {
		return this.albumService.crearAlbum(albumModel);
	}
	
	@Operation(summary = Constants.Album.BorrarAlbum.SUMMARY, description = Constants.Album.BorrarAlbum.DESCRIPTION)
	@DeleteMapping(path = Constants.Album.BorrarAlbum.PATH)
	ResponseEntity borrarAlbum(@PathVariable(value = "idAlbum") Integer idAlbum) {
		return this.albumService.borrarAlbum(idAlbum);
	}
	
	@Operation(summary = Constants.Album.AgregarFotosAlbum.SUMMARY, description = Constants.Album.AgregarFotosAlbum.DESCRIPTION)
	@PutMapping(path = Constants.Album.AgregarFotosAlbum.PATH, produces = APLICATION_JSON, consumes = APLICATION_JSON)
	ResponseEntity agregarFotosAlbum(@PathVariable(value = "idAlbum") Integer idAlbum, @RequestBody ArrayList<FotoModel> fotoList) {
		return this.albumService.agregarFotosAlbum(idAlbum, fotoList);
	}

}
