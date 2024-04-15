package de.ait.userapp.service.impl;

import de.ait.userapp.dto.AddressDTO;
import de.ait.userapp.models.Address;
import de.ait.userapp.repositories.AddressRepository;
import de.ait.userapp.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    @Override
    public List<AddressDTO> getAllAdresses() {
        return AddressDTO.from(addressRepository.findAll());
    }

    @Override
    public Address getAdressById(int id) {
        return addressRepository.findAll().stream()
                .filter(address -> address.getId().equals(id)).findAny().get();
    }

    @Override
    public List<AddressDTO> getAdressByCountry(String country) {
        return List.of();
    }

    @Override
    public List<AddressDTO> getAdressByCity(String city) {
        return List.of();
    }

    @Override
    public List<AddressDTO> getAddressesByCityAndStreet(String city, String street) {
        return List.of();
    }

    @Override
    public AddressDTO createAddress(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public void deleteAddressById(int id) {

    }

    @Override
    public AddressDTO updateAddress(int id, AddressDTO addressDTO) {
        return null;
    }
}
