package com.portfolio.tracker.backend;

import com.portfolio.tracker.backend.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PortfolioTrackerApplicationTests {

    @Autowired
    private StockService stockService;

    @Test
    public void contextLoads() {
        assertNotNull(stockService);
    }
}
