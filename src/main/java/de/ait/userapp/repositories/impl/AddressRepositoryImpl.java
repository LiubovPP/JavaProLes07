package de.ait.userapp.repositories.impl;

import de.ait.userapp.models.Address;
import de.ait.userapp.repositories.AddressRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressRepositoryImpl implements AddressRepository {
    @Override
    public List<Address> findAll() {
        return List.of();
    }
}
