package kr.co.june.eatgo.interfaces;

import kr.co.june.eatgo.domain.Restaurant;
import kr.co.june.eatgo.domain.RestaurantRepository;
import org.graalvm.compiler.phases.common.LazyValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    private RestaurantRepository restaurantRepository = new RestaurantRepository();

    //@RequestMapping("/restaurants")
    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        /*List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");*/
        //restaurants.add(restaurant);
        return restaurantRepository.findAll();
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable Long id) {
        /*List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "june zip", "Seoul"));*/
        return restaurantRepository.findById(id);
    }

}
