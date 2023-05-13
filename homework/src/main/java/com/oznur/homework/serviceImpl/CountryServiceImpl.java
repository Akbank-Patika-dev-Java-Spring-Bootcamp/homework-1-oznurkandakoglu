package com.oznur.homework.serviceImpl;

import com.oznur.homework.dto.request.CountryDtoRequest;
import com.oznur.homework.dto.response.CountryDtoResponse;
import com.oznur.homework.entity.Country;
import com.oznur.homework.mapper.CountryMapper;
import com.oznur.homework.repository.CountryRepository;
import com.oznur.homework.service.CountryService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;
    private CountryMapper countryMapper;

    public CountryServiceImpl(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @Override
    public Country saveCountry(CountryDtoRequest countryDtoRequest) {
        Country country = countryMapper.countryDtoRequestToCountry(countryDtoRequest);
        return countryRepository.save(country);
    }

    @Override
    public List<CountryDtoResponse> getAllCountries() {
        List<Country> countriesInDb = countryRepository.findAll();
        return countryMapper.countriesToCountryDtoResponses(countriesInDb);
    }

    @Override
    public CountryDtoResponse getCountryById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow();
        return countryMapper.countryToCountryDtoResponse(country);
    }

    @Override
    public CountryDtoResponse updatePresident(Long id, String president) {
        Country country = countryRepository.findById(id).orElseThrow();
        country.setPresident(president);
        countryRepository.save(country);
        return countryMapper.countryToCountryDtoResponse(country);
    }

    @Override
    public void deleteCountry(Long id) {
        Country country = countryMapper.countryDtoResponseToCountry(getCountryById(id));
        countryRepository.delete(country);

    }
}
