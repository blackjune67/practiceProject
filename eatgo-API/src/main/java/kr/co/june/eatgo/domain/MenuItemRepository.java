package kr.co.june.eatgo.domain;

import java.awt.*;
import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);
}
