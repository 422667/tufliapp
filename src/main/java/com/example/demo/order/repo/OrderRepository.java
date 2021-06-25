package com.example.demo.order.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.order.model.TblOrder;

public interface OrderRepository extends JpaRepository<TblOrder, Long> {

	
	
	

	public static final String FIND_ORDER_LINE_ITEMS = "SELECT a.CODE, a.OWNER_PROLE_CODE,a.ORDER_TYPE,a.STATUS,b.item_name,b.entity_prole_code,b.create_prole_code,b.create_time FROM `tbl_order_item` b INNER JOIN tbl_order a ON a.record_id = b.order_id WHERE b.entity_prole_code IS NOT NULL AND a.CODE=?1 ORDER BY b.create_time DESC";
	@Query(value = FIND_ORDER_LINE_ITEMS, nativeQuery = true)
	public List<Object[]> findorder_line_items(@Param("keyword") String keyword);
	
	public static final String FIND_ORDER_LINE_ITEMS_ALL = "SELECT a.CODE, a.OWNER_PROLE_CODE,a.ORDER_TYPE,a.STATUS,b.item_name,b.entity_prole_code,b.create_prole_code,b.create_time FROM `tbl_order_item` b INNER JOIN tbl_order a ON a.record_id = b.order_id WHERE b.entity_prole_code IS NOT NULL ORDER BY b.create_time DESC";
	@Query(value = FIND_ORDER_LINE_ITEMS_ALL, nativeQuery = true)
	public List<Object[]> findorder_line_items_all();
	
}
