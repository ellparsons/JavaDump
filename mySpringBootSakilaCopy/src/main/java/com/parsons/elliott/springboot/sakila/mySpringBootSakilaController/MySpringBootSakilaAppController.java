package com.parsons.elliott.springboot.sakila.mySpringBootSakilaController;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parsons.elliott.springboot.sakila.mySpringBootSakilaException.MySpringBootSakilaAppException;
import com.parsons.elliott.springboot.sakila.mySpringBootSakilaRepository.MySpringBootSakilaAppRepository;
import com.parsons.ellott.springboot.sakila.mySpringBootSakilaModel.MySpringBootSakilaDataModel;

@RestController
@RequestMapping("/api")
public class MySpringBootSakilaAppController {
	
	@Autowired
	MySpringBootSakilaAppRepository myRepository;
	
	//Method to create a film//
	@PostMapping("/create/film")
	public MySpringBootSakilaDataModel createFilm(@Valid @RequestBody MySpringBootSakilaDataModel mSDM){
		return myRepository.save(mSDM);
	}
	
	//Method to get a film//
	@GetMapping("/film/{filmId}")
	public MySpringBootSakilaDataModel getFilmbyFilmId(@PathVariable("filmId")Long filmId) 
	{
		return myRepository.findById(filmId).orElseThrow(()-> new MySpringBootSakilaAppException("MySpringBootSakilaDataModel","id",filmId));
	} 
	
	//Method to get a film by title//
	@GetMapping("/film/title/{title}")
	 
	public List<MySpringBootSakilaDataModel> getFilmByTitle(@PathVariable(value = "title")String title)
	{
		if (myRepository.findByTitle(title)== null) {
			throw new MySpringBootSakilaAppException("MySpringBootSakilaDataModel","title",title);
		}
		return myRepository.findByTitle(title);  
	} 
	
	//Method to get a film by description//
	@GetMapping("/film/description{description}")
		 
	public List<MySpringBootSakilaDataModel> getFilmByDescription(@PathVariable(value = "description")String description)
	{
		if (myRepository.findByDescription(description)== null) {
			throw new MySpringBootSakilaAppException("MySpringBootSakilaDataModel","description",description);
		}
		return myRepository.findByDescription(description);  
	} 
		
	//Method to get a film by category//
	@GetMapping("/film/category{category}")
		 
	public List<MySpringBootSakilaDataModel> getFilmByReleaseYear(@PathVariable(value = "category")String category)
	{
		if (myRepository.findByCategory(category)== null) {
			throw new MySpringBootSakilaAppException("MySpringBootSakilaDataModel","category",category);
		}
		return myRepository.findByCategory(category);  
	} 
	
	//Method to get a film by rating//
	@GetMapping("/film/rating/{rating}")
			 
	public List<MySpringBootSakilaDataModel> getFilmByRating(@PathVariable(value = "rating")String rating)
	{
		if (myRepository.findByRating(rating)== null) {
			throw new MySpringBootSakilaAppException("MySpringBootSakilaDataModel","rating",rating);
		}
		return myRepository.findByRating(rating);  
	} 
}
