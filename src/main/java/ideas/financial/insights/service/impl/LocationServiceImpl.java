package ideas.financial.insights.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import ideas.financial.insights.model.Restaurant;
import ideas.financial.insights.model.TravelDestination;
import ideas.financial.insights.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public List<Restaurant> getRestaurant(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNewRestaurant(Restaurant restaurant) {
		List<Restaurant> restaurants = getAllRestaurants();
		restaurants.add(restaurant);
		writeRestaurantsToJSONFile(restaurants);
	}

	@Override
	public void editRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return parseRestaurantsFromJSONFile();
	}

	@Override
	public List<Restaurant> getRestaurantsByLocality(String locality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantsByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantsByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantsByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelDestination> getTravelDestination(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNewTravelDestination(TravelDestination travelDestination) {
		List<TravelDestination> travelDestinations = getAllTravelDestinations();
		travelDestinations.add(travelDestination);
		writeTravelDestinationsToJSONFile(travelDestinations);
	}

	@Override
	public void editTravelDestination(TravelDestination travelDestination) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TravelDestination> getAllTravelDestinations() {
		return parseTravelDestinationsFromJSONFile();
	}

	@Override
	public List<TravelDestination> getTravelDestinationsByLocality(String locality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelDestination> getTravelDestinationsByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelDestination> getTravelDestinationsByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelDestination> getTravelDestinationsByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Restaurant> parseRestaurantsFromJSONFile() {
		try {
			return new ObjectMapper().readValue(new File("src/main/resources/Restaurants.json"),
					new TypeReference<List<Restaurant>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	private List<TravelDestination> parseTravelDestinationsFromJSONFile() {
		try {
			return new ObjectMapper().readValue(new File("src/main/resources/TravelDestinations.json"),
					new TypeReference<List<TravelDestination>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	private Map<String, Restaurant> getRestaurantsAsMap() {
		try {
			return Collections.emptyMap();
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyMap();
		}
	}

	private Map<String, TravelDestination> getTravelDestinationsAsMap() {
		try {
			return Collections.emptyMap();
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyMap();
		}
	}

	private String writeRestaurantsToJSONFile(List<Restaurant> restaurants) {
		try {
			new ObjectMapper().writer(new DefaultPrettyPrinter())
					.writeValue(new File("src/main/resources/Restaurants.json"), restaurants);
			return "Success";
		} catch (IOException e) {
			e.printStackTrace();
			return "Failure";
		}
	}

	private String writeTravelDestinationsToJSONFile(List<TravelDestination> travelDestinations) {
		try {
			new ObjectMapper().writer(new DefaultPrettyPrinter())
					.writeValue(new File("src/main/resources/TravelDestinations.json"), travelDestinations);
			return "Success";
		} catch (IOException e) {
			e.printStackTrace();
			return "Failure";
		}
	}
}