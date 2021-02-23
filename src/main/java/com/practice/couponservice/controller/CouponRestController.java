package com.practice.couponservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.couponservice.model.Coupon;
import com.practice.couponservice.repository.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
	private static Logger logger=LoggerFactory.getLogger(CouponRestController.class);

	@Autowired
	CouponRepo repo;

	@PostMapping(value = "/coupons")
	public Coupon create(@RequestBody Coupon coupon) {

		return repo.save(coupon);

	}

	@GetMapping(value = "/coupons/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		System.out.println("Server 2");
		logger.info("Slueth Test in Coupon service");
		return repo.findByCode(code);

	}
}

