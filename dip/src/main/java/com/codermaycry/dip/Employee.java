package com.codermaycry.dip;

import java.time.LocalDate;

public record Employee(String firstName, String lastName, LocalDate dateOfBirth, String email) {}
