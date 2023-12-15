package com.himanshu.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private APIDataService apiDataService;

    @Scheduled(fixedRate = 60000)
    public void fetchDataAndSave() {
        apiDataService.fetchDataAndSaveToDatabase();
    }
}