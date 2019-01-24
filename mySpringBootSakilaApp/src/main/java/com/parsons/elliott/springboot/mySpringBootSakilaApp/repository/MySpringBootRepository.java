package com.parsons.elliott.springboot.mySpringBootSakilaApp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parsons.elliott.springboot.garage.mySpringBootSakilaApp.model.MySpringBootDataModel;

@Repository
public interface MySpringBootRepository extends JpaRepository<MySpringBootDataModel,Long>
{
	List<MySpringBootDataModel>findByTitle(String title);
	List<MySpringBootDataModel>findByDescription(String model);
	List<MySpringBootDataModel>findByCategory(String category);
	List<MySpringBootDataModel>findByPrice(int price);
	List<MySpringBootDataModel>findByLength(int lrice);
	List<MySpringBootDataModel>findByRating(String rating);
}