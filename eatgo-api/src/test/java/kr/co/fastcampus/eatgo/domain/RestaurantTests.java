package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }

}

//package kr.co.fastcampus.eatgo.domain;
//
//import org.junit.Test;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.*;
//
//public class RestaurantRepositoryImplTest {
//    @Test
//    public void save() {
//        RestaurantRepository repository = new RestaurantRepositoryImpl();
//
//        int oldCount = repository.findAll().size();
//
//        Restaurant restaurant = new Restaurant("BeRyong", "Busan");
//        repository.save(restaurant);
//
//        assertThat(restaurant.getId(), is(1234L));
//
//        int newCount = repository.findAll().size();
//
//        assertThat(newCount - oldCount, is(1));
//    }
//}