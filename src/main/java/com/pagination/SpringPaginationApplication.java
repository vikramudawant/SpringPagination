package com.pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pagination.entities.Country;
import com.pagination.repository.CountryRepository;

@SpringBootApplication
public class SpringPaginationApplication implements CommandLineRunner{

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("China", "Peking"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("USA", "Washington DC"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Nimibia", "Windhoek"));
		countryRepository.save(new Country("India", "NewDelhi"));
		countryRepository.save(new Country("North Korea", "Pyongyang"));
		countryRepository.save(new Country("Kenya", "Nairobi"));
		countryRepository.save(new Country("Canada", "Ottawa"));
		countryRepository.save(new Country("BanglaDesh", "Bangla"));
		countryRepository.save(new Country("Japan", "Tokyo"));
		countryRepository.save(new Country("France", "Paris"));
		
	}
	
	

}
