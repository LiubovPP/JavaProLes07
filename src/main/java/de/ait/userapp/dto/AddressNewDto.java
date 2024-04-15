package de.ait.userapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Schema(name = "New Address", description = "Адрес пользователя системы")
public class AddressNewDto {

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
