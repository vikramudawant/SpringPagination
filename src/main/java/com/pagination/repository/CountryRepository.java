package com.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagination.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
