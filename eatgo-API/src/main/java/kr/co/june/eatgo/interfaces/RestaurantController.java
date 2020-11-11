package kr.co.june.eatgo.interfaces;

import kr.co.june.eatgo.application.RestaurantService;
import kr.co.june.eatgo.domain.MenuItem;
import kr.co.june.eatgo.domain.MenuItemRepository;
import kr.co.june.eatgo.domain.Restaurant;
import kr.co.june.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class RestaurantController {

    /*@Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private  MenuItemRepository menuItemRepository;*/

    @Autowired
    private RestaurantService restaurantService;

    //@RequestMapping("/restaurants")
    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        /*List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");*/

        //restaurants.add(restaurant);
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.getRestaurant(id);
        /*Restaurant restaurant = restaurantService.getRestaurantById(id);
        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItems(menuItems);*/
        return restaurant;
    }

    @PostMapping("/restaurants")
    public ResponseEntity<?> Create(@RequestBody Restaurant resource) throws URISyntaxException {
        String name = resource.getName();
        String address = resource.getAddress();

        Restaurant restaurant = new Restaurant(1234L, name, address);
        restaurantService.addRestaurant(restaurant);
        URI location = new URI("/restaurants/" + restaurant.getId());
        return ResponseEntity.created(location).body("{}");
    }

}