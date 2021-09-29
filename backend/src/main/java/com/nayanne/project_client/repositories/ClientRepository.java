package com.nayanne.project_client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nayanne.project_client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
