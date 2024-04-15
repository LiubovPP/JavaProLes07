package de.ait.userapp.models;

import de.ait.userapp.dto.AddressDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Schema(name = "AddressClass", description = "Адрес пользователя системы")
@Data

public class Address {
    @Schema(description = "id пользователя", example = "234")
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




}
