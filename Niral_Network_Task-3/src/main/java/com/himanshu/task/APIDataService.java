package com.himanshu.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIDataService {

    @Autowired
    private APIDataRepository apiDataRepository;

    public void fetchDataAndSaveToDatabase() {
        String apiUrl ="https://api.themoviedb.org/3/movie/";

        // Make GET request to external API
        RestTemplate restTemplate = new RestTemplate();
        APIData apiData = restTemplate.getForObject(apiUrl, APIData.class);

        // Save the received data to the database
        if (apiData != null) {
            apiDataRepository.save(apiData);
        }
    }
}