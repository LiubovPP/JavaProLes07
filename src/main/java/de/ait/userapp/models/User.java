package de.ait.userapp.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@Schema(name = "UserClass", description = "Пользователь системы")
@Data
public class User {
    @Schema(description = "id пользователя", example = "234")
    private Long id;
    @Schema(description = "имя пользователя", example = "andy")
    private String name;
    @Schema(description = "пароль", example = "j!uew773")
    private String password;
    @Schema(description = "email пользователя", example = "andy@mail.com")
    private String email;
    @Schema(description = "возраст пользователя", example = "43")
    private int age;
}