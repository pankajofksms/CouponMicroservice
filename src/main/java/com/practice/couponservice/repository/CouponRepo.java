package com.practice.couponservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
