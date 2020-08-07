package com.forex.forex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.forex.forex.entity.ForexValue;
import com.forex.forex.repository.ForexRepository;

@RestController
public class ForexController {

    @Autowired
    private ForexRepository forexRepository;

    @GetMapping("/forex-exchange/from/{from}/to/{to}")
    public ResponseEntity<ForexValue> getCurrencyExchange(@PathVariable String from, @PathVariable String to) {
        ForexValue forexValue = forexRepository.findByFromAndTo(from, to);
        return new ResponseEntity<ForexValue>(forexValue, HttpStatus.OK);
    }

}
