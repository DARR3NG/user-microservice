package com.pfa.quickLinker.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pfa.quickLinker.model.Image;
import com.pfa.quickLinker.service.ImageService;

@RestController
@RequestMapping("/image")
@CrossOrigin(origins = "*")
public class ImageController {
	
	
	 @Autowired
	 ImageService imageService ;
	 
	 
	 @RequestMapping(value = "/upload" , method = RequestMethod.POST)
	 public Image uploadImage(@RequestParam("image")MultipartFile file) throws IOException {
	 return imageService.uploadImage(file);
	 }
	 @RequestMapping(value = "/get/info/{id}" , method = RequestMethod.GET)
	 public Image getImageDetails(@PathVariable("id") Long id) throws IOException {
	 return imageService.getImageDetails(id) ;
	 }
	 @RequestMapping(value = "/load/{id}" , method = RequestMethod.GET)
	 public ResponseEntity<byte[]> getImage(@PathVariable("id") Long id) throws IOException 
	{
	 return imageService.getImage(id);
	 }
	 
	 
	 @RequestMapping(value = "/delete/{id}" , method = RequestMethod.DELETE)
	 public void deleteImage(@PathVariable("id") Long id){
	 imageService.deleteImage(id);
	 }
	 @RequestMapping(value="/update",method = RequestMethod.PUT)
	 public Image UpdateImage(@RequestParam("image")MultipartFile file) throws IOException {
	 return imageService.uploadImage(file);
	 }
	 
	 
	 @PostMapping("/uploadImageAdresse/{idAdresse}")
	 public Image uploadMultiImageToAdresse(@RequestParam("image")MultipartFile file,@PathVariable("idAdresse")Long idAdresse)throws IOException {
		 return imageService.uploadImageToAdresse(file, idAdresse);
	 }
	
	 
	 @GetMapping("/getImageAdresse/{idAdresse}")
	 public List<Image>getImagesAdresse(@PathVariable("idAdresse")Long idAdresse){
		 return imageService.getImageByAdresse(idAdresse);
	 }

}
