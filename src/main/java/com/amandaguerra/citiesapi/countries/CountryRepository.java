package com.amandaguerra.citiesapi.countries;

import com.amandaguerra.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CountryRepository extends JpaRepository<Country, Long> {

    Page<Country> findAll(Pageable page);
}
