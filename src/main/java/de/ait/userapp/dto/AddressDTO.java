package de.ait.userapp.dto;

import de.ait.userapp.models.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Schema(name = "Address", description = "Адрес пользователя системы")
public class AddressDTO {
    @Schema(description = "id адреса", example = "234")
    private Long id;
    @Schema(description = "страна", example = "Germany")
    private String country;
    @Schema(description = "почтовый индекс", example = "215444")
    private String zipCode;
    @Schema(description = "город", example = "Berlin")
    private String city;
    @Schema(description = "улица", example = "Центральная")
    private String street;
    @Schema(description = "номер дома", example = "25А")
    private String house;

    public static AddressDTO from(Address address) {
        return AddressDTO.builder()
                .id(address.getId())
                .country(address.getCountry())
                .zipCode(address.getZipCode())
                .city(address.getCity())
                .street(address.getStreet())
                .house(address.getHouse())
                .build();
    }

    public static List <AddressDTO> from(List<Address> addresses) {
        return addresses.stream().map(AddressDTO::from).collect(Collectors.toList());
    }

}
