package com.ies.systems.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.systems.exam.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
