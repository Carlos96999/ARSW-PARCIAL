package eci.arsw.covidanalyzer;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.CovidPersistence;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;

import java.util.logging.Level;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidAggregateController {
    ICovidAggregateService covidAggregateService;
    
    @Autowired
    CovidPersistence persistence;

    //TODO: Implemente todos los metodos POST que hacen falta.

    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> addTruePositiveResult(Result result) {
        //TODO
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
    		persistence.aggregateResult(result, ResultType.TRUE_POSITIVE);
    		return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> addTrueNegativeResult(Result result) {
        //TODO
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
    		persistence.aggregateResult(result, ResultType.TRUE_NEGATIVE);
    		return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> addFalsePositiveResult(Result result) {
        //TODO
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
    		persistence.aggregateResult(result, ResultType.FALSE_POSITIVE);
    		return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> addFalseNegativeveResult(Result result) {
        //TODO
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
    		persistence.aggregateResult(result, ResultType.FALSE_NEGATIVE);
    		return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //TODO: Implemente todos los metodos GET que hacen falta.

    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity<?> getTruePositiveResult() {
    	ResultType result = ResultType.TRUE_POSITIVE;
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return new ResponseEntity<>(persistence.getResult(result), HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.GET)
    public ResponseEntity<?> getTrueNegativeResult() {
    	ResultType result = ResultType.TRUE_NEGATIVE;
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return new ResponseEntity<>(persistence.getResult(result), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.GET)
    public ResponseEntity<?> getFalsePositiveResult() {
    	ResultType result = ResultType.FALSE_POSITIVE;
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return new ResponseEntity<>(persistence.getResult(result), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.GET)
    public ResponseEntity<?> getFalseNegativeResult() {
    	ResultType result = ResultType.FALSE_NEGATIVE;
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return new ResponseEntity<>(persistence.getResult(result), HttpStatus.ACCEPTED);
    }

    //TODO: Implemente el método.

    @RequestMapping(value = "/covid/result/persona/{id}", method = RequestMethod.PUT)
    public ResponseEntity savePersonaWithMultipleTests() {
        //TODO
        covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return null;
    }
    
}