package com.scotiabankcolpatria.hiring.repositories;


import com.scotiabankcolpatria.hiring.models.productModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<productModel, Integer>
{


    productModel findAllById(Integer idproduct);
}
