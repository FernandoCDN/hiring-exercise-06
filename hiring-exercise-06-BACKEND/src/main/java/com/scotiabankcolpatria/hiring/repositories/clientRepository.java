package com.scotiabankcolpatria.hiring.repositories;

import com.scotiabankcolpatria.hiring.models.clientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<clientModel, Long>
{
    @Query(value = "select * from clients c where c.identification = :idclient", nativeQuery = true)
    clientModel findByidentification(String idclient);
}
