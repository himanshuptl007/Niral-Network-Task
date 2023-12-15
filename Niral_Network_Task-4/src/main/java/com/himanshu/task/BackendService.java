package com.himanshu.task;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BackendService {

    @Async
    public CompletableFuture<String> performAsyncOperation() {
        // Simulate an asynchronous operation, e.g., fetching data from an external API
        try {
            Thread.sleep(5000); // Simulating a time-consuming operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Return the result
        return CompletableFuture.completedFuture("Async operation completed");
    }
}
