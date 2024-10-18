package com.example.Maddy.repository;

import com.example.Maddy.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address ,Long> {
}
