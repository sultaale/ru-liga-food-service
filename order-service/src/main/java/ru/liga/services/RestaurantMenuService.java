package ru.liga.services;


import ru.liga.dto.RestaurantMenuItemDTO;
import ru.liga.models.RestaurantMenuItem;

public interface RestaurantMenuService {
    RestaurantMenuItem getById(Long id);

    RestaurantMenuItem getByName(String name);

    RestaurantMenuItem updatePrice(Long id, double price);

    void deleteById(Long id);
}
