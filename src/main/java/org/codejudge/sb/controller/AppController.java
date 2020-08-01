package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import org.codejudge.sb.model.NumbersWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @ApiOperation("Add Two Numbers")
    @RequestMapping(value= {"/api/add"}, method = RequestMethod.POST, produces="application/json",
    consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Integer> addTwoNumbers(@RequestBody NumbersWrapper numberWrapper) {
    	
    	int sum = numberWrapper.getNumber1() + numberWrapper.getNumber2();
    	   	
        return new ResponseEntity<Integer>(sum, HttpStatus.OK);
    }

}
