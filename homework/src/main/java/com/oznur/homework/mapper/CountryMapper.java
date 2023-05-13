package com.oznur.homework.mapper;


import com.oznur.homework.dto.request.CountryDtoRequest;
import com.oznur.homework.dto.response.CountryDtoResponse;
import com.oznur.homework.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    List<CountryDtoResponse> countriesToCountryDtoResponses(List<Country> countries);
    CountryDtoResponse countryToCountryDtoResponse(Country country);
    Country countryDtoRequestToCountry(CountryDtoRequest countryDtoRequest);
    Country countryDtoResponseToCountry(CountryDtoResponse countryDtoResponse);

}
