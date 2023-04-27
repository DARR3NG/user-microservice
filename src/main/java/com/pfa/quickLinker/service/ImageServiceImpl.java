package com.pfa.quickLinker.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Image;
import com.pfa.quickLinker.repository.AdresseRepository;
import com.pfa.quickLinker.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	ImageRepository imageRepository;
	@Autowired
	AdresseRepository adresseRepository ;
	
	

	@Override
	public Image uploadImage(MultipartFile file) throws IOException {
		/*Image image = new Image(null, file.getOriginalFilename(), 
		 file.getContentType(), file.getBytes(), null);
		 return imageRepository.save(image);*/
		 return imageRepository.save(Image.builder()
		 .name(file.getOriginalFilename())
		 .type(file.getContentType())
		 .image(file.getBytes()).build() );
	}

	@Override
	public Image getImageDetails(Long id) throws IOException {
		final Optional<Image> dbImage = imageRepository. findById (id);
		 return Image.builder()
		 .idImage(dbImage.get().getIdImage())
		 .name(dbImage.get().getName())
		 .type(dbImage.get().getType())
		 .image(dbImage.get().getImage()).build() ;

	}

	@Override
	public ResponseEntity<byte[]> getImage(Long id) throws IOException {
		final Optional<Image> dbImage = imageRepository. findById (id);
		 return ResponseEntity
		 .ok()
		 .contentType(MediaType.valueOf(dbImage.get().getType()))
		 .body(dbImage.get().getImage());
	}

	@Override
	public void deleteImage(Long id) {
		imageRepository.deleteById(id);

		
	}

	@Override
	public Image uploadImageToAdresse(MultipartFile file, Long idAdresse)throws IOException {
		Adresse a=new Adresse();
		a.setIdAdresse(idAdresse);
		return imageRepository.save(Image.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.image(file.getBytes())
				.adresse(a).build());
	}

	@Override
	public List<Image> getImageByAdresse(Long idAdresse) {
		Adresse a=adresseRepository.findById(idAdresse).get();
		
		return a.getImages();
	}
	
	
	
	
	

}
