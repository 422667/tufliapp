package com.example.demo.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.order.model.TblOrder;
import com.example.demo.order.model.TblOrderAddr;

public interface OrderRepository2 extends JpaRepository<TblOrderAddr, Long> {

}
