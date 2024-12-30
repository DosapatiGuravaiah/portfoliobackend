package com.portfolio.tracker.backend.repository;

import com.portfolio.tracker.backend.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
