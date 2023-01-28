package ideas.financial.insights.service;

import java.util.List;

import ideas.financial.insights.model.Restaurant;
import ideas.financial.insights.model.TravelDestination;

public interface LocationService {

	public List<Restaurant> getRestaurant(String name);

	public void saveNewRestaurant(Restaurant restaurant);

	public void editRestaurant(Restaurant restaurant);

	public List<Restaurant> getAllRestaurants();

	public List<Restaurant> getRestaurantsByLocality(String locality);

	public List<Restaurant> getRestaurantsByDistrict(String district);

	public List<Restaurant> getRestaurantsByState(String state);

	public List<Restaurant> getRestaurantsByCountry(String country);

	public List<TravelDestination> getTravelDestination(String name);

	public void saveNewTravelDestination(TravelDestination travelDestination);

	public void editTravelDestination(TravelDestination travelDestination);

	public List<TravelDestination> getAllTravelDestinations();

	public List<TravelDestination> getTravelDestinationsByLocality(String locality);

	public List<TravelDestination> getTravelDestinationsByDistrict(String district);

	public List<TravelDestination> getTravelDestinationsByState(String state);
//Sample Comment
	public List<TravelDestination> getTravelDestinationsByCountry(String country);
}
