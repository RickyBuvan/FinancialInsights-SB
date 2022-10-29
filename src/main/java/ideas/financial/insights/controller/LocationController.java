package ideas.financial.insights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ideas.financial.insights.model.Restaurant;
import ideas.financial.insights.model.TravelDestination;
import ideas.financial.insights.service.LocationService;

@RestController
@RequestMapping("/location")
@EnableAutoConfiguration
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/allSavedTravelDestinations")
	public List<TravelDestination> getAllSavedTravelDestination() {
		return locationService.getAllTravelDestinations();
	}

	@GetMapping("/allSavedRestaurants")
	public List<Restaurant> getAllSavedRestaurants() {
		return locationService.getAllRestaurants();
	}
}