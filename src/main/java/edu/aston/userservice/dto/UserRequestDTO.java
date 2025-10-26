package edu.aston.userservice.dto;

public class UserRequestDTO {
    private final String name;
    private final String email;
    private final Integer age;

    public UserRequestDTO(final String name, final String email, final int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getAge() {
        return this.age;
    }
}
