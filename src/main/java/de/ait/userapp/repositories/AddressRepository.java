package de.ait.userapp.repositories;

import de.ait.userapp.models.Address;

import java.util.List;

public interface AddressRepository {
    List<Address> findAll();
}
