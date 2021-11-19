package https.github.com.MikeMacCav.citiesapi.countries.repository;

import https.github.com.MikeMacCav.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
