package com.himanshu.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BackendServiceTest {

    @Autowired
    private BackendService backendService;

    @Test
    public void testPerformAsyncOperation() throws ExecutionException, InterruptedException {
        // Perform the asynchronous operation
        CompletableFuture<String> future = backendService.performAsyncOperation();

        // Block and get the result
        String result = future.get();

        // Assert the result
        assertEquals("Async operation completed", result);
    }
}
