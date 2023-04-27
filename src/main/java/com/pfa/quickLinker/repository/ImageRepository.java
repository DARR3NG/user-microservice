package com.pfa.quickLinker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.quickLinker.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

}
