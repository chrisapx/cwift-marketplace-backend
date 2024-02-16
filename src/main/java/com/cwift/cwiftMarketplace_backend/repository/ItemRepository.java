package com.cwift.cwiftMarketplace_backend.repository;

import com.cwift.cwiftMarketplace_backend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findBySku ( String sku );

    String deleteBySku ( String sku );
    List<Item> findByNameIn(List<String> names);
}
