package com.capgemini.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.model.Geo;

@Repository
public interface GeoRepository extends JpaRepository <Geo, Integer>{

}
