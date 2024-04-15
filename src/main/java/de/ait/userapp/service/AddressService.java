package de.ait.userapp.service;

import de.ait.userapp.dto.AddressDTO;
import de.ait.userapp.dto.UserResponseDTO;
import de.ait.userapp.models.Address;
import de.ait.userapp.models.User;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAllAdresses();

    Address getAdressById(int id);

    List<AddressDTO> getAdressByCountry(String country);

    List<AddressDTO> getAdressByCity(String city);

    List<AddressDTO> getAddressesByCityAndStreet(String city, String street);

    AddressDTO createAddress(AddressDTO addressDTO);

    void deleteAddressById(int id);

    AddressDTO updateAddress(int id, AddressDTO addressDTO);
}
