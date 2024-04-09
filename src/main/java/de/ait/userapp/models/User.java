package de.ait.userapp.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class User {
    private Long id;
    private String name;
    private String password;
    private String email;
    private int age;
}
