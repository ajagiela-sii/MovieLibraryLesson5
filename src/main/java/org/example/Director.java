package org.example;

public record Director(String firstName, String lastName) {
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}