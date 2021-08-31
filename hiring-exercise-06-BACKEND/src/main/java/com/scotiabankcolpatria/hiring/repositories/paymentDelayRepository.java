package com.scotiabankcolpatria.hiring.repositories;

import com.scotiabankcolpatria.hiring.models.paymentDelayModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface paymentDelayRepository extends JpaRepository<paymentDelayModel, Long>
{
    @Query(value = "select * from paymentdelays p where p.idproduct = :idproduct and p.idclient = :idclient", nativeQuery = true)
    List<paymentDelayModel> findAllByProduct(Integer idproduct, String idclient);

    @Query(value = "select * from paymentdelays p where p.idproduct = :idproduct", nativeQuery = true)
    List<paymentDelayModel> findAllByProduct(Integer idproduct);


    @Query(value = "select * from paymentdelays p where p.idclient = :idclient", nativeQuery = true)
    List<paymentDelayModel> findAllByClient(String idclient);
}
