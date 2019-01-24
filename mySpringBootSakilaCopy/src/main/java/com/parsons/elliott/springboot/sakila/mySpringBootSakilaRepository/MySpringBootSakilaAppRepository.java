package com.parsons.elliott.springboot.sakila.mySpringBootSakilaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parsons.ellott.springboot.sakila.mySpringBootSakilaModel.MySpringBootSakilaDataModel;

@Repository
public interface MySpringBootSakilaAppRepository extends JpaRepository<MySpringBootSakilaDataModel,Long> 
{
	List<MySpringBootSakilaDataModel>findByTitle(String title);
	List<MySpringBootSakilaDataModel>findByDescription(String description);
	List<MySpringBootSakilaDataModel>findByCategory(String category);
	List<MySpringBootSakilaDataModel>findByLength(String length);
	List<MySpringBootSakilaDataModel>findByRating(String rating);
}
