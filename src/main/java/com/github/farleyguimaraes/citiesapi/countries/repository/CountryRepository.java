package com.github.farleyguimaraes.citiesapi.countries.repository;

import com.github.farleyguimaraes.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
