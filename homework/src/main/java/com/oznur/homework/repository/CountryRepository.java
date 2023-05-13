package com.oznur.homework.repository;

import com.oznur.homework.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
