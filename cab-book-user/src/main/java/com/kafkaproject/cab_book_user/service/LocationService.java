package com.kafkaproject.cab_book_user.service;


@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}