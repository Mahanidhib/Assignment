package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Geo;
import com.capgemini.demo.repository.AssocGeoAssocRepository;
import com.capgemini.demo.repository.GeoRepository;
import com.capgemini.demo.repository.MainGeoAssocRepository;
import com.capgemini.demo.service.GeoService;

@RestController
@RequestMapping(value ="/geo")
public class GeoController {

	
	 @Autowired
	 GeoRepository geoReposiory;
	 
	 @Autowired
	 AssocGeoAssocRepository agaRepository;
	 
	 @Autowired
	 MainGeoAssocRepository mgaRepository;
	 
	 @Autowired
	 GeoService geoService;
	 

		// adding all the records with child records
		@PostMapping("/addAllRecord")
		public Geo addAllRecords(@RequestBody Geo geo) {
			return geoService.addAllRecords(geo);
		}

		// get all records with child
		@GetMapping("/getAll")
		public List<Geo> findAllRecords() {
			return geoService.findAllRecords();
		}


		// fetch records of child and parent with parent id
		@GetMapping("/getRecords/{id}")
		public Geo getById(@RequestBody @PathVariable int id) {
			return geoService.fetchById(id);
		}

		// delete records of child and parent with parent id
		@DeleteMapping("/deleteby/{id}")
		public String deleteById(@RequestBody @PathVariable int id) {
			return geoService.deleteId(id);
		}

		// update record of child and parent with parent id
		@PutMapping("/update/{id}")
		public Geo updateById(@PathVariable int id, @RequestBody Geo updateDetails) {

			return geoService.updateId(id, updateDetails);
		}

	
}








