package de.ait.userapp.сontrollers;

import de.ait.userapp.dto.AddressDTO;
import de.ait.userapp.dto.AddressNewDto;
import de.ait.userapp.models.Address;
import de.ait.userapp.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
@Tags(value = {@Tag(name = "Адреса", description = "Операции с адресами"), @Tag(name = "Addresses", description = "Address operation")})


public class AddressController {
    private final AddressService addressService;

    //GET \addresses - вывести все адреса
    @Operation(summary = "Получение всех адресов", description = "Список всех адресов. Доступно администратору")
    @GetMapping
    public List<AddressDTO> getAddresses() {
        return addressService.getAllAdresses();
    }
    @Operation(summary = "Получение адреса по id", description = "адрес по id. Доступно администратору")
    //GET \addresses\id - вывести адресс с заданным id
    @GetMapping("/{id}")
    public Address getAddress(@PathVariable int id) {
        return addressService.getAdressById(id);
    }
    @Operation(summary = "Получение всех адресов по названию страны", description = "Список адресов в стране. Доступно администратору")
    //GET \addresses?country=usa - вывести все адресса в заданной стране (в нащем примере usa)
    @GetMapping(params = "country")
    public List<AddressDTO> getAddressesByCountry(@RequestParam String country) {
        return addressService.getAdressByCountry(country);
    }

    //GET \addresses?city=berlin - вывести все адресса в заданном городе (в нащем примере berlin)
    @GetMapping(params = "city")
    public List<AddressDTO> getAddressesByCity(@RequestParam String city) {
        return addressService.getAdressByCity(city);
    }

//GET \addresses?city=berlin&&street=potsda - вывести все адресса в заданном городе на улицах, которые содержат заданную подстроку
@GetMapping(params = {"city", "street"})
public List<AddressDTO> getAddressesByCityAndStreet(@RequestParam String city, @RequestParam String street) {
    return addressService.getAddressesByCityAndStreet(city, street);
}

//POST\address - создать новый адресс
@Operation(summary = "новый адрес", description = "доступно пользователю")
@PostMapping
public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO) {
    AddressDTO createdAddress = addressService.createAddress(addressDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdAddress);
}
    @Operation(summary = "удаление адреса по id", description = "доступно администратору")
//DELETE\address\id - удалить адрес
@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteAddress(@PathVariable int id) {
    addressService.deleteAddressById(id);
    return ResponseEntity.noContent().build();
}

//PUT\address\id - изменить адрес
@PutMapping("/{id}")
public ResponseEntity<AddressDTO> updateAddress(@PathVariable int id, @RequestBody AddressDTO addressDTO) {
    AddressDTO updatedAddress = addressService.updateAddress(id, addressDTO);
    return ResponseEntity.ok(updatedAddress);
}
}
