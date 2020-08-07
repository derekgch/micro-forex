package com.forex.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.forex.forex.entity.ForexValue;


public interface ForexRepository extends JpaRepository<ForexValue, Integer> {
    ForexValue findByFromAndTo(String from, String to);
}

