package com.capgemini.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.model.MainGeoAssoc;
@Repository
public interface MainGeoAssocRepository extends JpaRepository <MainGeoAssoc,Integer> {

}
