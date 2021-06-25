package com.example.demo.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.order.model.TblOrder;
import com.example.demo.order.model.TblOrderItemMeta;

public interface OrderRepository4 extends JpaRepository<TblOrderItemMeta, Long> {

}
