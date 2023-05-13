package com.oznur.homework.service;

import com.oznur.homework.dto.request.CountryDtoRequest;
import com.oznur.homework.dto.response.CountryDtoResponse;
import com.oznur.homework.entity.Country;

import java.util.List;

public interface CountryService{
     Country saveCountry(CountryDtoRequest countryDtoRequest);
     List<CountryDtoResponse> getAllCountries();
     CountryDtoResponse getCountryById(Long id);
     CountryDtoResponse updatePresident(Long id, String president);
     void deleteCountry(Long id);

}
