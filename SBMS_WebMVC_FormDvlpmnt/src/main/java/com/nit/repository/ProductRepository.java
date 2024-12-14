package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>
{

}
