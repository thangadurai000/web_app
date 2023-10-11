package com.oasys.Bank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Bank.BankApplication;

import bankSerivse.bankSerivse;


@RestController
@RequestMapping("/bank")
public class bankControllor {
@PostMapping (value="chack/{a}")
public String forchack(@PathVariable String a) {
	return a;
}
@Autowired bankSerivse bankres; 
@PostMapping (value="/insert")
public String insertlist(@RequestBody List<BankApplication> detail) {
	return bankres.insertlist(detail);
	
}
}

